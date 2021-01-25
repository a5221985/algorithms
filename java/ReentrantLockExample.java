import java.util.concurrent.locks.*;

public class ReentrantLockExample {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new NewThread("A", lock)).start();
        new Thread(new NewThread("B", lock)).start();
    }
}

public class Shared {
    public static int count;
}

public class NewThread implements Runnable {
    private String name;
    private ReentrantLock lock;

    public NewThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(name + " waiting for lock.");
        lock.lock();
        System.out.println(name + " acquired the lock.");

        Shared.count++;
        System.out.println(name + ": " + Shared.count);

        System.out.println(name + " is sleeping next...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " is releasing the lock.");
        lock.unlock();
    }
}
