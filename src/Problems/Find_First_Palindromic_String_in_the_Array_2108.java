package Problems;

public class Find_First_Palindromic_String_in_the_Array_2108 {

	public static boolean isPalindrome(String S) {
		String str = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			str += S.charAt(i);
		}
		if (str.equals(S)) {
			return true;
		}
		return false;
	}

	public static String firstPalindrome(String[] words) {

		for (String str : words) {
			if (isPalindrome(str)) {
				return str;
			}
		}
		return "";
	}

	public static void main(String[] args) {

//		String[] words = { "abc", "car", "ada", "racecar", "cool" };
		String[] words = { "notapalindrome", "racecar" };

		System.out.println(firstPalindrome(words));

	}

}
