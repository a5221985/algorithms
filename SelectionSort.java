public class SelectionSort {
    public int[] sort(int[] array) {
        if (array == null || array.length < 2)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (i != minIndex)
                swap(array, i, minIndex);
        }
        return array;
    }

    int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 9, 6, 7, 0, 8, 4};
        SelectionSort ss = new SelectionSort();
        ss.sort(array);
        ss.print(array);
    }
}
