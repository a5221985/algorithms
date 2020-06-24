public class BubbleSort {
    public int[] sort(int[] array) {
        if (array == null || array.length < 2)
            return array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
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
        BubbleSort bs = new BubbleSort();
        int[] array = {6, 1, 3, 2, 9, 0, 4, 5, 8, 7};
        bs.sort(array);
        bs.print(array);
    }
}
