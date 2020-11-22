import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public List<List<Integer>> findThreeSums(int[] nums, int k) {
        return findSums(nums, 0, 3, k);
    }

    List<List<Integer>> findSums(int[] nums, int startIndex, int n, int k) {
        if (n == 0)
            return new LinkedList<>();
        if (n == 1) {
            List<List<Integer>> list = new LinkedList<>();
            for (int i = startIndex; i < nums.length; i++) {
                if (nums[i] == k)
                    list.add(new LinkedList<>(Arrays.asList(nums[i])));
            }
            return list;
        }
        List<List<Integer>> list = new LinkedList<>();
        for (int i = startIndex; i < nums.length - n + 1; i++) {
            List<List<Integer>> subList = findSums(nums, i + 1, n - 1, k - nums[i]);
            if (!subList.isEmpty()) {
                for (List<Integer> subSum : subList) {
                    List<Integer> sum = new LinkedList<>(Arrays.asList(nums[i]));
                    sum.addAll(subSum);
                    Collections.sort(sum);
                    if (!list.contains(sum))
                        list.add(sum);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int k = 0;
        List<List<Integer>> threeSums = ts.findThreeSums(nums, k);
        System.out.println(threeSums);
    }
}
