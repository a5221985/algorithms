import java.util.concurrent.*;

public class ParallelMergeSortExample {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10000;
        int[] array = new int [size];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * array.length);

        print(array);

        ForkJoinPool fjp = new ForkJoinPool();
        ParallelMergeSort parallelMergeSort = new ParallelMergeSort(0, array.length, array);

        fjp.invoke(parallelMergeSort);

        print(array);
    }
}

public class ParallelMergeSort extends RecursiveAction {
    private int start;
    private int end;
    private int thresholdSize = 10;
    private int[] array;
    
    public ParallelMergeSort(int start, int end, int[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void compute() {
        if (end < start)
            return;

        if ((end - start) < thresholdSize) {
            serialInsertionSort(start, end, array);
            return;
        }
        
        int mid = (start + end) >> 1;
        invokeAll(new ParallelMergeSort(start, mid, array), new ParallelMergeSort(mid, end, array));

        merge(start, mid, end, array);
    }

    void merge(int start, int mid, int end, int[] array) {
        int[] merged = new int [end - start + 1];
        int i = start;
        int j = mid;
        int k = 0;
        
        while (i < mid && j < end) {
            if (array[i] <= array[j])
                merged[k++] = array[i++];
            else
                merged[k++] = array[j++];
        }

        while (i < mid)
            merged[k++] = array[i++];

        while (j < end)
            merged[k++] = array[j++];

        k = 0;
        for (i = start; i < end; i++)
            array[i] = merged[k++];

        //serialInsertionSort(start, end, array);
    }

    public void serialInsertionSort(int start, int end, int[] array) {
        for (int i = start + 1; i < end; i++) {
            for (int j = i; j > start; j--) {
                if (array[j] < array[j - 1])
                    swap(j, j - 1, array);
                else
                    break;
            }
        }
    }

    void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
