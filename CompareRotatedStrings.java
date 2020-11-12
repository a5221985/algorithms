public class CompareRotatedStrings {
    public boolean compare(String str1, String str2) {
        if (str1 == null && str2 == null)
            return true;
        if (str1 == null || str2 == null)
            return false;
        if (str1.equals(str2))
            return true;
        int index = str2.indexOf(str1.charAt(0));
        int leftLength = index;
        int rightLength = str2.length() - index;
        return str1.substring(0, rightLength)
                   .equals(str2.substring(index)) 
               && 
               str1.substring(rightLength)
                   .equals(str2.substring(0, index));
    }

    public static void main(String[] args) {
        CompareRotatedStrings crs = new CompareRotatedStrings();
        String str1 = "abcdefgh";
        String str2 = "fghabcde";
        System.out.println(crs.compare(str1, str2));
    }
}
