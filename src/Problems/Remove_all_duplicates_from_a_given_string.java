package Problems;

import java.util.ArrayList;

// 		Remove all duplicates from a given string

public class Remove_all_duplicates_from_a_given_string {

	static String removeDuplicates(String str) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (!list.contains(str.charAt(i))) {
				list.add(str.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder(str.length());
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "HaPpyNewYear"; // HaPpyNewYr
//		String str = "geEksforGEeks"; // geEksforG

		System.out.println(removeDuplicates(str));
	}

}
