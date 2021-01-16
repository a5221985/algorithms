public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        CallMe target = new CallMe();
        Caller caller1 = new Caller(target, "Hello");
        Caller caller2 = new Caller(target, "Synchronized");
        Caller caller3 = new Caller(target, "World");

        caller1.t.start();
        caller2.t.start();
        caller3.t.start();

        caller1.t.join();
        caller2.t.join();
        caller3.t.join();
    }
}

class Caller implements Runnable {
    CallMe target;
    Thread t;
    String msg;
    
    Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

class CallMe {
    synchronized public void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
