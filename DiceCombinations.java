import java.util.Map;
import java.util.HashMap;

class DiceCombinations {
    Map<Integer, Map<Integer, Integer>> cache = new HashMap<>();
    public int numRollsToTarget(int d, int f, int target) {
        System.out.println(cache);
        if (cache.containsKey(d))
            if (cache.get(d).containsKey(target))
                return cache.get(d).get(target);
        if (d == 0)
            return 0;
        if (d == 1) {
            if (target >= 1 && target <= f) {
                Map<Integer, Integer> targetMap = new HashMap<>();
                targetMap.put(target, 1);
                cache.put(d, targetMap);
                return 1;
            }
            else
                return 0;
        }
        int num = 0;
        int val = 0;
        for (int i = 1; i <= f; i++) {
            val = numRollsToTarget(d - 1, f, target - i);
            Map<Integer, Integer> targetMap = new HashMap<>();
            targetMap.put(target - i, val);
            cache.put(d, targetMap);
            num += val;
        }
        return num;
    }

    public static void main(String[] args) {
        DiceCombinations dc = new DiceCombinations();
        int d = 3;
        int f = 6;
        int target = 12;
        System.out.println(dc.numRollsToTarget(d, f, target));
    }
}
