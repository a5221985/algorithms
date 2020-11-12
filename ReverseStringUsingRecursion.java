public class ReverseStringUsingRecursion {
    public String reverse(String str) {
        if (str == null || str.length() == 0)
            return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        ReverseStringUsingRecursion rsur = new ReverseStringUsingRecursion();
        String str = "abcdefghijklmnopqrstuvwxyz";
        String reversed = rsur.reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
