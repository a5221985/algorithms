import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class LongestDistinctSubArray {
    public int[] find(int[] array) {
        Map<Integer, Integer> seen = new HashMap<>();
        int maxLength = 0;
        int maxI = 0;
        int maxJ = 0;
        int newLength = 0;
        int newI = 0;
        int i = 0;
        int j = 0;
        for (i = 0, j = 0; j < array.length; j++) {
            if (seen.containsKey(array[j])) {
                newI = seen.get(array[j]) + 1;
                while (i < newI) 
                    seen.remove(array[i++]);
                seen.put(array[j], j);
                newLength = j - i;
                if (maxLength < newLength) {
                    maxLength = newLength;
                    maxI = i;
                    maxJ = j;
                }
            } else {
                seen.put(array[j], j);
            }
        }
        newLength = j - i;
        if (maxLength < newLength) {
            maxLength = newLength;
            maxI = i;
            maxJ = j;
        }
        int delta = (j == array.length)? 0: 1;
        int[] subArray = Arrays.copyOfRange(array, maxI, maxJ + delta);
        return subArray;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        LongestDistinctSubArray ldsa = new LongestDistinctSubArray();
        int[] array = {5, 1, 3, 5, 2, 3, 4, 1};
        int[] subArray = ldsa.find(array);
        ldsa.print(array);
        ldsa.print(subArray);
    }
}
