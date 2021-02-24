public class StringRegexMatch {
    public static void main(String[] args) {
        String str = "abcdefghij";
        System.out.println(str + " matches a.*j: " + str.matches("a.*j"));
    }
}
