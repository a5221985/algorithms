import java.util.Map;
import java.util.HashMap;

public class ReachingGame {
    private Integer[] A;
    private Integer[] P;
    private Map<Integer, Boolean> r = new HashMap<>();

    public ReachingGame(Integer[] A) {
        this.A = A;
        this.P = new Integer [A.length];
    }

    public Boolean isReachable(Integer[] A) {
        if (A.length == 0)
            return true;
        return isReachable(A, A.length - 1);
    }

    public Boolean isReachable(Integer[] A, int index) {
        if (r.keySet().contains(index))
            return r.get(index);

        if (index == 0) {
            r.put(index, true);
            P[0] = index;
            return true;
        }
        
        Boolean reachable = false;
        Boolean reachablePrev = false;
  
        for (int i = index - 1; i >= 0; i--) {
            reachablePrev = isReachable(A, i);
            if (reachablePrev)
                P[i] = index;
            reachable = reachable || (reachablePrev && A[i] > (index - i));
        }

        r.put(index, reachable);
        return reachable;
    }

    public static void main(String[] args) {
        
    }
}
