public class InsertionSort {

    private int shifts;

    public int[] swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
        return array;
    }

    public int[] shift(int[] array, int i) {
        if (i == 0)
            return array;

        while (i > 0) {
            if (array[i] < array[i - 1]) {
                array = swap(array, i, i - 1);
                i--;
                shifts++;
            } else
                break;
        }

        return array;
    }

    public int[] sort(int[] array, int i) {
        if (i == 0)
            return array;

        sort(array, i - 1);
        shift(array, i - 1);

        return array;
    }

    public static void main(String[] args) {
        //int[] array = new int[] {4, 3, 2, 1};
        //int[] array = new int[] {1, 1, 1, 2, 2};
        int[] array = new int[] {2, 1, 3, 1, 2};

        InsertionSort is = new InsertionSort();
        array = is.sort(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Shifts: " + is.shifts);
    }
}
