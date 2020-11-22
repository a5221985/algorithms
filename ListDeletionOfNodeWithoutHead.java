public class ListDeletionOfNodeWithoutHead {
    public void print(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.val);
        ListNode current = node.next;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }
        System.out.println();
    }

    public void remove(ListNode node) {
        if (node == null)
            return;
        ListNode current = node;
        while (current != null && current.next != null && current.next.next != null) {
            swapValues(current, current.next);
            current = current.next;
        }
        swapValues(current, current.next);
        current.next = null;
    }

    void swapValues(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    public static void main(String[] args) {
        ListDeletionOfNodeWithoutHead ldonwh = new ListDeletionOfNodeWithoutHead();
        ListNode head = new ListNode(1);
        ListNode current = head;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(3);
        current = current.next;
        current.next = new ListNode(4);
        current = current.next;
        ListNode pointer = current;
        current.next = new ListNode(5);
        current = current.next;
        current.next = new ListNode(6);
        current = current.next;
        current.next = new ListNode(7);
        current = current.next;
        current.next = new ListNode(8);
        current = current.next;

        ldonwh.print(head);
        System.out.println("Pointer val: " + pointer.val);
        ldonwh.remove(pointer);
        ldonwh.print(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
