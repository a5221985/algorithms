import java.util.PriorityQueue;

public class LinkedListSortUsingConstantSpace {
    public ListNode constructLinkedList(int[] array) {
        if (array == null || array.length == 0)
            return null;
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }

    public void print(ListNode node) {
        if (node == null)
            return;
        ListNode current = node;
        System.out.print(current.val);
        current = current.next;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }
        System.out.println();
    }

    public ListNode sort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        PriorityQueue<ListNode> priorityQueue = performHeapSort(head);
        return buildList(priorityQueue); 
    }

    // O(n log (n))
    PriorityQueue<ListNode> performHeapSort(ListNode list) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>();
        ListNode current = list;
        ListNode next = current.next;
        while (current != null) {
            current.next = null;
            priorityQueue.add(current);
            current = next;
            if (next != null)
                next = next.next;
        }
        return priorityQueue;
    }

    ListNode buildList(PriorityQueue<ListNode> priorityQueue) {
        ListNode head = priorityQueue.remove();
        ListNode current = head;
        while (!priorityQueue.isEmpty()) {
            current.next = priorityQueue.remove();
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListSortUsingConstantSpace llsucs = new LinkedListSortUsingConstantSpace();
        int[] array = {4, 1, -3, 99};
        ListNode head = llsucs.constructLinkedList(array);
        llsucs.print(head);
        ListNode sorted = llsucs.sort(head);
        llsucs.print(sorted);
    }
}

class ListNode implements Comparable<ListNode> {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
 
    public int compareTo(ListNode other) {
        return this.val - other.val;
    }
}
