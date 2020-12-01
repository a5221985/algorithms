import java.io.*;
import java.util.Properties;

class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        if (nums.length == 1)
            return true;
        boolean[] cache = new boolean [nums.length];
        return canJump(nums, 0, cache);
    }
    
    boolean canJump(int[] nums, int currentPosition, boolean[] cache) {
        if (currentPosition == nums.length - 1) {
            cache[currentPosition] = true;
            return cache[currentPosition];
        }
        if (currentPosition >= nums.length)
            return false;
        if (cache[currentPosition])
            return true;
        for (int i = nums[currentPosition]; i > 0; i--) {
            System.out.println(currentPosition);
            boolean isPossible = canJump(nums, currentPosition + i, cache);
            if (isPossible) {
                System.out.println(currentPosition);
                cache[currentPosition] = true;
                return cache[currentPosition];
            }
        }
        cache[currentPosition] = false;
        return cache[currentPosition];
    }

    public static void main(String[] args) throws IOException {
        JumpGame jumpGame = new JumpGame();
        Properties properties = new Properties();
        InputStream inputStream = jumpGame.getClass().getResourceAsStream("jumpGame.properties");
        properties.load(inputStream);
        int[] nums = {2, 1, 1, 4, 5, 2, 1, 0, 0, 0};        
        System.out.println(jumpGame.canJump(nums));
    }
}
