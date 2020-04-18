import java.util.Map;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public Integer[] find(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] max = {-1, 0};
        for (int i = 0; i < array.length; i++) {
            Integer prev = array[i] - 1;
            Integer next = array[i] + 1;
            Integer length = 1;
            Integer seqLength = 1;
            Integer seqNum = -1;
            if (map.containsKey(prev)) {
                length = map.get(prev) + 1;
                map.put(array[i], length);
                seqLength = length;
                seqNum = array[i];
            }
            if (map.containsKey(next)) {
                length = map.get(array[i]);
                seqLength = length + 1;
                map.put(next, seqLength);
                seqNum = next;
            }
            map.put(array[i], length);
            if (max[1] < seqLength) {
                max[0] = seqNum;
                max[1] = seqLength;
            }
        }
        return max;
    }

    public void printSequence(Integer[] seq) {
        System.out.print("[");
        for (int i = 0; i < seq[1]; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(seq[0] - seq[1] + i + 1);
        }
        System.out.println("]");
    }    

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        Integer[] array = {100, 4, 200, 1, 2, 3};
        Integer[] seq = lcs.find(array);
        lcs.printSequence(seq);
    }
}
