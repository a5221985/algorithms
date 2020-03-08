import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

class MatchingParantheses {
    public Set<String> generateParentheses(int n) {
        if (n == 1)
            return new LinkedHashSet<>(Arrays.asList("()"));
        Set<String> set = generateParentheses(n - 1);
        Set<String> newSet = new LinkedHashSet<>();
        for (String s : set) {
            newSet.add("(" + s + ")");
            newSet.add("()" + s);
            newSet.add(s + "()");
        }
        return newSet;
    }

    public static void main(String[] args) {
        MatchingParantheses mp = new MatchingParantheses();

        System.out.println(mp.generateParentheses(4));
    }
}
