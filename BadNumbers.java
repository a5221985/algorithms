import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;

public class BadNumbers {
    public List<Integer> generate(int n) {
        if (n <= 0)
            return new LinkedList<>();
        Queue<Integer> cache = new PriorityQueue<>(Arrays.asList(1, 2, 3, 5));
        List<Integer> nums = new LinkedList<>();
        int multiplier = 2;
        int count = 0;
        while (count <= n) {
            int num2 = 2 * multiplier;
            int num3 = 3 * (multiplier + 1);
            int num5 = 5 * (multiplier + 2);
            cache.add(num2);
            if (num3 % 2 != 0)
                cache.add(num3);
            if (num5 % 2 != 0 && num5 % 3 != 0)
                cache.add(num5);
            nums.add(cache.remove());
            multiplier++;
            count++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int n = 100;
        BadNumbers bn = new BadNumbers();
        List<Integer> nums = bn.generate(n);   
        System.out.println("nums: " + nums); 
    }
}
