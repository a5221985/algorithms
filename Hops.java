import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Hops {
    public List<List<Integer>> find(int[] steps) {
        if (steps == null || steps.length == 0)
            return new ArrayList<>();
        Map<Integer, List<List<Integer>>> cache = new HashMap<>();
        find(steps, 0, cache);
        return cache.get(0);
    }

    List<List<Integer>> find(int[] steps, int currentIndex, Map<Integer, List<List<Integer>>> cache) {
        if (cache.containsKey(currentIndex))
            return cache.get(currentIndex);
        if (currentIndex > steps.length - 1)
            return new ArrayList<>();
        if (currentIndex == steps.length - 1) {
            cache.put(currentIndex, new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0)))));
            return cache.get(currentIndex);
        }
        if (currentIndex < steps.length - 1 && steps[currentIndex] == 0)
            return new ArrayList<>();
        List<List<Integer>> options = new ArrayList<>();
        for (int i = 1; i <= steps[currentIndex]; i++ ) {
            List<List<Integer>> subOptions = find(steps, currentIndex + i, cache);
            if (subOptions != null && subOptions.size() != 0) {
                for (List<Integer> subOption : subOptions) {
                    List<Integer> option = new ArrayList(Arrays.asList(i));
                    option.addAll(subOption);
                    options.add(option);
                    cache.put(currentIndex, options);
                }
            }
        }
        return cache.get(currentIndex);
    }

    public static void main(String[] args) {
        //int[] steps = new int [] {2, 0, 1, 0};
        //int[] steps = new int [] {1, 1, 0, 1};
        int[] steps = new int [] {2, 0, 1, 3, 0, 2, 3, 1, 0, 4, 2, 0, 1, 1, 4, 2, 0};
        Hops hops = new Hops();
        System.out.println("INPUT: ");
        for (int i = 0; i < steps.length; i++)
            System.out.print(steps[i] + " ");
        System.out.println();
        List<List<Integer>> sequence = hops.find(steps);
        System.out.println("OUTPUT: ");
        System.out.println(sequence);
    }
}
