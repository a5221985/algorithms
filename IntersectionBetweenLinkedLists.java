public class IntersectionBetweenLinkedLists {
    public ListNode findIntersectingNode(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return null;
        if (list1 == list2)
            return list1;
        
        ListNode current1 = list1;
        ListNode current2 = list2;
        while (current1.next != null && current2.next != null) {
            current1 = current1.next;
            current2 = current2.next;
        }

        ListNode p = null;
        ListNode q = null;
        if (current1.next == null && current2.next == null) {
            p = list1;
            q = list2;
        } else if (current2.next == null) {
            p = movePointerByDiff(current1, list1);
            q = list2;
        } else if (current1.next == null) {
            p = movePointerByDiff(current2, list2);
            q = list1;
        }

        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
 
    ListNode movePointerByDiff(ListNode current, ListNode p) {
	while (current.next != null) {
	    current = current.next;
	    p = p.next;
	}
        return p;
    }

    public static void main(String[] args) {
        IntersectionBetweenLinkedLists ibll = new IntersectionBetweenLinkedLists();
        ListNode list1 = new ListNode(1);
        ListNode current = list1;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(3);
        current = current.next;
        current.next = new ListNode(4);
        current = current.next;
        current.next = new ListNode(5);
        current = current.next;
        ListNode intersect = current;
        current.next = new ListNode(6);
        ListNode list2 = new ListNode(7);
        current = list2;
        current.next = new ListNode(8);
        current = current.next;
        current.next = intersect;
        ListNode intersectingNode = ibll.findIntersectingNode(list1, list2);
        System.out.println("Intersecting Node Value: " + intersectingNode.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
