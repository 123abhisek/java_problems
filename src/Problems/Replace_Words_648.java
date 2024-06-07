package Problems;

import java.util.Arrays;
import java.util.List;

public class Replace_Words_648 {
	public static String replaceWords(List<String> dictionary, String sentence) {

		String[] strArr = sentence.split(" ");
		int i = 0, j = 0;
		while (i < dictionary.size()) {
			
			i++;
		}

		return sentence;
	}

	public static void main(String[] args) {
		List<String> dictionary = Arrays.asList("cat", "bat", "rat");
		String sentence = "the cattle was rattled by the battery";

		replaceWords(dictionary, sentence);

	}

}
