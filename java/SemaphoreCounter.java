import java.util.concurrent.*;

public class SemaphoreCounter {
    public static void main(String[] args) throws InterruptedException {
        SemaphoreCounter sc = new SemaphoreCounter();
        Counter counter = new Counter();
        Thread thread1 = new Thread(new Logic(counter));
        Thread thread2 = new Thread(new Logic(counter));
 
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

public class Logic implements Runnable {
    private Counter counter;

    public Logic(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
	while (true) {
	    System.out.println(Thread.currentThread() + ":" + counter.increment());
	    try {
                Thread.sleep((int) (Math.random() * 1000));
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}

public class Counter {
    private int counter = 0;
    private Semaphore semaphore = new Semaphore(1);

    public int increment() {
	int val = 0;
	try {
	    semaphore.acquire();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	val = counter++;
	semaphore.release();
	return val;
    }
}
