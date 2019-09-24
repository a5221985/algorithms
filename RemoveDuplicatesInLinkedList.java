public class RemoveDuplicatesInLinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;

    public void append(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;
        if (head == null)
            head = tail;
    }
   
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            Node next = current.next;
            while (current.data == next.data) {
                current.next = next.next;
                next = next.next;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesInLinkedList rdill = new RemoveDuplicatesInLinkedList();
        rdill.append(1);
        rdill.append(2);
        rdill.append(2);
        rdill.append(3);
        rdill.append(3);
        rdill.append(3);
        rdill.append(4);
        rdill.append(5);
        rdill.print();

        rdill.removeDuplicates();
        rdill.print();
    }
}
