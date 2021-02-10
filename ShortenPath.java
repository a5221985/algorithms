import java.util.Stack;

public class ShortenPath {
    public String shorten(String path) {
        Stack<String> stack = new Stack<>();
        for (int i = 0, j = 1; j <= path.length(); j++) {
            if (j == path.length() || path.charAt(j) == '/') {
                if (path.substring(i, j).equals("/..")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else if (!path.substring(i, j).equals("/."))
                    stack.push(path.substring(i, j));
                i = j;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String item : stack)
            sb.append(item);
        return sb.toString();
    }

    public static void main(String[] args) {
        ShortenPath sp = new ShortenPath();
        String path = "/usr/bin/../bin/./scripts/../";
        System.out.println(path);
        System.out.println(sp.shorten(path));
    }
}
