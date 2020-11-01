public class AddTwoNumbersInLinkedList {
    public static void main(String[] args) {
        AddTwoNumbersInLinkedList atnill = new AddTwoNumbersInLinkedList();
        
        ListNode num1 = new ListNode(7);
        ListNode current = num1;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(4);
        current = current.next;
        current.next = new ListNode(3);
        
        ListNode num2 = new ListNode(5);
        current = num2;
        current.next = new ListNode(6);
        current = current.next;
        current.next = new ListNode(4);

        
    }
}

class ListNode {
    int val
    ListNode next;
    ListNode(int val) { this.val = val; }
}
