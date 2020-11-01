class LinkedListWithOperations {
    class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    
    private Node head;
    private Node tail;
    private int size;

    /** Initialize your data structure here. */
    public LinkedListWithOperations() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (tail == null) {
            tail = new Node(val);
            head = tail;
        } else {
            Node newNode = new Node(val);
            tail.next = newNode;
            tail = newNode;
        }   
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            System.out.println("INDEX: " + index);
            addAtTail(val);
            return;
        }
        int prevIndex = index - 1;
        Node current = head;
        for (int i = 0; i < prevIndex; i++)
            current = current.next;
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (size == 0)
            return;
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            head = head.next;
            if (head == null)
                tail = null;
            size--;
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node current = head;
        int prevIndex = index - 1;
        for (int i = 0; i < prevIndex; i++)
            current = current.next;
        if (tail == current.next)
            tail = current;
        current.next = current.next.next;
        if (head == null)
            tail = null;
        else if (tail == null)
            head = null;
        size--;
    }

    public void print() {
        System.out.print("SIZE: " + size + ", ");
        if (head == null)
            System.out.println("");
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListWithOperations llwo = new LinkedListWithOperations();
        llwo.addAtHead(7);
        llwo.print();
        llwo.addAtHead(2);
        llwo.print();
        llwo.addAtHead(1);
        llwo.print();
        llwo.addAtIndex(3, 0);
        llwo.print();
        llwo.deleteAtIndex(2);
        llwo.print();
        llwo.addAtHead(6);
        llwo.print();
        llwo.addAtTail(4);
        llwo.print();
        int item = llwo.get(4);
        System.out.println("ITEM: " + item);
        llwo.print();
        llwo.addAtHead(4);
        llwo.print();
        llwo.addAtIndex(5, 0);
        llwo.print();
        llwo.addAtHead(6);
        llwo.print();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
