public class QueueWithStack<T> {
    Node<T>[] S;
    int num;

    public QueueWithStack(int num) {
        S = (Node<T>[]) new Node[num];
        this.num = num;
    }

    public Node<T> getStack(int index) {
        if (index < 0 || index >= num)
            return null;

        return S[index];
    }

    public Boolean push(int index, T item) {
        Node<T> newNode = new Node<>();
        newNode.data = item;
        newNode.next = S[index];
        S[index] = newNode;
        return true;
    }

    public T pop(int index) {
        if (isEmpty(index))
            return null;

        T item = S[index].data;
        S[index] = S[index].next;
        return item;
    }

    public Boolean isEmpty(int index) {
        return S[index] == null;
    }

    public Boolean enqueue(T item) {
        return push(0, item);
    }

    public T dequeue() {
        if (isEmpty(1))
            while (!isEmpty(0))
                push(1, pop(0));
        return pop(1);
    }

    public Boolean isEmpty() {
        return isEmpty(0) && isEmpty(1);
    }

    public static void main(String[] args) {
        QueueWithStack<Integer> q = new QueueWithStack<>(2);

        for (int i = 1; i < 101; i++)
            q.enqueue(i);

        while (!q.isEmpty())
            System.out.print(q.dequeue() + " ");
        System.out.println();
    }
}

class Node<T> {
    T data;
    Node next;
}
