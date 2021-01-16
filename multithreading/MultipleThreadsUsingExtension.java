public class MultipleThreadsUsingExtension {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Child Thread 1");
        NewThread nt2 = new NewThread("Child Thread 2");
        NewThread nt3 = new NewThread("Child Thread 3");

        nt1.start();
        nt2.start();
        nt3.start();

        for (int i = 5; i >= 0; i--) {
            System.out.println(Thread.currentThread() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
        System.out.println("Exiting " + Thread.currentThread().getName());
    }
}

class NewThread extends Thread {
    NewThread(String name) {
        super(name);
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
        System.out.println("Exiting " + Thread.currentThread().getName());
    }
}
