package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Sort Character by frequency   ==> 451

public class Sort_Character_by_Frequency {

	public static String frequencySort(String s) {

		Map<Character, Integer> maps = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (maps.containsKey(s.charAt(i))) {
				int val = maps.get(s.charAt(i));
				maps.put(s.charAt(i), val + 1);
			} else {
				maps.put(s.charAt(i), 1);
			}
		}

		List<Character> sortedChar = new ArrayList<Character>(maps.keySet());
		Collections.sort(sortedChar, (a, b) -> maps.get(b) - maps.get(a));
		String result = "";
		for (Character s4 : sortedChar) {
			result += String.valueOf(s4).repeat(maps.get(s4));
		}

		return result;
	}

	public static void main(String[] args) {

//		String s = "tree"; // "eert"
//		String s = "Aabb"; //"bbAa"
		String s = "cccaaa"; // "aaaccc"

		System.out.println(frequencySort(s));

	}

}
