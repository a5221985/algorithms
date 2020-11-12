import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CommonElementsBetweenArrays {
    public int[] findCommon(int[] ...arrays) {
        List<Set<Integer>> commonElements = new LinkedList<>();
        commonElements.add(new HashSet<>());
        for (int i = 0; i < arrays[0].length; i++)
            commonElements.get(0).add(arrays[0][i]);
        for (int n = 1; n < arrays.length; n++) {
            commonElements.add(new HashSet<>());
            for (int i = 0; i < arrays[n].length; i++) {
                if (commonElements.get(n - 1).contains(arrays[n][i])) {
                    //commonElements.get(n - 1).remove(arrays[n][i]);
                    commonElements.get(n).add(arrays[n][i]);
                }
            }
        }
        for (int i = 0; i < commonElements.size(); i++)
            System.out.println(commonElements.get(i));
        return commonElements.get(commonElements.size() - 1).stream().mapToInt(i -> i).toArray();
    }

    public void print(int[] array) {
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
            return;
        }
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        CommonElementsBetweenArrays ceba = new CommonElementsBetweenArrays();
        int[] array1 = {4, 2, 7, 8, 1, 3};
        int[] array2 = {8, 4, 10, 2, 7};
        int[] array3 = {10, 4, 8, 9, 15};
        int[] common = ceba.findCommon(array1, array2, array3);
        ceba.print(common);
    }
}
