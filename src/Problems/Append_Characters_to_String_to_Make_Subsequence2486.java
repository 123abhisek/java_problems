package Problems;

public class Append_Characters_to_String_to_Make_Subsequence2486 {

	public static int appendCharacters(String s, String t) {

		int sIndex = 0, tIndex = 0;
		int sLength = s.length(), tLength = t.length();

		while (sIndex < sLength && tIndex < tLength) {
			if (s.charAt(sIndex) == t.charAt(tIndex)) {
				tIndex++;
			}
			sIndex++;
		}

		return tLength - tIndex;
	}

	public static void main(String[] args) {

//		String s = "coaching", t = "coding"; // output : 4
//		String s = "abcde", t = "a"; // output : 0
//		String s = "z", t = "abcde"; // output : 5
		String s = "lbg", t = "g"; // output : 0
		System.out.println(appendCharacters(s, t));

	}

}
