import java.util.concurrent.*;

public class CustomPhaser {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 3);
        
        new Thread(new NewThread("A", phaser)).start();
        new Thread(new NewThread("B", phaser)).start();
        new Thread(new NewThread("C", phaser)).start();

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }

        phaser.arriveAndDeregister();
        System.out.println("Main thread ended.");
    }
}

public class MyPhaser extends Phaser {
    private int maxPhaseNum;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        maxPhaseNum = numPhases - 1;
    }

    @Override
    public boolean onAdvance(int p, int regParties) {
        System.out.println("Phase " + p + " completed.");

        if (p == maxPhaseNum || regParties == 0) return true;

        return false;
    }
}

public class NewThread implements Runnable {
    MyPhaser phaser;
    String name;

    public NewThread(String name, MyPhaser phaser) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }
 
    @Override
    public void run() {
        while (!phaser.isTerminated()) {
	    System.out.println("Thread " + name + " is beginning phase " + phaser.getPhase());

            phaser.arriveAndAwaitAdvance();

	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
        }

        phaser.arriveAndDeregister();
    }
}
