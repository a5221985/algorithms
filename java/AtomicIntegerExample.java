import java.util.concurrent.atomic.*;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        new Thread(new NewThread("A")).start();
        new Thread(new NewThread("B")).start();
        new Thread(new NewThread("C")).start();
        new Thread(new NewThread("D")).start();
    }
}

public class Shared {
    public static AtomicInteger ai = new AtomicInteger(0);
}

public class NewThread implements Runnable {
    private String name;

    public NewThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println(name + ": " + Shared.ai.getAndSet(i));
    }
}
