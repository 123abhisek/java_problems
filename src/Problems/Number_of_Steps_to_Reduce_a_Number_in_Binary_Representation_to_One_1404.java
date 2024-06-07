package Problems;

import java.math.BigInteger;

public class Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One_1404 {

	public static int numSteps(String s) {
		int count = 0;

		// Convert the binary string to a BigInteger
		BigInteger decimal = new BigInteger(s, 2);
		BigInteger even = new BigInteger("2");
		BigInteger odd = new BigInteger("1");

		// Process the decimal value until it is reduced to 1
		while (decimal.compareTo(BigInteger.ONE) > 0) {
			if (decimal.mod(even).equals(BigInteger.ZERO)) {
				decimal = decimal.divide(even);
			} else {
				decimal = decimal.add(odd);
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
//		String s = "1101";// Output: 6
		String s = "1111011110000011100000110001011011110010111001010111110001";// Output: 85

		System.out.println(numSteps(s));
	}

}
