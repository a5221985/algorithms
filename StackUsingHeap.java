import java.util.PriorityQueue;

public class StackUsingHeap {
    class Node {
        int position;
        int val;

        Node(int position, int val) {
            this.position = position;
            this.val = val;
        }
    }

    private PriorityQueue<Node> stack = new PriorityQueue<>((node1, node2) -> { return node2.position - node1.position; });
    private int topPosition = -1;

    public void push(int val) {
        Node newNode = new Node(++topPosition, val);
        stack.add(newNode);
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is Empty!!!");
        Node topNode = stack.poll();
        topPosition--;
        return topNode.val;
    }

    public boolean isEmpty() {
        return topPosition == -1;
    }

    public static void main(String[] args) {
        StackUsingHeap suh = new StackUsingHeap();
        int num = 0;
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random() * 20);
            System.out.println("Pushing: " + num);
            suh.push(num);
        }

        System.out.println("\nPopping...");
        while (!suh.isEmpty())
            System.out.println("Popped: " + suh.pop());
    }
}
