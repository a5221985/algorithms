import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class LargestCommonSubstring {
    public String find(String str1, String str2) {
        if (str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0)
            return "";
        Map<Character, List<Integer>> map = prepareLookupTable(str1);
        return findLongestMatchingSubstring(map, str1, str2);
    }

    Map<Character, List<Integer>> prepareLookupTable(String str) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.get(str.charAt(i)).add(i);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(str.charAt(i), list);
            }
        }
        return map;
    }

    String findLongestMatchingSubstring(Map<Character, List<Integer>> lookupTable, String str1, String str2) {
        String substring = "";
        for (int i = 0; i < str2.length(); i++) {
            if (lookupTable.containsKey(str2.charAt(i))) {
                for (Integer index : lookupTable.get(str2.charAt(i))) {
                    int lastIndex1 = index + 1;
                    int lastIndex2 = i + 1;
                    while (lastIndex1 < str1.length() && lastIndex2 < str2.length() && str1.substring(index, lastIndex1).equals(str2.substring(i, lastIndex2))) {
                        lastIndex1++;
                        lastIndex2++;
                    }
                    if (lastIndex1 <= str1.length() && substring.length() < str1.substring(index, lastIndex1).length())
                        substring = str1.substring(index, lastIndex1);
                }
            }
        }
        return substring;
    }

    public static void main(String[] args) {
        LargestCommonSubstring lcs = new LargestCommonSubstring();
        String str1 = "streetdogboy";
        String str2 = "hotdogbuddy";
        System.out.println(lcs.find(str1, str2));
    }
}
