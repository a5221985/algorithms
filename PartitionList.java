public class PartitionList {
    public ListNode partition(ListNode head, int k) {
        ListNode current = head;
        ListNode leftHead = null;
        ListNode leftTail = null;
        ListNode rightHead = null;
        ListNode rightTail = null;
        while (current != null) {
            if (current.val < k) {
                if (leftHead == null) {
                    leftHead = current;
                    leftTail = leftHead;
                    current = current.next;
                    leftTail.next = null;
                } else {
                    leftTail.next = current;
                    current = current.next;
                    leftTail = leftTail.next;
                    leftTail.next = null;
                }
            } else {
                if (rightHead == null) {
                    rightHead = current;
                    rightTail = rightHead;
                    current = current.next;
                    rightTail.next = null;
                } else {
                    rightTail.next = current;
                    current = current.next;
                    rightTail = rightTail.next;
                    rightTail.next = null;
                }
            }
        }

        ListNode newHead = leftHead;
        leftTail.next = rightHead;
        return newHead;
    }

    public void print(ListNode head) {
        ListNode current = head;
        System.out.print(current.val);
        current = current.next;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PartitionList pl = new PartitionList();

        ListNode head = new ListNode(5);
        ListNode current = head;
        current.next = new ListNode(1);
        current = current.next;
        current.next = new ListNode(8);
        current = current.next;
        current.next = new ListNode(0);
        current = current.next;
        current.next = new ListNode(3);
        current = current.next;

        pl.print(head);

        int k = 3;
        ListNode newHead = pl.partition(head, k);

        pl.print(newHead);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
