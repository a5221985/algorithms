public class InsertionSortList {
    public ListNode generateList(int[] items) {
        if (items == null || items.length == 0)
            return null;
        ListNode list = new ListNode(items[0]);
        ListNode current = list;
        for (int i = 1; i < items.length; i++) {
            current.next = new ListNode(items[i]);
            current = current.next;
        }
        return list;
    }

    public void print(ListNode list) {
        System.out.println("list");
        if (list == null) {
            System.out.println("Empty List");
            return;
        }
        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode sort(ListNode list) {
        if (list == null || list.next == null)
            return list;
        ListNode p = list;
        ListNode q = list;
        ListNode head = list;
	while (p != null && p.next != null) {
	    if (p.next.val <= q.val) {
		ListNode temp = p;
		head = temp.next;
		temp.next = temp.next.next;
		head.next = q;
            } else if (p.next.val >= p.val) {
                p = p.next;
	    } else {
		while (q != null && q != p.next) {
		    if (p != null && p.next != null && p.next.val > q.val && q != null && q.next != null && q.next.val >= p.next.val) {
                        ListNode temp = p;
                        ListNode holder = p.next;
                        temp.next = temp.next.next;
                        holder.next = q.next;
                        q.next = holder;
                        break;
                    }
		    q = q.next;
		}
	    }
            q = head;
        }
        return head;
    }

    public static void main(String[] args) {
        InsertionSortList isl = new InsertionSortList();
        int[] items = {2, 4, 1, 6, 9, 3, 0, 6, 5, 7, 8};
        ListNode list = isl.generateList(items);
        isl.print(list);
        ListNode sorted = isl.sort(list);
        isl.print(sorted);

        int[] items1 = new int[0];
        ListNode list1 = isl.generateList(items1);
        isl.print(list1);
        ListNode sorted1 = isl.sort(list1);
        isl.print(sorted1);

        int[] items2 = {2, 2, 2, 2, 2, 2, 2};
        ListNode list2 = isl.generateList(items2);
        isl.print(list2);
        ListNode sorted2 = isl.sort(list2);
        isl.print(sorted2);

        int[] items3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ListNode list3 = isl.generateList(items3);
        isl.print(list3);
        ListNode sorted3 = isl.sort(list3);
        isl.print(sorted3);

        int size = 10000;
        int[] items4 = new int[size];
        for (int i = 0; i < items4.length; i++) {
            items4[i] = (int) (Math.random() * items4.length);
        }
        ListNode list4 = isl.generateList(items4);
        isl.print(list4);
        ListNode sorted4 = isl.sort(list4);
        isl.print(sorted4);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
