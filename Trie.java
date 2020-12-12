import java.util.Map;
import java.util.HashMap;

public class Trie {
    private TrieNode root = new TrieNode();

    public void insert(String word) {
        if (word == null || word.length() == 0)
            return;
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            if (!current.nextCharMap.containsKey(word.charAt(i))) {
                current.nextCharMap.put(word.charAt(i), new TrieNode(word.charAt(i), current));
            } else {
                if (i == word.length() - 1)
                    current.nextCharMap.get(word.charAt(i)).isLastLetterInWord = true;
            }
            current = current.nextCharMap.get(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String word1 = "code";
        trie.insert(word1);
    }
}

class TrieNode {
    char c;
    Map<Character, TrieNode> nextCharMap = new HashMap<>();
    TrieNode parent;
    boolean isLastLetterInWord;

    TrieNode() {
    }

    TrieNode(char c, TrieNode parent) { 
        this.c = c; 
        this.parent = parent; 
    }
}
