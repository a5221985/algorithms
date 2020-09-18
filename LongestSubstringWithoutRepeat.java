public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeat lswr = new LongestSubstringWithoutRepeat();
        String str = "abcabcbb";
        int length = lswr.find(str);
        System.out.println(length);
    }
}
