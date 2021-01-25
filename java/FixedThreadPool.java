import java.util.concurrent.*;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        CountDownLatch latch5 = new CountDownLatch(5);

        executor.execute(new MyThread("A", latch1));    
        executor.execute(new MyThread("B", latch2));    
        executor.execute(new MyThread("C", latch3));    
        executor.execute(new MyThread("D", latch4));    
        executor.execute(new MyThread("E", latch5));

        try {
            latch1.await();
            latch2.await();
            latch3.await();
            latch4.await();
            latch5.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        executor.shutdown();
        System.out.println("Done.");
    }
}

public class MyThread implements Runnable {
    private String name;
    private CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
