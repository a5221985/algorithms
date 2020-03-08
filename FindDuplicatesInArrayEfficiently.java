import java.util.List;
import java.util.ArrayList;

public class FindDuplicatesInArrayEfficiently {
    public Integer[] find(Integer[] array) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();
        int count = 1;
        System.out.print("Iterations: ");
        while (i < array.length) {
            System.out.print(count++ + " ");
            if (array[i] == -1 || array[i] == (i + 1)) {
                i++;
            } else if (array[i] == array[array[i] - 1]) {
                duplicates.add(array[i]);
                array[i] = -1;
            } else {
                swap(array, i, array[i] - 1);
            }
        }
        System.out.println();
        Integer[] duplicatesArray = new Integer[duplicates.size()];
        return duplicates.toArray(duplicatesArray);
    }

    public Integer[] swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {4, 3, 2, 7, 8, 2, 3, 1};
        FindDuplicatesInArrayEfficiently fdiae = new FindDuplicatesInArrayEfficiently();
        Integer[] duplicates = fdiae.find(array);
        for (int i = 0; i < duplicates.length; i++)
            System.out.print(duplicates[i] + " ");
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
