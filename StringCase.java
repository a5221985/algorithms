public class StringCase {
    private String str;

    public StringCase(String str) {
        this.str = str;
    }

    // O(n) - where n is length of input string
    public String toLowerCase() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                sb.append((char)('a' + str.charAt(i) - 'A'));
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // O(n) - where n is length of input string
    public String toUpperCase() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                sb.append((char)('A' + str.charAt(i) - 'a'));
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringCase str = new StringCase("HeLlO");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
