public class DoublyLinkedListPalyndrome {
    public <T> boolean isPalyndrome(Node<T> head, Node<T> tail) {
        if (head == null || tail == null)
            return false;
        while (head != tail || head != null && head.prev != tail) {
            if (head.data != tail.data)
                return false;
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        DoublyLinkedListPalyndrome dllp = new DoublyLinkedListPalyndrome();
        //String str = "abcdefghgfedcba"; 
        String str = "abcba"; 

        Node<Character> head = new Node<>();
        head.data = str.charAt(0);
        Node<Character> current = head;
        for (int i = 1; i < str.length(); i++) {
            Node<Character> newNode = new Node<>();
            newNode.data = str.charAt(i);
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
        }
        Node<Character> tail = current;

        System.out.println(dllp.isPalyndrome(head, tail));
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;
}
