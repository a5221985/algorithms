public class ReverseStringAsArray {
    public String reverse(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        for (int i = 0, j = charArray.length - 1; i < length; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        ReverseStringAsArray rsaa = new ReverseStringAsArray();
        String str = "abcdefghijklmnopqrstuvwxyz";
        String reversed = rsaa.reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
