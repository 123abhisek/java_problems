package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// 		791. Custom Sort String

public class Custom_Sort_String_791 {

	public static String customSortString(String order, String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> k : map.entrySet()) {
			System.out.println("Key : "+k.getKey()+" value : "+k.getValue());
		}

		ArrayList<Character> arrlist = new ArrayList<Character>();
		for (int i = 0; i < order.length(); i++) {
			if (s.contains(String.valueOf(order.charAt(i)))) {
				arrlist.add(order.charAt(i));
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (!arrlist.contains(s.charAt(i))) {
				arrlist.add(s.charAt(i));
			}
			else {
				
			}
		}
		StringBuilder sb = new StringBuilder(arrlist.size());
		for (int i = 0; i < arrlist.size(); i++) {
			sb.append(arrlist.get(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String order = "kqep";
		String s = "pekeq";
		// output : kqeep

//		String order = "bcafg";
//		String s = "abcd";
//		// output : bcad

//		String order = "cba";
//		String s = "abcd";
//		// output : cbad

		System.out.println(customSortString(order, s));
	}
}
