import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueueUsingRecursion {
    public void reverse(Queue<Integer> queue) {
        if (queue.size() < 2)
            return;
        int firstItem = queue.remove();
        reverse(queue);
        queue.add(firstItem);
    }

    public static void main(String[] args) {
        ReverseQueueUsingRecursion rqur = new ReverseQueueUsingRecursion();
        Queue<Integer> queue = new LinkedList<>();
        int size = 10;
        for (int i = 0; i < size; i++)
            queue.add(i);
        System.out.println(queue);
        rqur.reverse(queue);
        System.out.println(queue);
    }
}
