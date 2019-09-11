import java.util.List;
import java.util.ArrayList;

public class MatchingPairs {
    private List<String> pairs = new ArrayList<>();

    public void computeMatchingPairs(int n) {
        if (n == 1) {
            pairs.add("()");
            return;
        }
        computeMatchingPairs(n - 1);
        int i = pairs.size() - 1;
        int length = pairs.get(i).length();
        if (i >= 0) {
            String p = "";
            do {
                p = pairs.get(i);
                pairs.add("()" + p);
                pairs.add("(" + p + ")");
                //if (p.length() > 2)
                //    pairs.add(p + "()");
                i--;
            } while (i >= 0 && p.length() == length);
        }
    }

    public String toString() {
        return pairs.toString();
    }

    public static void main(String[] args) {
        MatchingPairs mp = new MatchingPairs();
        mp.computeMatchingPairs(4);
        System.out.println(mp);
    }
}
