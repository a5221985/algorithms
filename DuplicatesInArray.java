import java.util.List;
import java.util.LinkedList;

public class DuplicatesInArray {
    public int[] findDuplicates(int[] array) {
        if (array == null || array.length < 2)
            return new int [0];
        List<Integer> duplicatesList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i + 1)
                continue;
            else if (array[i] == array[array[i] - 1])
                duplicatesList.add(array[i]);
            else {
                while (array[i] != i + 1 && array[i] != array[array[i] - 1])
                    swap(array, i, array[i] - 1);
            }
        }
        return duplicatesList.stream().mapToInt(i -> i).toArray();
    }

    void swap(int[] array, int i , int j) {
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
        DuplicatesInArray dia = new DuplicatesInArray();
        int[] array = {2, 1, 2, 1, 3, 4, 3};
        int[] duplicates = dia.findDuplicates(array);
        dia.print(array);
        dia.print(duplicates);
    }
}
