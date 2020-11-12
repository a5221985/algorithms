import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class UniqueTripletsOfSum {
    public List<List<Integer>> threeSum(int[] nums) {
        return threeSum(nums, 3, 0);
    }
    
    List<List<Integer>> threeSum(int[] nums, int count, int sum) {
        if (nums.length == 0)
            return new ArrayList<>();
        if (nums.length == 1) {
            if (count == 1 && nums[0] == sum) {
                List<Integer> list = new ArrayList<>(Arrays.asList(nums[0]));
                List<List<Integer>> listOfList = new ArrayList<>(Arrays.asList(list));
                return listOfList;
            } else
                return new ArrayList<>();
        }
        System.out.println("count: " + count);
        if (count == 1) {
            System.out.println(count);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    List<Integer> sumList = new ArrayList<>(Arrays.asList(nums[i]));
                    list.add(sumList);
                }
            }
            return list;
        }
        List<List<Integer>> subSumList = threeSum(Arrays.copyOfRange(nums, 1, nums.length - 1), 1, sum - nums[0]);
        List<List<Integer>> subSumList2 = threeSum(Arrays.copyOfRange(nums, 1, nums.length - 1), 2, sum - nums[0]);
        List<List<Integer>> list = threeSum(Arrays.copyOfRange(nums, 1, nums.length - 1), 3, sum);
        System.out.println(subSumList);
        System.out.println(subSumList2);
        System.out.println(list);
        for (List<Integer> subSumItems : subSumList) {
            List<Integer> sumItems = new ArrayList<>(subSumItems);
            sumItems.add(nums[0]);
            list.add(sumItems);
        }
        for (List<Integer> subSumItems : subSumList2) {
            List<Integer> sumItems = new ArrayList<>(subSumItems);
            sumItems.add(nums[0]);
            list.add(sumItems);
        }
        return list;
    }

    public static void main(String[] args) {
        UniqueTripletsOfSum utos = new UniqueTripletsOfSum();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(utos.threeSum(nums));
    }
}
