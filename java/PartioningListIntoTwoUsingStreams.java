import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;

public class PartioningListIntoTwoUsingStreams {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Map<Boolean, List<Integer>> groups = items.stream().collect(Collectors.partitioningBy(s -> s > 6));
        List<List<Integer>> subSets = new ArrayList<List<Integer>> (groups.values());
        System.out.println(subSets);
    }
}
