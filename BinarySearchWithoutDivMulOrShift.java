public class BinarySearchWithoutDivMulOrShift {
    public int search(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int index = 1;
        while (low <= high) {
            if (key == array[low])
                return low;
            if (key < array[low + index]) {
                high = index;
                index = 1;
            } else if (key > array[low + index + index]) {
                low += index;
                index += index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchWithoutDivMulOrShift bs = new BinarySearchWithoutDivMulOrShift();

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 6;

        int index = bs.search(array, key);
        System.out.println(index);
    }
}
