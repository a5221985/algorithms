import java.util.*;
import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            futureList.add(service.submit(new Task()));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(futureList.get(i).get());
        }

        service.shutdown();
    }
}

class Task implements Callable<Integer> {
    private Random random = new Random();
    public Integer call() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random.nextInt();
    }
}
