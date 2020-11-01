class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged = new ListNode(lists[0].val);
        ListNode currentMerged = merged;
        ListNode currentList = lists[0];
        currentList = currentList.next;
        while (currentList != null) {
            currentMerged.next = new ListNode(currentList.val);
            currentMerged = currentMerged.next;
            currentList = currentList.next;
        }

        ListNode p = null;
        for (int i = 1; i < lists.length; i++) {
	    currentList = lists[i];
	    while (currentList != null) {
		p = merged;
		if (p != null && p.val >= currentList.val) {
		    ListNode newNode = new ListNode(currentList.val);
		    newNode.next = merged;
		    merged = newNode;
		} else {
		    boolean inserted = false;
		    while (p != null && p.next != null) {
			if (p.val <= currentList.val && p.next.val > currentList.val) {
			    ListNode newNode = new ListNode(currentList.val);
			    newNode.next = p.next;
			    p.next = newNode;
			    p = p.next;
			    inserted = true;
			    break;
			}
			p = p.next;
		    }
		    if (!inserted && p != null && p.val <= currentList.val) {
			ListNode newNode = new ListNode(currentList.val);
			p.next = newNode;
			p = p.next;
		    }
		}
		currentList = currentList.next;
	    }
        }

        return merged;
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
        ListNode[] lists = new ListNode [5];
        ListNode list0 = new ListNode(1);
        ListNode current = list0;
        current.next = new ListNode(4);
        current = current.next;
        current.next = new ListNode(5);

        ListNode list1 = new ListNode(1);
        current = list1;
        current.next = new ListNode(3);
        current = current.next;
        current.next = new ListNode(4);

        ListNode list2 = new ListNode(2);
        current = list2;
        current.next = new ListNode(6);
       
        ListNode list3 = new ListNode(6);
        current = list3;
        current.next = new ListNode(8);
        current = current.next;
        current.next = new ListNode(10);

        ListNode list4 = new ListNode(9);
        current = list4;
        current.next = new ListNode(12);
        current = current.next;
        current.next = new ListNode(15);

        lists[0] = list0;
        lists[1] = list1;
        lists[2] = list2;
        lists[3] = list3;
        lists[4] = list4;

        MergeKSortedLists mksl = new MergeKSortedLists();
        ListNode merged = mksl.mergeKLists(lists);

        mksl.print(merged);
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
