public class ThreadExecutionControl {
    public static void main(String[] args) throws InterruptedException {
        NewThread nt = new NewThread("Child");
        nt.t.start();

        Thread.sleep(10000);

        System.out.println("Suspending " + nt.t.getName());
        nt.mySuspend();
        System.out.println(nt.t.getName() + ": " + nt.t.getState());

        Thread.sleep(10000);

        System.out.println("Resuming " + nt.t.getName());
        nt.myResume();
        System.out.println(nt.t.getName() + ": " + nt.t.getState());

        Thread.sleep(10000);

        System.out.println("Stopping " + nt.t.getName());
        nt.myStop();

        System.out.println(nt.t.getName() + ": " + nt.t.getState());
        nt.t.join();
    }
}

class NewThread implements Runnable {
    Thread t;
    State flag = State.RUNNING;
 
    NewThread(String name) {
        t = new Thread(this, name);
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getState() + ": " + (i++));
            
            synchronized (this) {
		try {
		    while (flag == State.SUSPENDED)
			wait();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
            }

            synchronized (this) {
	        if (flag == State.TERMINATED)
		    return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void mySuspend() {
        this.flag = State.SUSPENDED;
    }

    synchronized void myResume() {
        this.flag = State.RUNNING;
        notify();
    }

    synchronized void myStop() {
        this.flag = State.TERMINATED;
    }
}

enum State {
    RUNNING,
    SUSPENDED,
    TERMINATED
}
