import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3, new BarrierAction());

        Thread t1 = new Thread(new ThreadExample("A", barrier));
        Thread t2 = new Thread(new ThreadExample("B", barrier));
        Thread t3 = new Thread(new ThreadExample("C", barrier));
        Thread t4 = new Thread(new ThreadExample("D", barrier));
        Thread t5 = new Thread(new ThreadExample("E", barrier));
        Thread t6 = new Thread(new ThreadExample("F", barrier));
        Thread t7 = new Thread(new ThreadExample("G", barrier));
        Thread t8 = new Thread(new ThreadExample("H", barrier));
        Thread t9 = new Thread(new ThreadExample("I", barrier));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
    }
}

public class BarrierAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Barrier reached");
    }
}

public class ThreadExample implements Runnable {
    private String name;
    private CyclicBarrier barrier;

    public ThreadExample(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            barrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
