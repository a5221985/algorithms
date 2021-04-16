import java.util.concurrent.atomic.AtomicInteger;

public class NoLockSynchronization {
    private static AtomicInteger counter = new AtomicInteger(0);

    public void update() {
        while (true) {
            int actual = counter.get();
            int newValue = actual + 1;
            while (!counter.compareAndSet(actual, newValue));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NoLockSynchronization nls = new NoLockSynchronization();
        Thread t1 = new Thread(() -> {
            nls.update();
        });
        Thread t2 = new Thread(() -> {
            nls.update();
        });
        Thread t3 = new Thread(() -> {
            nls.print();
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
