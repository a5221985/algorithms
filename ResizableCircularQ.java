import java.util.Arrays;

public class ResizableCircularQ {
    private Integer[] Q;
    private int size;
    private int head;
    private int tail;
    private static final int DEFAULT_SIZE = 10;

    public ResizableCircularQ() {
        this(DEFAULT_SIZE);
    }

    public ResizableCircularQ(int size) {
        Q = new Integer [size];
        this.size = size;
        head = -1;
        tail = -1;
    }

    public Boolean enqueue(Integer item) {
        if (item == null)
            return false;

        if (isFull())
            resize();

        tail = (++tail) % size;
        Q[tail] = item;

        if (head == -1)
            head = tail;

        return true;        
    }

    public Integer dequeue() {
        if (isEmpty())
            return null;

        Integer item = Q[head];
        Q[head] = null;
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = ++head % size;
        }
        return item;
    }

    Boolean isFull() {
        int n = tail - head;
        return n == -1 || n == (size - 1);
    }

    Boolean isEmpty() {
        return tail == -1;
    }

    Boolean resize() {
        Integer[] newQ = new Integer[2 * size];
        copyTo(newQ);
        Q = newQ;
        head = 0;
        tail = size - 1;
        size = 2 * size;
        return true;
    }

    Boolean copyTo(Integer[] newQ) {
        int t = head;
        int k = 0;
        while (t != tail) {
            newQ[k] = Q[t];
            k++;
            t = (++t) % size;
        }
        newQ[k] = Q[t];
        return true; 
    }

    @Override
    public String toString() {
        return Arrays.asList(Q).toString();
    }

    public static void main(String[] args) {
        ResizableCircularQ rcq = new ResizableCircularQ();

        rcq.enqueue(1);
        rcq.enqueue(2);
        rcq.enqueue(3);
        rcq.enqueue(4);
        rcq.enqueue(5);
        rcq.enqueue(6);
        rcq.enqueue(7);
        rcq.enqueue(8);
        rcq.enqueue(9);
        rcq.enqueue(10);
        rcq.enqueue(11);
        rcq.enqueue(12);

        System.out.println(rcq);

        System.out.println("DEQED: " + rcq.dequeue());        
        System.out.println("DEQED: " + rcq.dequeue());        

        rcq.enqueue(13);
        rcq.enqueue(14);
        rcq.enqueue(15);
        rcq.enqueue(16);
        rcq.enqueue(17);
        rcq.enqueue(18);
        rcq.enqueue(19);
        rcq.enqueue(20);
        rcq.enqueue(21);
        rcq.enqueue(22);

        System.out.println(rcq);

        rcq.enqueue(23);

        System.out.println(rcq);

        System.out.println("DEQED: " + rcq.dequeue());

        System.out.println(rcq);
        
        rcq.enqueue(23);
        rcq.enqueue(24);
        rcq.enqueue(25);
        rcq.enqueue(26);
        rcq.enqueue(27);
        rcq.enqueue(28);
        rcq.enqueue(29);
        rcq.enqueue(30);
        rcq.enqueue(31);
        rcq.enqueue(32);
                
        System.out.println(rcq);
     
        rcq.enqueue(33);
        rcq.enqueue(34);
        rcq.enqueue(35);
        rcq.enqueue(36);
        rcq.enqueue(37);
        rcq.enqueue(38);
        rcq.enqueue(39);
        rcq.enqueue(40);
        rcq.enqueue(41);
        rcq.enqueue(42);

        System.out.println(rcq);

        while (!rcq.isEmpty())
            System.out.println("DEQED: " + rcq.dequeue());

        System.out.println(rcq);
    }
}
