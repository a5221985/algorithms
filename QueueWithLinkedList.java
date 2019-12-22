public class QueueWithLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node head;
    private Node tail;

    public void enqueue(T data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty())
            head = node;
        else
            tail.next = node;
        tail = node;
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        Node node = head;
        head = head.next;
        if (isEmpty())
            tail = null;
        T data = node.data;
        node = null;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        QueueWithLinkedList<Integer> queue = new QueueWithLinkedList<>();

        for (int i = 0; i < 100; i++)
            queue.enqueue(i);

        while (!queue.isEmpty())
            System.out.print(queue.dequeue() + " ");
        System.out.println();
    }
}
