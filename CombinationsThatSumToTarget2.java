import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class CombinationsThatSumToTarget2 {
    private Map<Integer, List<List<Integer>>> cache;
    private Map<Integer, Integer> frequency;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        cache = new HashMap<>();
        frequency = new HashMap<>();
        for (int i = 0; i < candidates.length; i++) {
            if (frequency.containsKey(candidates[i]))
                frequency.replace(candidates[i], frequency.get(candidates[i]) + 1);
            else
                frequency.put(candidates[i], 1);
        }
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
            if (target > candidates[i] && frequency.containsKey(candidates[i])) {
                int newTarget = target - candidates[i];
                System.out.println("New target: " + newTarget);
		if (frequency.get(candidates[i]) <= 1)
		    frequency.remove(candidates[i]);
		else
		    frequency.replace(candidates[i], frequency.get(candidates[i]) - 1);
                List<List<Integer>> subList = combinationSum(candidates, newTarget);
                System.out.println(subList);
                for (List<Integer> sub : subList) {
                    System.out.println("The last melon: " + sub.get(sub.size() - 1));
                    System.out.println("candidates[" + i + "]: " + candidates[i]);
                    if (sub.get(sub.size() - 1) <= candidates[i] && frequency.containsKey(candidates[i])) {
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
        CombinationsThatSumToTarget2 ctstt2 = new CombinationsThatSumToTarget2();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> list = ctstt2.combinationSum(candidates, target);
        System.out.println(list);
    }
}
