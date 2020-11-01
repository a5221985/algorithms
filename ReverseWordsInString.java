import java.util.StringTokenizer;
import java.util.Stack;

public class ReverseWordsInString {
    public String reverse(String str) {
        if (str == null || str.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str, " ");
        Stack<String> stack = new Stack<>();
        while (st.hasMoreTokens())
            stack.push(st.nextToken());
        sb.append(stack.pop());
        while (!stack.isEmpty())
            sb.append(" ").append(stack.pop());
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString rwis = new ReverseWordsInString();
        String str = "Hello World Here";
        System.out.println(rwis.reverse(str));
    }
}
