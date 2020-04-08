import java.util.Map;
import java.util.HashMap;

public class ContainsCloseNums {
    public Boolean contains(Integer[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                if ((i - map.get(array[i])) <= k)
                    return true;
            } else {
                map.put(array[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsCloseNums ccn = new ContainsCloseNums();
        Integer[] array = new Integer[] {0, 1, 2, 3, 1, 3};
        System.out.println(ccn.contains(array, 3));
    }
}
