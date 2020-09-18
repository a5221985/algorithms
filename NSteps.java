import java.util.*;

public class NSteps {
    Map<Integer, Integer> ways = new HashMap<>();
    
    public int solve(int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1) {
            if (!ways.containsKey(n))
                ways.put(n, 1);
            return 1;
        }
        if (ways.containsKey(n))
            return ways.get(n);
        int numWays = solve(n - 1) + solve(n - 2);
        ways.put(n, numWays);
        return numWays;
    }

    public static void main(String[] args) {
        NSteps nSteps = new NSteps();
        System.out.println(nSteps.solve(Integer.parseInt(args[0])));
    }
}
