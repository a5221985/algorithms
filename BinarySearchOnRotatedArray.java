public class BinarySearchOnRotatedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1) {
            if (target == nums[0])
                return 0;
            else
                return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int offset = 0;
        if (nums[low] >= nums[high]) {
            while (low < high) {
                mid = (low + high) >> 1;
                if (nums[mid] >= nums[0])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            offset = (low < (nums.length - 1) && nums[low] > nums[low + 1])? low + 1: low;
        }
        System.out.println(offset);
        
        int actualMid = 0;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            mid = (low + high) >> 1;
            actualMid = (mid + offset) % nums.length;
            if (nums[actualMid] == target)
                return actualMid;
            else if (target < nums[actualMid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchOnRotatedArray bsora = new BinarySearchOnRotatedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(bsora.search(nums, target));
    }
}
