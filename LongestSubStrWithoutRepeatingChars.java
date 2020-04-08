import java.util.Map;
import java.util.HashMap;

public class LongestSubStrWithoutRepeatingChars {
    public String length(String s) {
        int i = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();
        String maxSubStr = "";
        while (i < s.length() && j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                i = map.get(s.charAt(j)) + 1;
                map.clear();
                j = i;
            } else {
                String subStr = s.substring(i, j + 1);
                if (maxSubStr.length() < subStr.length())
                    maxSubStr = subStr;
                map.put(s.charAt(j), j);
                j++;
            }
            System.out.println(map);
        }
        return maxSubStr;
    }

    public static void main(String[] args) {
        LongestSubStrWithoutRepeatingChars lsswrc = new LongestSubStrWithoutRepeatingChars();
        //String str = "abcabcbb";
        String str = "pwwkew";
        System.out.println(lsswrc.length(str));
    }
}
