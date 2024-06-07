package Problems;

import java.util.*;

class TrieNode {
	Map<Character, TrieNode> children = new HashMap<>();
	boolean isEndOfWord = false;
}

class Trie {
	private TrieNode root = new TrieNode();

	public void insert(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			node = node.children.computeIfAbsent(c, k -> new TrieNode());
		}
		node.isEndOfWord = true;
	}

	public String searchShortestPrefix(String word) {
		TrieNode node = root;
		StringBuilder prefix = new StringBuilder();
		for (char c : word.toCharArray()) {
			if (!node.children.containsKey(c))
				return word;
			node = node.children.get(c);
			prefix.append(c);
			if (node.isEndOfWord)
				return prefix.toString();
		}
		return word;
	}
}

public class Replace_Words_648 {
	public static String replaceWords(List<String> dictionary, String sentence) {

		Trie trie = new Trie();
		for (String root : dictionary) {
			trie.insert(root);
		}

		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = trie.searchShortestPrefix(words[i]);
		}

		return String.join(" ", words);
	}

	public static void main(String[] args) {
		List<String> dictionary = Arrays.asList("cat", "bat", "rat");
		String sentence = "the cattle was rattled by the battery";

		System.out.println(replaceWords(dictionary, sentence));

	}

}
