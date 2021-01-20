import java.util.concurrent.*;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);

        new Thread(new NewThread("A", phaser)).start();
        new Thread(new NewThread("B", phaser)).start();
        new Thread(new NewThread("C", phaser)).start();

        int phaseNo = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phaseNo + " completed.");

        phaseNo = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phaseNo + " completed.");

        phaseNo = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phaseNo + " completed.");


        phaser.arriveAndDeregister();
        if (phaser.isTerminated())
            System.out.println("All phases completed.");
    }
}

public class NewThread implements Runnable {
    private String name;
    private Phaser phaser;

    public NewThread(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Beginning the phase by " + name);
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }

        System.out.println("Beginning the phase by " + name);
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }

        System.out.println("Beginning the phase by " + name);
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }

        phaser.arriveAndDeregister();
    }
}
