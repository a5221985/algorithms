import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxSum {
    public int findMaxSum(List<Integer> list, int k) {
        if (list.size() == 0)
            return 0;
        if (list.size() == 1) {
            if (list.get(0) <= k)
                return list.get(0);
            else
                return 0;
        }
        int item = list.remove(0);
        System.out.println(item);
        int sum1 = item > k? 0: item;
        int subSum1 = findMaxSum(list, k - item);
        if (sum1 + subSum1 <= k)
            sum1 += subSum1;
        int sum2 = findMaxSum(list, k);
        return Math.max(sum1, sum2);
    }

    public static void main(String[] args) {
        MaxSum ms = new MaxSum();
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 8, 9));
        int k = 20;
        System.out.println(ms.findMaxSum(list, k));
    }
}
