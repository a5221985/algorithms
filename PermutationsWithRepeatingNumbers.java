import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class PermutationsWithRepeatingNumbers {
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums, 0);
    }

    List<List<Integer>> permute(int[] nums, int currentIndex) {
        if (nums == null || nums.length < 1 || currentIndex < 0 || currentIndex >= nums.length)
            return new LinkedList<>();
        if (currentIndex == nums.length - 1) {
            List<Integer> permutation = new LinkedList<>(Arrays.asList(nums[currentIndex]));
            return new LinkedList<>(Arrays.asList(permutation));
        }
        List<List<Integer>> subPermutations = permute(nums, currentIndex + 1);
        List<List<Integer>> permutations = new LinkedList<>();
        for (List<Integer> subPermutation : subPermutations) {
            if (subPermutation.isEmpty()) {
                List<Integer> permutation = new LinkedList<>(Arrays.asList(nums[currentIndex]));
                permutations.add(permutation);
                continue;
            }
            List<Integer> permutation = new LinkedList<>(Arrays.asList(nums[currentIndex]));
            permutation.addAll(subPermutation);
            permutations.add(permutation);
            for (int i = 0; i < subPermutation.size() && nums[currentIndex] != subPermutation.get(i); i++) {
                permutation = new LinkedList<>(subPermutation.subList(0, i + 1));
                permutation.add(nums[currentIndex]);
                permutation.addAll(subPermutation.subList(i + 1, subPermutation.size()));
                permutations.add(permutation);
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        PermutationsWithRepeatingNumbers pwrn = new PermutationsWithRepeatingNumbers();
        //int[] nums = {1, 1, 2};
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = pwrn.permute(nums);
        System.out.println(permutations);
    }
}
