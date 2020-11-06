public class ReverseListWithoutLoop {
    public ListNode generateList(int[] array) {
        if (array == null || array.length == 0)
            return null;
        if (array.length == 1)
            return new ListNode(array[0]);
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }

    public void print(ListNode list) {
        if (list == null)
            return;
        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode reverse(ListNode list) {
        if (list == null || list.next == null)
            return list;
        ListNode prev = list.next;
        ListNode reversed = reverse(list.next);
        prev.next = list;
        if (list.next == prev)
            list.next = null;
        return reversed;
    }

    public static void main(String[] args) {
        ReverseListWithoutLoop rlwl = new ReverseListWithoutLoop();
        int size = 1000;
        int[] array = new int [size];
        for (int i = 0; i < size; i++)
            array[i] = i;
        ListNode list = rlwl.generateList(array);
        rlwl.print(list);
        ListNode reversed = rlwl.reverse(list);
        rlwl.print(reversed);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
