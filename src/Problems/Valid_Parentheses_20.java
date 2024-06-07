package Problems;

public class Valid_Parentheses_20 {

	public static boolean isValid(String s) {

		boolean valid = false;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == '(' && s.charAt(i) == ')') {
				valid = true;
			} else if (s.charAt(i - 1) == '[' && s.charAt(i) == ']') {
				valid = true;
			} else if (s.charAt(i - 1) == '{' && s.charAt(i) == '}') {
				valid = true;
			} else {
				valid = false;
			}
		}
		return valid;
		
	}

	public static void main(String[] args) {

//		String s = "()[]{}"; // true
//		String s = "()"; // true
//		String s = "(]"; // false
		String s = "{[]}"; // true

		System.out.println(isValid(s));
	}

}
