class MyThread extends Thread {
    private static final Object lock = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName());
                lock.notify();
                try {
                    if (i < 4) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class zad2 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Поток 1");
        thread2.setName("Поток 2");

        thread1.start();
        thread2.start();

        synchronized (MyThread.class) {
            MyThread.class.notify();
        }
    }
}
