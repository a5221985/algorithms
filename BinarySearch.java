@SuppressWarnings("unchecked")
public class BinarySearch<T extends Comparable> {

    // O(log n)
    public int search(T[] array, T key) {
        int i = 0;
        int j = array.length - 1;
        int mid = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (key.compareTo(array[mid]) == 0)
                return mid;
            if (key.compareTo(array[mid]) > 0)
                i = mid + 1;
            if (key.compareTo(array[mid]) < 0)
                j = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer key = Integer.valueOf(args[0]);
        int index = binarySearch.search(array, key);
        System.out.println(index);
    }
}
