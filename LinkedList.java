import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private class Node<T> {
        T data;
        Node next;
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    /**
     * Constructs an empty LinkedList
     */
    public LinkedList() {}

    /**
     * Appends an item to the LinkedList
     * @param data Item to append to the LinkedList
     */
    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        if (tail != null)
            tail.next = newNode;
        if (head == null)
            head = tail;
        tail = newNode;
        size++;
    }

    /**
     * Returns a String representation of the LinkedList
     */
    public String toString() {
        if (isEmpty())
            return "";
        StringBuilder sb = new StringBuilder("{");
        Node current = head;
        sb.append(current.data);
        current = current.next;
        while (current != null) {
            sb.append(" -> ").append(current.data);
            current = current.next;
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Returns true if LinkedList is empty or otherwise false
     * @return true or false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of items currently in the LinkedList
     * @return current size of the LinkedList
     */
    public int size() {
        return size;
    }

    /**
     * Returns an iterator which can be used to iterate over the LinkedList
     * @return An iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(head);
    }

    private class ListIterator<T> implements Iterator<T> {

        private Node<T> current;

        public ListIterator(Node<T> head) {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            current = current.next;
            return current.data;
        }
    }

    /**
     * Tests
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++)
            list.add(i);

        System.out.println(list.toString());

        for (Integer item : list)
            System.out.print(item + " ");

        System.out.println();

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer item = iterator.next();
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
