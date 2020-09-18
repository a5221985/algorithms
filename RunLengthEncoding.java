public class RunLengthEncoding {
    public String encode(String str) {
        if (str == null || str.length() == 0)
            return "";
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < str.length()) {
            if (str.charAt(j) != str.charAt(i)) {
                sb.append(str.substring(i, j).length()).append(str.charAt(i));
                i = j;
            }
            j++;
        }
        if (i < str.length())
            sb.append(str.substring(i, j).length()).append(str.charAt(i));
        return sb.toString();
    }

    public String decode(String encoded) {
        if (encoded == null || encoded.length() == 0)
            return "";
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < encoded.length()) {
            int digit = (int)(encoded.charAt(j) - '0');
            if (digit < 0 || digit > 9) {
                int times = Integer.parseInt(encoded.substring(i, j));
                for (int k = 0; k < times; k++)
                    sb.append(encoded.charAt(j));
                i = j + 1;
            }
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RunLengthEncoding rle = new RunLengthEncoding();
        String str = "AAAABBBCCDAAEEEEEEFFGGGHIIIIIIIIIIJJKKKKKLMMNNNNOPPPPQQQRSSTUUUVVVVVWWXYYYYZZ";
        System.out.println(str);
        String encoded = rle.encode(str);
        System.out.println(encoded);
        String decoded = rle.decode(encoded);
        System.out.println(decoded);
    }
}
