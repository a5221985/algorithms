import java.util.*;

class Solution {
    public int solve(int[][] stacks) {
        int[] sums = new int [stacks.length];
        int minSum = 0;
        int[] lastIndex = new int [stacks.length];
        for (int i = 0; i < stacks.length; i++) {
            for (int j = 0; j < stacks[i].length; j++) {
                sums[i] += stacks[i][j];
            }
            lastIndex[i] = stacks[i].length - 1;
        }
        for (int i = 0; i < sums.length; i++) {
            if (minSum > sums[i])
                minSum = sums[i];
        }
        for (int i = 0; i < stacks.length; i++) {
            while (sums[i] > minSum) {
                sums[i] -= stacks[i][lastIndex[i]];
                lastIndex[i] -= 1;
            }
            if (sums[i] < minSum)
                minSum = sums[i];
        }
        return minSum;
    }
}
