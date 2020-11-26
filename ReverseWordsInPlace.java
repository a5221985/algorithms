public class ReverseWordsInPlace {
    public void reverseWords(char[] sentence) {
        reverseAllCharsInRange(sentence, 0, sentence.length);
        for (int i = 0, j = 0; j <= sentence.length; j++) {
            if (j < sentence.length && sentence[j] == ' ' || j == sentence.length) {
                reverseAllCharsInRange(sentence, i, j);
                i = j + 1;
            }
        }
    }

    void reverseAllCharsInRange(char[] sentence, int i, int j) {
        int length = (j - i) >> 1;
        int lastIndex = j - 1;
        for (int k = 0; k < length; k++)
	    swap(sentence, k + i, lastIndex - k); 
    }

    void swap(char[] sentence, int i, int j) {
        char temp = sentence[i];
        sentence[i] = sentence[j];
        sentence[j] = temp;
    }

    public void print(char[] sentence) {
	for (int i = 0; i < sentence.length; i++)
	    System.out.print(sentence[i]);
	System.out.println();
    }

    public static void main(String[] args) {
	ReverseWordsInPlace rwip = new ReverseWordsInPlace();
	char[] sentence = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's',     't', 'e', 'a', 'l'};
	rwip.print(sentence);
	rwip.reverseWords(sentence);
	rwip.print(sentence);
    }
}

