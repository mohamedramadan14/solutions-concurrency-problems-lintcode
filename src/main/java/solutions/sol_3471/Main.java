package solutions.sol_3471;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static int a = 0;
    public static Lock m = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000000; i++) {
                DataConcurrentModificationProtection.func(m);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000000; i++) {
                DataConcurrentModificationProtection.func(m);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
