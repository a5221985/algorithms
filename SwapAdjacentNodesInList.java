public class SwapAdjacentNodesInList {

    public ListNode swapAdjacentNodes(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        head = head.next;
        boolean isOdd = true;
        while (first != null && second != null) {
            first.next = second.next;
            second.next = first;
            if (isOdd) {
                second = first.next;
            } else {
                first = first.next;
            }
            isOdd = !isOdd;
        }
        return head;
    }

    public void printList(ListNode head) {
        if (head == null)
            return;
        ListNode list = head;
        System.out.print(list.val);
        list = list.next;
        while (list != null) {
            System.out.print("->" + list.val);
            list = list.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        SwapAdjacentNodesInList sanil = new SwapAdjacentNodesInList();
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        sanil.printList(head);
        
        ListNode swappedList = sanil.swapAdjacentNodes(head);
        sanil.printList(swappedList);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
	this.val = val;
    }
    ListNode(int val, ListNode next) {
	this.val = val;
	this.next = next;
    }
}
