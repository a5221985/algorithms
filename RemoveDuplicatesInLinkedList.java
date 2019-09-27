import java.util.Set;
import java.util.HashSet;

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
   
    public void removeDuplicatesSorted() {
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

    public void removeDuplicatesUnsorted() {
        if (head == null)
            return;
        Node current = head;
        Node next = current.next;
        Set<Integer> lookupTable = new HashSet<>();
        while (next != null) {
            lookupTable.add(current.data);
            while (next != null && lookupTable.contains(next.data)) {
                current.next = next.next;
                next = next.next;
            }
            if (current != null && next != null) {
                current = current.next;
                next = next.next;
            }
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

        rdill.removeDuplicatesSorted();
        rdill.print();

        RemoveDuplicatesInLinkedList rdill1 = new RemoveDuplicatesInLinkedList();
        rdill1.append(2);
        rdill1.append(1);
        rdill1.append(1);
        rdill1.append(5);
        rdill1.append(4);
        rdill1.append(3);
        rdill1.append(5);
        rdill1.append(3);
        rdill1.print();

        rdill1.removeDuplicatesUnsorted();
        rdill1.print();
    }
}
