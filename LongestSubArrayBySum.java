import java.util.Arrays;

public class LongestSubArrayBySum {
    public Integer[] getLongestSubArrayBySum(Integer[] array, int sum) {
        if (array == null || array.length == 0 || (array.length == 1 && array[0] != sum) || sum <= 0)
            return new Integer[0];
        if (array.length == 1 && array[0] == sum)
            return new Integer[] {array[0]};
        Integer[] prefixSubArray = Arrays.copyOfRange(array, 0, array.length - 1);
        Integer[] sub1 = getLongestSubArrayBySum(prefixSubArray, sum - array[array.length - 1]);
        Integer[] sub2 = getLongestSubArrayBySum(prefixSubArray, sum);
        
        if (sub1.length >= sub2.length) {
            Integer[] longestSubArray = new Integer[sub1.length + 1];
            longestSubArray = Arrays.copyOf(sub1, sub1.length + 1);
            longestSubArray[longestSubArray.length - 1] = array[array.length - 1];
            return longestSubArray;
        } else {
            return sub2;
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 7, 5};
        int sum = 13;

        LongestSubArrayBySum longestSubArrayBySum = new LongestSubArrayBySum();

        Integer[] subArray = longestSubArrayBySum.getLongestSubArrayBySum(array, sum);

        for (int i = 0; i < subArray.length; i++)
            System.out.print(subArray[i] + " ");
        System.out.println();
    }
}
