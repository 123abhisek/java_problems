package sample;

import java.util.Set;
import java.util.TreeSet;

public class CheckPanagram {

	public static void main(String[] args) {
		String str = "Bawds jog, flick quartz, vex nymph";

		System.out.println(checkPanagram(str));
	}

	private static boolean checkPanagram(String str) {
		String lo_str = str.toLowerCase();
		Set<Character> charSetStr = new TreeSet<Character>();

		for (int i = 0; i < lo_str.length(); i++) {
			char val = lo_str.charAt(i);

			if (val >= 97 && val <= 122) {
				charSetStr.add(val);
			}
		}

		return (charSetStr.size() == 26) ? true : false;

	}

}
