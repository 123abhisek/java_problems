package Problems;

// 		Find the N-th character

public class Find_the_Nth_character {

	public static char nthCharacter(String s, int r, int n) {
		while (r > 0) {
			StringBuilder sb = new StringBuilder(s.length() * r);
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '1') {
					sb.append("10");
				} else {
					sb.append("01");
				}
			}
			s = sb.toString();
			r--;
		}

		return s.charAt(n);
	}

	public static void main(String[] args) {

//		String s = "1010";
//		int r = 1;
//		int n = 2;
		String s = "1100";
		int r = 2;
		int n = 3;

		System.out.println(nthCharacter(s, r, n));

	}

}
