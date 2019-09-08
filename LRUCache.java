import java.util.Map;
import java.util.HashMap;

public class LRUCache {
    class Node {
        String key;
        Integer value;
        Node next;
        Node prev;
    }

    class DoublyLinkedList {
        Node head;
        Node tail;
    }

    private static final int CACHE_SIZE = 5;    
    private DoublyLinkedList list = new DoublyLinkedList();
    private Map<String, Node> cache = new HashMap<>();

    public Integer read(String key) {
        if (!cache.keySet().contains(key))
            return null;
        moveNodeToFront(key);
        return cache.get(key).value;
    }

    public void write(String key, Integer value) {
       if (cache.keySet().contains(key)) {
          Node current = cache.get(key);
          current.key = key;
          current.value = value;
          moveNodeToFront(key);
       } else {
          Node newNode = new Node();
          newNode.key = key;
          newNode.value = value;
          insertNodeAtFront(key, newNode);
          cache.put(key, newNode);
       }
    }

    void moveNodeToFront(String key) {
        Node current = cache.get(key);
        if (current == list.head)
            return;

        Node prev = current.prev;
        Node next = current.next;

        if (prev != null)
            prev.next = next;

        if (next != null)
            next.prev = prev;

        current.next = list.head;
        list.head.prev = current;
        list.head = current;        
    }

    void insertNodeAtFront(String key, Node node) {
        if (list.head == null) {
            list.head = node;
            list.tail = node;
            return;
        }

        if (cache.size() >= CACHE_SIZE - 1) {
            cache.remove(list.tail.key);
            deleteNodeFromBack();
        }

        node.next = list.head;
        if (list.head != null) {
            list.head.prev = node;
            list.head = node;
            if (list.tail == null)
                list.tail = list.head;
        }
    }

    void deleteNodeFromBack() {
        if (list == null || list.tail == null)
            return;

        Node current = list.tail;
        Node prev = list.tail.prev;
        prev.next = null;
        list.tail = prev;
        current = null;

        if (list.tail == null)
            list.head = null;
    }

    @Override
    public String toString() {
        if (list.head == null)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = list.head;
        sb.append("{" + current.key + ", " + current.value + "}");
        current = current.next;
        while (current != null) {
            sb.append(", {" + current.key + ", " + current.value + "}");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache();
        lru.write("one", 1);
        lru.write("two", 2);
        lru.write("three", 3);
        lru.write("four", 4);
        lru.write("five", 5);

        System.out.println(lru);

        System.out.println(lru.read("one"));
        System.out.println(lru.read("two"));
        System.out.println(lru.read("three"));
        System.out.println(lru.read("four"));
        System.out.println(lru.read("five"));

        System.out.println(lru);
        
        System.out.println(lru.read("five"));
        System.out.println(lru.read("four"));
        System.out.println(lru.read("three"));
        System.out.println(lru.read("two"));
        System.out.println(lru.read("one"));

        System.out.println(lru);
        
        lru.write("six", 6);
        lru.write("seven", 7);
        lru.write("eight", 8);
        lru.write("nine", 9);
        lru.write("ten", 10);
        lru.write("eleven", 11);
        lru.write("twelve", 12);
        lru.write("thirteen", 13);
        lru.write("fourteen", 14);
        lru.write("fifteen", 15);

        System.out.println(lru);
 
        System.out.println(lru.read("six"));
        System.out.println(lru.read("seven"));
        System.out.println(lru.read("eight"));
        System.out.println(lru.read("nine"));
        System.out.println(lru.read("ten"));
        System.out.println(lru.read("eleven"));
        System.out.println(lru.read("twelve"));
        System.out.println(lru.read("thirteen"));
        System.out.println(lru.read("fourteen"));
        System.out.println(lru.read("fifteen"));
        System.out.println(lru.read("twelve"));

        System.out.println(lru);
    }
}
