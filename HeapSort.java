public class HeapSort {
    public static final int DEFAULT_SIZE = 10;
    private Integer[] heap = new Integer[DEFAULT_SIZE];
    private int size = 0;

    public void insert(Integer item) {
        optionallyResize();
        heap[size++] = item;
        bubbleUp();
    }

    public Integer remove() {
        Integer item = heap[0];
        int lastIndex = size - 1;
        swap(0, lastIndex);
        size--;
        bubbleDown();
        return item;
    }

    void optionallyResize() {
        if (isFull())
            resize(heap.length * 2);
        if (isTooFew())
            resize(heap.length / 2);
    }

    boolean isFull() {
        return size == heap.length - 1;
    }

    boolean isTooFew() {
        return size == heap.length / 4;
    }

    void resize(int size) {
        Integer[] newHeap = new Integer[size];
        copy(newHeap);
        heap = null;
        heap = newHeap;
    }

    void copy(Integer[] newHeap) {
        for (int i = 0; i < size; i++)
            newHeap[i] = heap[i];
    }

    void bubbleUp() {
        int currentIndex = size - 1;
        int parentIndex = (currentIndex - 1) / 2;
        while (parentIndex >= 0 && heap[parentIndex] > heap[currentIndex]) {
            swap(parentIndex, currentIndex);
            currentIndex = parentIndex;
            parentIndex = (currentIndex - 1) / 2;
        }
    }

    void bubbleDown() {
        int currentIndex = 0;
        int leftIndex = 2 * currentIndex + 1;
        int rightIndex = leftIndex + 1;

        while (currentIndex < size && leftIndex < size && rightIndex < size) {
            if (heap[leftIndex] < heap[rightIndex] && heap[currentIndex] > heap[leftIndex]) {
                swap(currentIndex, leftIndex);
                currentIndex = leftIndex;
            } else if (heap[rightIndex] < heap[leftIndex] && heap[currentIndex] > heap[rightIndex]) {
                swap(currentIndex, rightIndex);
                currentIndex = rightIndex;
            } else
                break;
            leftIndex = 2 * currentIndex + 1;
            rightIndex = leftIndex + 1;
        }

        if (leftIndex < size && heap[currentIndex] > heap[leftIndex])
            swap(currentIndex, leftIndex);

        if (rightIndex < size && heap[currentIndex] > heap[rightIndex])
            swap(currentIndex, rightIndex);
    }

    void swap(int i, int j) {
        Integer temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        HeapSort heap = new HeapSort();
        heap.insert(2);
        heap.insert(4);
        heap.insert(1);
        heap.insert(7);
        heap.insert(8);
        heap.insert(6);
        heap.insert(5);
        heap.insert(9);
        heap.insert(0);
        heap.insert(3);
        heap.insert(12);
        heap.insert(10);
        heap.insert(11);
        heap.insert(14);
        heap.insert(15);
        heap.insert(18);
        heap.insert(17);
        heap.insert(13);
        heap.insert(16);
        heap.insert(19);
        heap.insert(21);
        heap.insert(20);
        heap.insert(29);
        heap.insert(26);
        heap.insert(35);
        heap.insert(32);
        heap.insert(28);
        heap.insert(31);
        heap.insert(25);
        heap.insert(22);
        heap.insert(33);
        heap.insert(34);
        heap.insert(39);
        heap.insert(36);
        heap.insert(24);
        heap.insert(27);
        heap.insert(37);
        heap.insert(23);
        heap.insert(30);
        heap.insert(38);
        while (!heap.isEmpty())
            System.out.println(heap.remove());
    }
}
