public class BubbleSort {
    public void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else
                    break;
            }
        }
    }

    public void print(int[] array) {
        System.out.print("[");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(" ," + array[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] array = {1, 5, 2, 3, 0, 8, 6};
        bs.print(array);
        bs.sort(array);
        bs.print(array);
    }
}
