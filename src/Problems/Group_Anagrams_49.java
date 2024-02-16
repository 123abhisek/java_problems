package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 49. Group Anagrams

public class Group_Anagrams_49 {

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> groupAnagrams = new HashMap<String, List<String>>();

		for(String word : strs) {
			char[] chaArray = word.toCharArray();
			Arrays.sort(chaArray);
			String key = new String(chaArray);
			
			if (groupAnagrams.containsKey(key)) {
				groupAnagrams.get(key).add(word);
			}else {
				groupAnagrams.put(key, new ArrayList<String>(List.of(word)));
			}
			
		}
		
		return new ArrayList<List<String>>(groupAnagrams.values());
	}

	public static void main(String[] args) {

		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(str));

	}

}
