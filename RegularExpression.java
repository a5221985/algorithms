public class RegularExpression {
    public Boolean isRegular(String s) {
        if (s.length() == 1 && (s.equals("a") || s.equals("b")))
            return true;

        if (s.indexOf("|") == -1 && (s.charAt(0) == '(' && isRegular(s.substring(1, s.length - 1)) && s.charAt(s.length() - 1)))
            return true;

    }

    public static void main(String[] args) {
        
    }
}
