import java.util.*;

public class LongestRunOfOnes {
    public int find(int n) {
        int maxRun = 0;
        int currentRun = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                currentRun++;
            else if ((n & 1) == 0) {
                if (maxRun < currentRun)
                    maxRun = currentRun;
                currentRun = 0;
            }
            n >>= 1;
        }
        if (maxRun < currentRun)
            maxRun = currentRun;
        return maxRun;
    }

    public static void main(String[] args) {
        LongestRunOfOnes lroo = new LongestRunOfOnes();
        int num = 31;
        System.out.println(lroo.find(num));
    }
}
