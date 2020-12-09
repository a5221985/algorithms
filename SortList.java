public class SortList {
    public ListNode constructList(int[] array) {
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

    public ListNode sort(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new ListNode(head.val);

        ListNode current = head;
        ListNode next = head.next;
        current.next = null;
        ListNode subList = sort(next);

        if (subList == null)
            return head;

        ListNode subListHead = subList;
        boolean isInserted = false;

        if (subListHead != null && current.val < subListHead.val) {
            current.next = subListHead;
            head = current;
            isInserted = true;
        }

        if (!isInserted)
            head = subListHead;
        while (subListHead != null && !isInserted && subListHead.next != null) {
            if (current.val > subListHead.next.val)
                subListHead = subListHead.next;
            else {
                current.next = subListHead.next;
                subListHead.next = current;
                isInserted = true;
                break;
            }   
        }

        if (subListHead != null && !isInserted && subListHead.next == null && current.val > subListHead.val) {
            subListHead.next = current;
            head = subListHead;
            isInserted = true;
        }

        if (subListHead != null && !isInserted) {
            subListHead.next = current;
            head = subList;
        }

        print(head);

        return head;
    }

    public void print(ListNode head) {
        if (head == null)
            return;
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
        SortList sl = new SortList();
        int[] array = {2, 3, 1, 8, 5, 6, 4, 7, 0, 9};
        ListNode head = sl.constructList(array);
        sl.print(head);
        ListNode sorted = sl.sort(head);
        System.out.println("Sorted List:");
        sl.print(sorted);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
