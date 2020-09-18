import java.util.Map;
import java.util.HashMap;

public class NumOfPathsInMatrix {
    private Map<int[], Integer> map = new HashMap<>();    

    public int find(int[] start, int[] end) {
        if (map.containsKey(end))
            return map.get(end);
        if (end[0] == 1 && end[1] == 0 || end[0] == 0 && end[1] == 1) {
            map.put(end, 1);
            return 1;
        }
        int numOfPaths = ((end[1] > 0)? find(start, new int[] {end[0], end[1] - 1}): 0) + ((end[0] > 0)? find(start, new int[] {end[0] - 1, end[1]}): 0);
        map.put(end, numOfPaths);
        return numOfPaths;
    }

    public static void main(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("Usage: java NumOfPathsInMatrix.java <rows> <columns>");
            return;
        }
        NumOfPathsInMatrix nopim = new NumOfPathsInMatrix();
        int[] start = {0, 0};
        int[] end = {Integer.parseInt(args[0]) - 1, Integer.parseInt(args[1]) - 1};
        System.out.println(nopim.find(start, end));
    }
}
