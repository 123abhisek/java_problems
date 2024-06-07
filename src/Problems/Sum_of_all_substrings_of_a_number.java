package Problems;

import java.math.BigInteger;

public class Sum_of_all_substrings_of_a_number {

	public static long sumSubstrings(String s) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < s.length(); i++) {
			int j = i;
			while (j < s.length()) {
				BigInteger num = new BigInteger(s.substring(i, j + 1));
				sum = sum.add(num);
				j++;
			}
		}
		return sum.longValue();
	}

	public static void main(String[] args) {

//		String s = "1234";
		String s = "4949530612642323625417080671";
		System.out.println(sumSubstrings(s));
	}
}
