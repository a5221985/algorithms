import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            int id = i;
            threadPool.submit(() -> {
                System.out.println(id);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            });
        }
        Thread.sleep(100);
    }
}
