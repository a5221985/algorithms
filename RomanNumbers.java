import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("deprecation")
public class RomanNumbers {
    private Map<Integer, String> map = new HashMap<>();
    private List<Integer> list;

    public RomanNumbers() {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        list = new ArrayList<>(Arrays.asList(1, 5, 10, 50, 100, 500, 1000));
    }

    public String iToR(Integer num) {
        if (map.containsKey(num))
            return map.get(num);
        Integer closestMatch = searchForClosestMatch(num);
        if (closestMatch > num)
            return iToR(closestMatch - num) + map.get(closestMatch);
        else
            return map.get(closestMatch) + iToR(num - closestMatch);
    }

    public Integer searchForClosestMatch(Integer num) {
        int index = binarySearch(num);
        if ((list.get(index) < num) && (index < list.size() - 1) && ((num - list.get(index)) > (list.get(index + 1) - num)))
            return list.get(index + 1);
        if ((list.get(index) > num) && (index > 0) && ((list.get(index) - num) > (num - list.get(index - 1))))
            return list.get(index - 1);
        return list.get(index);
    }

    public int binarySearch(Integer num) {
        int low = 0;
        int high = list.size() - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (num == list.get(mid))
                return mid;
            else if (num < list.get(mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println("Alhamdulillah");

        RomanNumbers rn = new RomanNumbers();
        System.out.println(rn.iToR(new Integer(args[0])));
    }
}
