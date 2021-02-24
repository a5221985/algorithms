import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitUsingRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ,.!]");
        String[] tokens = pattern.split("one two,alpha9 12!done.");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }
}
