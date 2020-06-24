public class ReverseWords {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        int i = s.length() - 1;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            if (s.charAt(i) == '.') {
                sb.append(s.substring(i + 1, j + 1)).append('.');
                j = i - 1;
            }
            i--;
        }
        sb.append(s.charAt(0));
        System.out.println(sb.toString());
    }
}
