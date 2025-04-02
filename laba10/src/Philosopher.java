import java.util.concurrent.locks.Lock;
import java.util.Random;

public class Philosopher implements Runnable {
    private int id;
    private final Lock leftFork;
    private final Lock rightFork;
    private final Random random;
    private static final int MAX_EATING = 100;
    private static int eatingCount = 0;
    private static final Object eatingMonitor = new Object();
    private int mealsEaten = 0;

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.random = new Random();
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " размышляет.");
        Thread.sleep(random.nextInt(100));
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест.");
        Thread.sleep(random.nextInt(100));
        mealsEaten++;
    }

    public int getMealsEaten() {
        return mealsEaten;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (System.currentTimeMillis() - startTime >= 1500) {
                    System.out.println("Философ " + id + " завершил выполнение. Всего приемов пищи: " + mealsEaten);
                    break;
                } else {
                    System.out.println("ID: " + id + ", счетчик: " + mealsEaten);
                }

                think();
                synchronized (eatingMonitor) {
                    while (eatingCount >= MAX_EATING) {
                        System.out.println("Философ " + id + " ожидает, так как количество философов, которые едят, равно: " + eatingCount);
                        eatingMonitor.wait();
                    }
                    eatingCount++;
                    System.out.println("Философ " + id + " начинает есть. Текущее количество философов, которые едят: " + eatingCount);
                }

                leftFork.lock();
                try {
                    rightFork.lock();
                    try {
                        eat();
                    } finally {
                        rightFork.unlock();
                    }
                } finally {
                    leftFork.unlock();
                }
                synchronized (eatingMonitor) {
                    eatingCount--;
                    System.out.println("Философ " + id + " закончил есть. Текущее количество философов, которые едят: " + eatingCount);
                    eatingMonitor.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getId() {
        return id;
    }

    public int eatingCount() {
        return mealsEaten;
    }
}