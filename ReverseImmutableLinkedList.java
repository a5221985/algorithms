public class ReverseImmutableLinkedList {
    public <T> void printReverse(Node<T> list) {
        if (list == null)
            return;
        printReverse(list.next);
        System.out.println(list.data);
    }

    public static void main(String[] args) {
        ReverseImmutableLinkedList rill = new ReverseImmutableLinkedList();
        Node<Integer> list = new Node<>();
        list.data = 1;
        Node<Integer> node2 = new Node<>();
        node2.data = 2;
        list.next = node2;
        Node<Integer> node3 = new Node<>();
        node3.data = 3;
        node2.next = node3;
        Node<Integer> node4 = new Node<>();
        node4.data = 4;
        node3.next = node4;

        rill.printReverse(list);
    }
}

class Node<T> {
    T data;
    Node<T> next;
}
