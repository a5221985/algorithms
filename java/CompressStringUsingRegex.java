import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CompressStringUsingRegex {
    public String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Pattern pattern = null;
        Matcher matcher = null;
        char ch;
        int end = 0;
        int length = 0;
        while (i < input.length()) {
            ch = input.charAt(i);
            pattern = Pattern.compile(ch + "+");
            matcher = pattern.matcher(input);
            matcher.find();
            end = matcher.end();
            length = end - i;
            sb.append("" + ch + length);
            i = end;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CompressStringUsingRegex csur = new CompressStringUsingRegex();

        String input = "abbbbbccdddefffffffffffgghhijklllllmmmnooooopqrrrsttttttuvvvvvvwwwxxyz";

        System.out.println(input);
        System.out.println(csur.compress(input));
    }
}
