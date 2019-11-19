import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class MaxHeap<T extends Comparable> {
    private List<T> heap = new ArrayList<>();
   
    public Boolean insert(T item) {
        heap.add(item);
        bubbleUp();
        return true;
    }

    public T peek() {
        if (heap == null || heap.isEmpty())
            return null;
        return heap.get(0);
    }

    public T remove() {
        int lastIndex = heap.size() - 1;
        swap(0, lastIndex);
        T item = heap.get(lastIndex);
        heap.remove(lastIndex);
        bubbleDown();
        return item;
    }

    void bubbleUp() {
        if (isEmpty() || heap.size() == 1)
            return;

        int index = heap.size() - 1;
        int parent = (index - 1) / 2;

        while (index > 0 && heap.get(index).compareTo(heap.get(parent)) > 0) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    void bubbleDown() {
        if(isEmpty() || heap.size() == 1)
            return;

        int index = 0;
        int left = 2 * index + 1;
        int right = left + 1;
        int current = indexOfMax(left, right);
        while (current != -1 && heap.get(index).compareTo(heap.get(current)) > 0) {
            swap(index, current);
            index = current;
            left = 2 * index + 1;
            right = left + 1;
            current = indexOfMax(left, right);
        }
    }

    int indexOfMax(int i , int j) {
        if (i >= heap.size())
            return -1;
        
        if (j >= heap.size())
            return i;

        return heap.get(i).compareTo(heap.get(j)) >= 0? i: j;
    }

    Boolean swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
        return true;
    }
  
    Boolean isEmpty() {
        return heap == null || heap.isEmpty();
    }

    public static void main(String[] args) {
        MaxHeap<Integer> h = new MaxHeap<>();
        for (int i = 0; i < 4; i++)
            h.insert(i);

        System.out.println(h.peek());

        for (int i = 0; i < 4; i++)
            System.out.println(h.heap.get(i));

        while (!h.isEmpty())
            System.out.println(h.remove());
    }
}
