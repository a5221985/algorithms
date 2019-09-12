import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class MinHeap {
    List<Integer> heap = new ArrayList<>();

    public void insert(Integer data) {
        heap.add(data);
        bubbleUp(heap.size() - 1);
    }

    public Integer poll() {
        swap(0, heap.size() - 1);
        Integer item = heap.remove(heap.size() - 1);
        bubbleDown(0);
        return item;
    }

    public Boolean isEmpty() {
        return heap.isEmpty();
    }

    void bubbleUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (heap.get(parentIndex) > heap.get(index)) {
            swap(parentIndex, index);
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
    }

    void bubbleDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        if (leftChild < heap.size()) {
            if (rightChild < heap.size()) {
                if (heap.get(leftChild) < heap.get(rightChild)) {
                    if (heap.get(index) > heap.get(leftChild)) {
                        swap(index, leftChild);
                        bubbleDown(leftChild);
                    }
                } else {
                    if (heap.get(index) > heap.get(rightChild)) {
                        swap(index, rightChild);
                        bubbleDown(rightChild);
                    }
                }
            }
        }
    }

    void swap(int i, int j) {
        Integer temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++)
            set.add((int) (100.0 * Math.random()));

        for (Integer item : set)
            mh.insert((int) item);

        while (!mh.isEmpty())
            System.out.print(mh.poll() + " ");
    }
}
