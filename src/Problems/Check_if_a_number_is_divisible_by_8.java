package Problems;


// 		Check if a number is divisible by 8

public class Check_if_a_number_is_divisible_by_8 {

	static int DivisibleByEight(String s) {

		int len = s.length();
		if (len <= 3) {
			return (Integer.parseInt(s) % 8 == 0) ? 1 : -1;
		}
		StringBuilder s1 = new StringBuilder();
		for (int i = 1; i <= 3; i++) {
			s1.append(s.charAt(len - i));
		}
		return (Integer.parseInt(s1.reverse().toString()) % 8 == 0) ? 1 : -1;
	}

	public static void main(String[] args) {

		String s = "1048575";
		System.out.println(DivisibleByEight(s));

	}

}
