public class ChangeThreadName {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread details: " + t);
        t.setName("My Thread");
        System.out.println("Thread details: " + t);
        int counter = 5;
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
