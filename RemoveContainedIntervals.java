import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveContainedIntervals {
    public List<List<Integer>> optimize(List<List<Integer>> intervals) {
        Collections.sort(intervals, (interval1, interval2) -> {
            if (interval1.get(0) == interval2.get(0))
                return interval1.get(1) - interval2.get(1);
            return interval1.get(0) - interval2.get(0);
        });
        System.out.println(intervals);

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).get(1) <= intervals.get(i - 1).get(1))
                intervals.remove(i);
        }
        return intervals;
    }

    public static void main(String[] args) {
        RemoveContainedIntervals rci = new RemoveContainedIntervals();
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 4));
        intervals.add(Arrays.asList(3, 6));
        intervals.add(Arrays.asList(2, 8));
        System.out.println(rci.optimize(intervals));
    }
}
