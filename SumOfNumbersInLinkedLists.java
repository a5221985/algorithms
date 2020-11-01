public class SumOfNumbersInLinkedLists {
    public ListNode generateList(int num) {
        ListNode head = null;
        ListNode currentNode = null;
        while (num > 0) {
            ListNode newNode = new ListNode(num % 10);
            if (head == null) {
                head = newNode;
                currentNode = head;
            } else {
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
            num = num / 10;
        }
        return head;
    }

    public ListNode add(ListNode num1, ListNode num2) {
        ListNode head = null;
        ListNode currentNode = null;
        ListNode currentNum1 = num1;
        ListNode currentNum2 = num2;
        int carry = 0;
        int sum = 0;
        while (currentNum1 != null && currentNum2 != null) {
            sum = currentNum1.val + currentNum2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode newNode = new ListNode(sum);
            if (head == null) {
                head = newNode;
                currentNode = head;
            } else {
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
            currentNum1 = currentNum1.next;
            currentNum2 = currentNum2.next;
        }
        while (currentNum1 != null) {
            ListNode newNode = new ListNode(currentNum1.val);
            if (carry > 0) {
                newNode.val = newNode.val + carry;
                carry = 0;
            }
            currentNode.next = newNode;
            currentNode = currentNode.next;
            currentNum1 = currentNum1.next;
        }
        while (currentNum2 != null) {
            ListNode newNode = new ListNode(currentNum2.val);
            if (carry > 0) {
                newNode.val = newNode.val + carry;
                carry = 0;
            }
            currentNode.next = newNode;
            currentNode = currentNode.next;
            currentNum2 = currentNum2.next;
        }
        return head;
    }

    public void print(ListNode list) {
        ListNode currentNode = list;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n1 = 54321;
        int n2 = 6734;
        SumOfNumbersInLinkedLists sonill = new SumOfNumbersInLinkedLists();
        ListNode num1 = sonill.generateList(n1);
        ListNode num2 = sonill.generateList(n2);
        sonill.print(num1);
        sonill.print(num2);
        ListNode sum = sonill.add(num1, num2);
        sonill.print(sum);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
