public class QuickSort {
    void sort(int[] array) {
        if (array == null || array.length == 0)
            return;
        _sort(array, 0, array.length - 1);
    }

    void _sort(int[] array, int low, int high) {
	if (low >= high)
            return;
	int pivot = low;
	int i = low + 1;
	int j = high;
	while (i < j) {
            System.out.println(i + ", " + j);
	    while (i < high && array[i] < array[pivot])
		i++;
	    while (j > low && array[j] > array[pivot])
		j--;
	    if (i <= high && j > pivot && array[i] >= array[pivot] && array[j] <= array[pivot])
		swap(array, i++, j--);
	}
	i = pivot;
	while (i < j) {
            swap(array, i, i + 1);
            i++;
        }
        print(array);
	_sort(array, low, j - 1);
	_sort(array, j + 1, high);
    }

    void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] array = {9, 3, 0, 1, 2, 2, 5, 3, 9, 5, 3, 4};
        qs.print(array);
        qs.sort(array);
        qs.print(array);
    }
}
