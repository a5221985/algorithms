import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
    public List<ListNode> reverse(ListNode list) {
        if (list == null)
            return new ArrayList<>();
        if (list.next == null)
            return new ArrayList<>(Arrays.asList(list, list));
        if (list.next.next == null) {
            ListNode newList = new ListNode(list.next.val);
            newList.next = list;
            return new ArrayList<>(Arrays.asList(newList, list));
        }
        ListNode p = list;
        ListNode q = list.next;
        ListNode r = list.next.next;
        ListNode head = null;
        ListNode tail = list;
        tail.next = null;
        while (q != null) {
            q.next = p;
            p = q;
            q = r;
            if (r != null)
                r = r.next;           
        }
        head = p;
        return new ArrayList<>(Arrays.asList(head, tail));
    }

    public ListNode reverse(ListNode list, int k) {
        if (k == 0)
            return list;
        if (k == 1)
            return reverse(list).get(0);
        if (list.next == null)
            return list;
        ListNode head = null;
        ListNode p = list;
        ListNode q = p;
        ListNode r = p;
        int count = k;
        boolean isFirstList = true;
        while (q != null) {
	    while (count > 1) {
                if (r.next == null)
                    break;
		r = r.next;
		count--;
	    }   
	    q = r;
	    r = r.next;
            q.next = null;
	    if (isFirstList)
                q = p;
            else
                q = p.next;
	    List<ListNode> reversed = reverse(q);
	    reversed.get(1).next = r;
	    if (isFirstList) {
		isFirstList = false;
	        head = reversed.get(0);
	    } else
		p.next = reversed.get(0);
	    p = reversed.get(1);
	    q = p.next;
	    r = q;
            count = k;
        }
        return head;
    }

    public ListNode constructList(int[] items) {
        ListNode list = new ListNode(items[0]);
        ListNode current = list;
        for (int i = 1; i < items.length; i++) {
            current.next = new ListNode(items[i]);
            current = current.next;
        }
        return list;
    }

    public void print(ListNode list) {
        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        int[] items = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ListNode list = rl.constructList(items);
        rl.print(list);

        List<ListNode> reversed = rl.reverse(list);
        rl.print(reversed.get(0));
        
        ListNode list2 = rl.constructList(items);
        rl.print(list2);

        int k = 5;
        ListNode reversedKAtATime = rl.reverse(list2, k);
        rl.print(reversedKAtATime);
    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) { this.val = val; }
}
