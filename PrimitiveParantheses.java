import java.util.List;
import java.util.ArrayList;

public class PrimitiveParantheses {
    public String removeOuterParentheses(String S) {
        int c = 0;
        int s = 0;
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                c++;
            else
                c--;
            if (c == 0) {
                subs.add(S.substring(s, i + 1));
                s = i + 1;
            }
        }
        for (String str : subs) {
            System.out.println(str);
        }
        return null;
    }

    public static void main(String[] args) {
        PrimitiveParantheses pp = new PrimitiveParantheses();
        //pp.removeOuterParentheses("(()())(())");
        pp.removeOuterParentheses("(()())(())(()(()))");
    }
}
