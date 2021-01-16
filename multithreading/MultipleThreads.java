public class MultipleThreads {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();

        for (int i = 5; i >= 0; i--) {
            System.out.println(Thread.currentThread() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
        System.out.println("Exiting Main Thread");
    }
}

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Child Thread");
    }

    @Override
    public void run() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(Thread.currentThread() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Exiting Child Thread");
    }
}
