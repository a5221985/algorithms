public class RotateList {
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

    public ListNode rotate(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode p = head;
        ListNode q = head;
        int distance = 0;
        while (distance < k) {
            if (q == null)
                break;
            q = q.next;
            distance++;
        }

        if (distance < k) {
            k = k % distance;
        }

        if (k == 0)
            return head;

        int temp = 0;
        if (distance == 2) {
            temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            return head;
        }

        q = head;
        distance = 0;
        while (distance < k) {
            q = q.next;
            distance++;
        }

        if (q == null || q.next == null)
            return head;

        while (q.next != null) {
            q = q.next;
            p = p.next;
        }

        q.next = head;
        head = p.next;
        p.next = null;
        return head;
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();
        int[] array = {1, 2, 3, 4, 5};

        ListNode head = rl.constructList(array);
        rl.print(head);

        int k = 6;
        head = rl.rotate(head, k);
        rl.print(head);        
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
