public class QuickSelect {
    public int find(int[] array, int k) {
        return find(array, 0, array.length - 1, k);
    }

    int find(int[] array, int low, int high, int k) {
        int p = partition(array, low, high);
        if (k == p)
            return array[k];
        if (k < p)
            return find(array, low, p - 1, k);
        else
            return find(array, p + 1, high, k);
    }

    int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        while (i < j) {
            if (array[i] <= pivot)
                i++;
            if (array[j] >= pivot)
                j--;
            if (array[i] > pivot && array[j] < pivot) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        int p = 0;
        if (i < array.length && array[i] < array[low]) {
            swap(array, low, i);
            p = i;
        } else {
            swap(array, low, i - 1);
            p = i - 1;
        }
        print(array);
        return p;
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSelect qs = new QuickSelect();
        //int[] array = {9, 2, 1, 0, 5, 3, 7, 6, 8, 4};
        int[] array = new int [20];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * array.length);

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = qs.find(array, i);
            System.out.println(i + ": " + num);
        }
    }
}
