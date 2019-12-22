public class QueueWithArray<T> {
    public static final int DEFAULT_SIZE = 10;
    private T[] queue = (T[]) new Object[DEFAULT_SIZE];
    private int head = -1;
    private int tail = -1;
    private int size = 0;

    public void enqueue(T data) {
        if (isFull())
            resize(queue.length * 2);
        tail = (tail + 1) % queue.length;
        queue[tail] = data;
        if (isEmpty())
            head = tail;
        size++;
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        T data = queue[head];
        if (isLastElement())
            reset();
        else
            head = (head + 1) % queue.length;
        size--;
//        if (isVeryLowSize())
//            resize(queue.length / 2);
        return data;
    }

    boolean isVeryLowSize() {
        return size < queue.length / 4;
    }

    boolean isLastElement() {
        return head != -1 && head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % queue.length == head;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void resize(int length) {
        T[] newQueue = (T[]) new Object[length];
        copy(newQueue);
        head = 0;
        tail = queue.length - 1;
        queue = null;
        queue = newQueue;
    }

    public void copy(T[] newQueue) {
        int i = 0;
        int j = head;
        while (j != tail) {
            j = (j + 1) % queue.length;
            newQueue[i++] = queue[j];
        }
        if (j == tail)
            newQueue[i] = queue[j];
    }

    public void reset() {
        head = -1;
        tail = -1;
    }

    public static void main(String[] args) {
        QueueWithArray<Integer> queue = new QueueWithArray<>();

        for (int i = 0; i < 10000; i++)
            queue.enqueue(i);

        while (!queue.isEmpty())
            System.out.print(queue.dequeue() + " ");
        
        System.out.println();

        QueueWithArray<String> queueS = new QueueWithArray<>();

        queueS.enqueue("one");
        queueS.enqueue("two");
        queueS.enqueue("three");
        queueS.enqueue("four");
        queueS.enqueue("five");
        queueS.enqueue("six");
        queueS.enqueue("seven");
        queueS.enqueue("eight");
        queueS.enqueue("nine");
        queueS.enqueue("ten");
        queueS.enqueue("eleven");
        queueS.enqueue("twelve");
        queueS.enqueue("thirteen");
        queueS.enqueue("fourteen");
        queueS.enqueue("fifteen");
        queueS.enqueue("sixteen");
        queueS.enqueue("seventeen");
        queueS.enqueue("eighteen");
        queueS.enqueue("nineteen");
        queueS.enqueue("twenty");

        while (!queueS.isEmpty())
            System.out.println(queueS.dequeue() + " ");

        System.out.println();
    }
}
