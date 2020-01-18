public class MergeSortInsertionSorts {
    public Integer[] sort(Integer[] array) {
        if (array != null && array.length != 0)
            return mergeSort(array, 0, array.length - 1);
        return null;
    }

    Integer[] mergeSort(Integer[] array, int low, int high) {
        if ((high - low + 1) <= 3)
            return insertionSort(array, low, high);
        int mid = (low + high) / 2;
        Integer[] left = mergeSort(array, low, mid);
        Integer[] right = mergeSort(array, mid + 1, high);
        Integer[] merged = merge(left, right);
        return merged;
    }

    Integer[] insertionSort(Integer[] array, int low, int high) {
        for (int i = low; i <= high; i++) {
            for (int j = i; j < high; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
        return subArray(array, low, high);
    }

    Integer[] subArray(Integer[] array, int low, int high) {
        Integer[] newArray = new Integer[high - low + 1];
        for (int i = 0; i < newArray.length; i++)
            newArray[i] = array[i + low];
        return newArray;
    }

    void swap(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] merged = new Integer[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                merged[k++] = left[i++];
            else
                merged[k++] = right[j++];
        }
        while (i < left.length)
            merged[k++] = left[i++];
        while (j < right.length)
            merged[k++] = right[j++];
        return merged;
    }

    public static void main(String[] args) {
        MergeSortInsertionSorts msis = new MergeSortInsertionSorts();
        Integer[] array = new Integer[] {5, 2, 7, 1, 9, 3, 8, 4, 6};
        Integer[] sorted = msis.sort(array);
        for (int i = 0; i < sorted.length; i++)
            System.out.print(sorted[i] + " ");
        System.out.println();
    }
}
