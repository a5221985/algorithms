import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("baboon");
        pq.add("jackal");
        pq.add("ass");
        pq.add("eagle");
        pq.add("cat");
        pq.add("dog");
        pq.add("goat");

        while (!pq.isEmpty())
            System.out.println(pq.poll());      
    }
}
