public class Trim {
    public int myAtoi(String s) {
        s = trim(s);
        boolean isNegative = false;
        int i = 0;
        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        int num = 0;
        int prevNum = 0;
        while (i < s.length()) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return 0;
            num = 10 * num + (s.charAt(i) - '0');
            i++;
            System.out.println(num);
            if (num < prevNum)
                return -2147483648;
            prevNum = num;
        }
        return isNegative? -num: num;
    }

    String trim(String s) {
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (!found) {
                if (s.charAt(i) == ' ')
                    continue;
            } else {
                if (s.charAt(i) == ' ')
                    break;
            }
            sb.append("" + s.charAt(i));
            found = true;
        } 
        return sb.toString();
    }

    public static void main(String[] args) {
        Trim t = new Trim();
        String str = "      -42";
        String str2 = "-91283472332";
        System.out.println(t.trim(str));
        System.out.println(t.myAtoi(str2));
    }
}
