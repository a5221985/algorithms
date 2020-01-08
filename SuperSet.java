import java.util.*;

public class SuperSet {
    public Set<Set<Character>> superSet(Set<Character> set) {
        if (set.isEmpty()) {
            Set<Set<Character>> s0 = new HashSet<>();
            s0.add(set);
            return s0;
        }
        Character c = set.iterator().next();
        Set<Character> sub = new HashSet<>(set);
        sub.remove(c);
        Set<Set<Character>> S = superSet(sub);
        Set<Set<Character>> S1 = new HashSet<>();
        S1.addAll(S);
        for (Set<Character> s : S) {
            Set<Character> st = new HashSet<>();
            st.addAll(s);
            st.add(c);
            S1.add(st);
        }
        S.addAll(S1);
        return S;
    }

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));

        SuperSet ss = new SuperSet();

        Set<Set<Character>> superSet = ss.superSet(set);

        System.out.println(superSet);
    }
}
