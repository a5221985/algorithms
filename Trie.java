import java.util.Map;
import java.util.HashMap;

public class Trie {
	class TrieNode {
		char character;
		Map<Character, TrieNode> suffixes;
		boolean isTerminal = false;

		TrieNode(char character) {
			this.character = character;
			this.suffixes = new HashMap<>();
		}
	}

	TrieNode root = new TrieNode('\0');

	public void insert(String word) {
		int i = 0;
		TrieNode current = root;
		while (i < word.length() && current.suffixes.containsKey(word.charAt(i))) {
			current = current.suffixes.get(word.charAt(i));
			i++;
		}

		while (i < word.length()) {
			TrieNode newNode = new TrieNode(word.charAt(i));
			current.suffixes.put(word.charAt(i), newNode);
			current = newNode;
			i++;
		}

		current.isTerminal = true;
	}

	public boolean search(String word) {
		TrieNode current = root;
		int i = 0;
		while (i < word.length()) {
			if (!current.suffixes.containsKey(word.charAt(i))) {
				return false;
			}
			current = current.suffixes.get(word.charAt(i));
			i++;
		}

		if (!current.isTerminal) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Trie trie = new Trie();

		trie.insert("apple");
		trie.insert("ape");
		trie.insert("blas");
		trie.insert("blast");
		trie.insert("cat");
		trie.insert("ca");

		System.out.println("ap: " + trie.search("ap"));
		System.out.println("ape: " + trie.search("ape"));
		System.out.println("apple: " + trie.search("apple"));
		System.out.println("apt: " + trie.search("apt"));
		System.out.println("blas: " + trie.search("blas"));
		System.out.println("blast: " + trie.search("blast"));
		System.out.println("cap: " + trie.search("cap"));
		System.out.println("cat: " + trie.search("cat"));
		System.out.println("ca: " + trie.search("ca"));
	}
}
