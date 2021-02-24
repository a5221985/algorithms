import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        
        Matcher matcher1 = pattern.matcher("aaaab");
        Matcher matcher2 = pattern.matcher("aaaabbb");

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
