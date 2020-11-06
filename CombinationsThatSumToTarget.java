import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class CombinationsThatSumToTarget {
    private Map<Integer, List<List<Integer>>> cache;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        cache = new HashMap<>();
        return _combinationSum(candidates, target);
    }

    List<List<Integer>> _combinationSum(int[] candidates, int target) {
        if (cache.containsKey(target))
            return cache.get(target);
        int min = candidates[0];
        boolean sameValueFound = false;
        for (int i = 0; i < candidates.length; i++) {
            if (min > candidates[i])
                min = candidates[i];
            if (target == candidates[i])
                sameValueFound = true;
        }
        if (target < min)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (sameValueFound)
            list.add(new ArrayList<>(Arrays.asList(target)));
        for (int i = 0; i < candidates.length; i++) {
            if (target > candidates[i]) {
                int newTarget = target - candidates[i];
                System.out.println("New target: " + newTarget);
                List<List<Integer>> subList = combinationSum(candidates, newTarget);
                System.out.println(subList);
                for (List<Integer> sub : subList) {
                    System.out.println("The last melon: " + sub.get(sub.size() - 1));
                    System.out.println("candidates[" + i + "]: " + candidates[i]);
                    if (sub.get(sub.size() - 1) <= candidates[i]) {
                        List<Integer> newSub = new ArrayList<>(sub);
                        newSub.add(candidates[i]);
                        list.add(newSub);
                    }
                }
            }
        }
        cache.put(target, list);
        return list;
    }

    public static void main(String[] args) {
        CombinationsThatSumToTarget ctstt = new CombinationsThatSumToTarget();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> list = ctstt.combinationSum(candidates, target);
        System.out.println(list);
    }
}
