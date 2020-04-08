public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() == 0 || s.length() == 1 || numRows == 1)
            return s;
        int k = numRows * 2 - 2;
        int index = 0;
        int row = 0;
        int m = k;
        int p = numRows;
        StringBuilder sb = new StringBuilder();
        while (row < numRows) {
            index = row;
            while (index < s.length()) {
                sb.append(s.charAt(index));
                if (m > 0 && m < k && (index + m) < s.length())
                    sb.append(s.charAt(index + m));
                index = index + k;
            }
            p--;
            m = p * 2 - 2;
            row++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion zzc = new ZigZagConversion();
        String str = "PAYPALISHIRING";
        int numRows = 4;
        String zigZagStr = zzc.convert(str, numRows);
        System.out.println(zigZagStr);
    }
}
