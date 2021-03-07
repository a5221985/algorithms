public class BinarySearch {
    public int search(int[] array, int key) {
        if (array == null || array.length == 0)
            return -1;
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) >> 1;
            if (key == array[mid])
                return mid;
            else if (key < array[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;
        int index = bs.search(array, key);
        System.out.println(key + " is at location " + index);
    }
}
