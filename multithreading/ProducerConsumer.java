public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
 
        p.t.start();
        c.t.start();

        p.t.join();
        c.t.join();
    }
}

class Q {
    private int n;
    private boolean isValueSet = false;
    
    synchronized int get() {
        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Got: " + n);
        isValueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.n = n;
        isValueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
} 

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
