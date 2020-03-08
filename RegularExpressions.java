public class RegularExpressions {
    public boolean match(String regex, String str) {
        String subRegex = null; 
        String operator = regex.substring(regex.length() - 1, regex.length());
        boolean state = true;

        if (regex.charAt(regex.length() - 2) == ')' && regex.charAt(0) == '(')
            subRegex = regex.substring(1, regex.length() - 2);
        else
            subRegex = regex.substring(regex.length() - 2, regex.length() - 1);

        switch (operator) {
        case "*":
            state = verifySubRegex(subRegex, 0, -1, str);
            break;
        case "+":
            state = verifySubRegex(subRegex, 1, -1, str);
            break;
        case "?":
            state = verifySubRegex(subRegex, 0, 1, str);
            break;
        }
        return state;
    }
    
    boolean verifySubRegex(String subRegex, int minCount, int maxCount, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i += subRegex.length()) {
            if ((i + subRegex.length()) > str.length() || !subRegex.equals(str.substring(i, i + subRegex.length()))) {
                return false;
            }
            count++;
        }
        return count >= minCount && ((maxCount != -1)? count <= maxCount: true);
    }

    public static void main(String[] args) {
        String regex = "(aa)+";
        String str = "aa";

        RegularExpressions re = new RegularExpressions();

        System.out.println("Does " + str + " satisfy " + regex + "? " + re.match(regex, str));
    }
}
