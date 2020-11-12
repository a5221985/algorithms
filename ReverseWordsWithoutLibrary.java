public class ReverseWordsWithoutLibrary {
    // Time complexity: O(n), Additional space complexity: O(1) 
    public String reverseWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        int j = sentence.length();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) == ' ') {
                sb.append(sentence.substring(i + 1, j)).append(" ");
                j = i;
            }
        }
        sb.append(sentence.substring(0, j));
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsWithoutLibrary rwwl = new ReverseWordsWithoutLibrary();
        String sentence = "How do you reverse words in a given sentence without using any library method?";
        String reversed = rwwl.reverseWords(sentence);
        System.out.println(sentence);
        System.out.println(reversed);
    }
}
