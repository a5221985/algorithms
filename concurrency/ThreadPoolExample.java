import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.CachedExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // get count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();
        // construct thre pool
        //ExecutorService service = Executors.newFixedThreadPool(10);
//        ExecutorService service = Executors.newFixedThreadPool(coreCount);
 
        // submit the tasks for execution
//        for (int i = 0; i < 100; i++) {
//            service.execute(new Task());
//        }
//        System.out.println("Thread Name: " + Thread.currentThread().getName());

//        service.shutdown();

        // for scheduling of tasks
        ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(10);

        // task to run after 10 second delay
        scheduledService.schedule(new Task(), 10, TimeUnit.SECONDS);
      
        // task to run repeatedly every 10 seconds
        scheduledService.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

        // task to run repeatedly 10 seconds after previous task completes
        scheduledService.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);

        scheduledService.shutdown();

        CachedExecutorService cachedService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            cachedService.execute(new Task());
        }

        cachedService.shutdown();
    }

    static class Task implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
