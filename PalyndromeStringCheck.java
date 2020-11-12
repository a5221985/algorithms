public class PalyndromeStringCheck {
    public boolean isPalyndrome(String str) {
        if (str == null)
            return false;
        if (str.length() < 2)
            return true;
        int maxTraverseLength = str.length() / 2;
        for (int i = 0; i < maxTraverseLength; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalyndromeStringCheck psc = new PalyndromeStringCheck();
        String str = "abcdefgfedcba";
        System.out.println(psc.isPalyndrome(str));
    }
}
