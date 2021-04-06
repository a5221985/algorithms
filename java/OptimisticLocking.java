import java.util.concurrent.atomic.AtomicInteger;

public class OptimisticLocking implements Runnable {
    private AtomicInteger ai = new AtomicInteger(10);

    @Override
    public void run() {
        int currentValue = ai.get();
        while (true) {
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
            ai.compareAndSet(currentValue, currentValue + 10);
            currentValue = ai.get();
            System.out.println(currentValue);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new OptimisticLocking());
        Thread t2 = new Thread(new OptimisticLocking());
        Thread t3 = new Thread(new OptimisticLocking());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
