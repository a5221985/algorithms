public class ReArrangementOfArrayElementsAroundPivot {
    public void rearrange(int[] array, int pivot) {
        if (array == null || array.length < 2)
            return;
        int i = 0;
        int j = array.length - 1;
        int k = -1;
        while (i < j) {
            if (array[i] > pivot && array[j] < pivot)
                swap(array, i, j);
            else if (array[i] < pivot)
                i++;
            else if (array[j] > pivot)
                j--;
            else if (array[i] == pivot) {
                k = i;
                while (k < j && array[k] == pivot)
                    k++;
                if (k >= j)
                    break; 
                swap(array, i, k);
                k = -1;
            } else if (array[j] == pivot) {
                k = j;
                while (k > i && array[k] == pivot)
                    k--;
                if (k <= i)
                    break;
                swap(array, j, k);
                k = -1;
            }
            print(array);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(int[] array) {
        System.out.print("[");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        int [] array = {9, 12, 3, 5, 14, 10, 10};
        ReArrangementOfArrayElementsAroundPivot raoaeap = new ReArrangementOfArrayElementsAroundPivot();
        int pivot = 10;
        raoaeap.print(array);
        raoaeap.rearrange(array, pivot);
        raoaeap.print(array);
    }
}
