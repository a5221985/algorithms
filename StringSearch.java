import java.util.Set;
import java.util.HashSet;

public class StringSearch {
    
    public String findLongestSubstrOfGivenNumOfChars(String str, int k) {
        int i = 0;
        int j = 0;
        String max = "";
        Set<Character> seen = new HashSet<>();
        while (j < str.length()) {
            System.out.println("i = " + i + " j = " + j );
            System.out.println(max);
            System.out.println(seen);
            if (seen.contains(str.charAt(j))) {
                max += str.charAt(j);
            } else {
                char removed = str.charAt(i);
                seen.remove(removed);
                seen.add(str.charAt(j));
                while (str.charAt(i) == removed)
                    i++;
                if (max.length() < (j - i + 1))
                    max = str.substring(i, j + 1);
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Alhamdulillah");
        StringSearch ss = new StringSearch();
        String str = "assdeeeddffffha";
        int k = 2;
        System.out.println(ss.findLongestSubstrOfGivenNumOfChars(str, k));
    }
}
