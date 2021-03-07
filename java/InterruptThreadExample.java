public class InterruptThreadExample implements Runnable {
    
    @Override
    public void run() {
        try {
            System.out.println("Started thread execution...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new InterruptThreadExample());
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        System.out.println("Done with execution of main");
    }
}
