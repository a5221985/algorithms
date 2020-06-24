public class VolatileExample {
    private static boolean flag = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable () {
            @Override
            public void run() {
                System.out.println("Started: " + Thread.currentThread());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                VolatileExample.flag = false;
            }
        });

        Thread thread2 = new Thread(new Runnable () {
            @Override
            public void run() {
                System.out.println("Started: " + Thread.currentThread());
                while (VolatileExample.flag) {
                    System.out.println(VolatileExample.flag);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting main thread");
    }
}
