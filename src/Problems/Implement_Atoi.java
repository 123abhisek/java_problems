package Problems;

// Implement Atoi                   --> 02/02/2024    Geek for Geeks

public class Implement_Atoi {

	public static int atoi(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(s1.length() - 1) == 45)||(s1.charAt(i) >= 58 && s1.charAt(i) <= 127)) {
				return -1;
			}

		}

		return Integer.parseInt(s1);

	}

	public static void main(String[] args) {
		String s = "12a";

		System.out.println(atoi(s));
		System.out.println(((Object) s.charAt(1)).getClass().getName());

	}

}
