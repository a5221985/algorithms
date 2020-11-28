import java.util.PriorityQueue;

public class QueueUsingHeap {
    class Node {
        int position;
        int val;

        Node(int position, int val) {
            this.position = position;
            this.val = val;
        }
    }

    private PriorityQueue<Node> queue = new PriorityQueue<>((node1, node2) -> { return node1.position - node2.position; });
    private int tailPosition = -1;

    public void enqueue(int val) {
        Node newNode = new Node(++tailPosition, val);
        queue.add(newNode);
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is Empty!!!");
        Node frontNode = queue.poll();
        tailPosition--;
        return frontNode.val;
    }

    public boolean isEmpty() {
        return tailPosition == -1;
    }

    public static void main(String[] args) {
        QueueUsingHeap quh = new QueueUsingHeap();
        int num = 0;
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random() * 20);
            System.out.println("Enqueued: " + num);
            quh.enqueue(num);
        }

        System.out.println("\nDequeuing...");
        while (!quh.isEmpty())
            System.out.println("Dequeued: " + quh.dequeue());
    }
}
