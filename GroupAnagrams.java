import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new LinkedList<>();
        if (strs.length < 2) {
            List<String> group = new LinkedList<>(Arrays.asList(strs[0]));
            List<List<String>> groups = new LinkedList<>(Arrays.asList(group));
            return groups;
        }
        Map<Map<Character, Integer>, List<String>> groupMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> strMap = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (strMap.containsKey(strs[i].charAt(j)))
                    strMap.replace(strs[i].charAt(j), strMap.get(strs[i].charAt(j)) + 1);
                else
                    strMap.put(strs[i].charAt(j), 1);
            }
            if (groupMap.containsKey(strMap)) {
                List<String> group = groupMap.get(strMap);
                group.add(strs[i]);
            } else {
                List<String> group = new LinkedList<>(Arrays.asList(strs[i]));
                groupMap.put(strMap, group);
            }
        }
        System.out.println(groupMap);
        List<List<String>> groups = new LinkedList<>();
        for (List<String> group : groupMap.values())
            groups.add(group);
        return groups;
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = ga.groupAnagrams(strs);
        System.out.println(groups);
    }
}
