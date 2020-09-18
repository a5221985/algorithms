class MyHashSet {
    class Node {
        int data;
        Node next;
    }
    
    private static final int INITIAL_SIZE = 100;
    private Node[] hashSet;
    private int size;

    /** Initialize your data structure here. */
    public MyHashSet() {
        hashSet = new Node[INITIAL_SIZE];
        size = INITIAL_SIZE;
    }
    
    public void add(int key) {
        int index = getIndex(key);
        insert(key, index);
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        delete(key, index);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = getIndex(key);
        return contains(key, index);
    }
    
    int getIndex(int key) {
        return (17*key + 31) % size;
    }
    
    void insert(int key, int index) {
        Node node = hashSet[index];
        Node newNode = new Node();
        newNode.data = key;
        if (node == null) {
            hashSet[index] = newNode;
            return;
        } 
        while (node.next != null)
            node = node.next;
        node.next = newNode;
    }
    
    void delete(int key, int index) {
        Node node = hashSet[index];
        while(node.next != null && node.next.data != key)
            node = node.next;
        if (node.next != null && node.next.data == key) {
            Node oldNode = node.next;
            node.next = node.next.next;
            oldNode = null;
        }
    }
    
    boolean contains(int key, int index) {
        Node node = hashSet[index];
        while (node != null && node.data != key)
            node = node.next;
        return node != null && node.data == key;
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        System.out.println(set.contains(1));
    }
}
