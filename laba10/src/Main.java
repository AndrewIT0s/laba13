import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        ReentrantLock[] forks = new ReentrantLock[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % numPhilosophers];

            if (i == numPhilosophers - 1) {
                philosophers[i] = new Philosopher(i + 1, rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(i + 1, leftFork, rightFork);
            }
        }

        ExecutorService executorService = Executors.newFixedThreadPool(philosophers.length);

        for (Philosopher philosopher : philosophers) {
            executorService.execute(philosopher);
        }

        executorService.shutdown();
    }
}


