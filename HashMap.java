import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class HashMap<K, V> {
    class Node {
        K key;
        V value;
        Node next;
    }

    private static final int SIZE = 10;
    private Node[] map;
    private Node[] tail;
    private int size;

    public HashMap() {
        this(SIZE);
    }

    public HashMap(int size) {
        this.size = size;
        map = (Node[]) Array.newInstance(Node.class, size);
        tail = (Node[]) Array.newInstance(Node.class, size);
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        if (tail[index] == null) {
            map[index] = newNode;
            tail[index] = newNode;
        } else {
            tail[index].next = newNode;
            tail[index] = newNode;
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Node head = map[index];
        while (head != null && !head.key.equals(key))
            head = head.next;
        if (head.key.equals(key))
            return head.value;
        else
            return null; 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Node head = map[i];
            sb.append("\n");
            if (head != null) {
                sb.append("\t[" + i + "] -> {" + head.key + " -> " + head.value + "}");
                head = head.next;
                while (head != null) {
                    sb.append(" -> {" + head.key + " -> " + head.value + "}");
                    head = head.next;
                }
            } else {
                sb.append("\t[" + i + "] -> null");
            }
        }
        sb.append("\n\b]");
        return sb.toString();
    }

    int getIndex(K key) {
        int hashCode = hashCode(key);
        return hashCode % size;        
    }

    int hashCode(K key) {
        return key.hashCode(); 
    }

    boolean equals(Node node1, Node node2) {
        return node1.key.equals(node2.key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);
        hm.put("six", 6);
        hm.put("seven", 7);
        hm.put("eight", 8);
        hm.put("nine", 9);
        hm.put("ten", 10);            

        System.out.println(hm);
        
        HashMap<String, Character> hm1 = new HashMap<>();
        hm1.put("one", 'a');
        hm1.put("two", 'b');
        hm1.put("three", 'c');
        hm1.put("four", 'd');
        hm1.put("five", 'e');
        hm1.put("six", 'f');
        hm1.put("seven", 'g');
        hm1.put("eight", 'h');
        hm1.put("nine", 'i');
        hm1.put("ten", 'j');            

        System.out.println(hm1);
    }
}
