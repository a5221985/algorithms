public class SwapAdjacentNodesInList {

    public ListNode swapAdjacentNodes(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = null;
        head = head.next;
        while (first != null && second != null) {
            first.next = second.next;
            second.next = first;
            if (third != null)
                third.next = second;
            third = first;
            first = first.next;
            if (first != null)
                second = first.next;
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
        ListNode sixteen = new ListNode(16);
        ListNode fifteen = new ListNode(15, sixteen);
        ListNode fourteen = new ListNode(14, fifteen);
        ListNode thirteen = new ListNode(13, fourteen);
        ListNode twelve = new ListNode(12, thirteen);
        ListNode eleven = new ListNode(11, twelve);
        ListNode ten = new ListNode(10, eleven);
        ListNode nine = new ListNode(9, ten);
        ListNode eight = new ListNode(8, nine);
        ListNode seven = new ListNode(7, eight);
        ListNode six = new ListNode(6, seven);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
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
