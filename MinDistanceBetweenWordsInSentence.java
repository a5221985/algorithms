public class MinDistanceBetweenWordsInSentence {
    public int[] minDistance(String sentence, String word1, String word2) {
        int word1MaxIndexSoFar = -1;
        int word2MaxIndexSoFar = -1;
        int minDistance = Integer.MAX_VALUE;
        int wordCount = 0;
        int currentDistance = 0;
        int word1Index = -1;
        int word2Index = -1;
        for (int i = 0, j = 1; i < sentence.length() && j <= sentence.length(); j++) {
            if (j == sentence.length() || sentence.charAt(j) == ' ') {
                System.out.println(wordCount + ":\t" + sentence.substring(i, j));
                if (sentence.substring(i, j).equals(word1)) {
                    word1MaxIndexSoFar = wordCount;
                    if (word2MaxIndexSoFar != -1 && (currentDistance = word1MaxIndexSoFar - word2MaxIndexSoFar - 1) < minDistance) {
                        minDistance = currentDistance;
                        word1Index = word1MaxIndexSoFar;
                        word2Index = word2MaxIndexSoFar;
                    }
                } else if (sentence.substring(i, j).equals(word2)) {
                    word2MaxIndexSoFar = wordCount;
                    if (word1MaxIndexSoFar != -1 && (currentDistance = word2MaxIndexSoFar - word1MaxIndexSoFar - 1) < minDistance) {
                        minDistance = currentDistance;
                        word1Index = word1MaxIndexSoFar;
                        word2Index = word2MaxIndexSoFar;
                    }
                }
                i = j + 1;
                wordCount++;
            }
        }
        return new int [] {minDistance, word1Index, word2Index};
    }

    public static void main(String[] args) {
        MinDistanceBetweenWordsInSentence mdbwis = new MinDistanceBetweenWordsInSentence();
        String sentence = "dog cat hello cat dog dog hello cat cat world cat dog dog cat cat hello";
        String word1 = "hello";
        String word2 = "world";
        int[] params = mdbwis.minDistance(sentence, word1, word2);
        System.out.println("Min distance between '" + word1 + "' and '" + word2 + "' is " + params[0]);
        System.out.println("Index of '" + word1 + "' is: " + params[1]);
        System.out.println("Index of '" + word2 + "' is: " + params[2]);
    }
}
