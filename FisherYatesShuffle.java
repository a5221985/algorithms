public class FisherYatesShuffle {
    public void shuffle(int[] array) {
        int j = 0;
        for (int k = array.length - 1; k >= 0; k--) {
            j = (int) (Math.random() * (k + 1));
            swap(array, k, j);
        }
    }

    public void print(int[] array) {
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        FisherYatesShuffle fys = new FisherYatesShuffle();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fys.shuffle(array);
        fys.print(array);
    }
}
