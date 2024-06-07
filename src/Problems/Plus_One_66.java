package Problems;

import java.util.ArrayList;
import java.util.Arrays;

// 66. Plus One

public class Plus_One_66 {

	public static int[] plusOne(int[] digits) {

		int i = digits.length - 1;
		while (i >= 0) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
			i--;
		}
		
		digits = new  int[digits.length+1];
		digits[0]=1;

		return digits;
	}

	public static void main(String[] args) {

		int[] digits = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
				1, 1, 7, 4, 0, 0, 6 }; 

//		int[] digits = { 9 };

		int[] arr = plusOne(digits);

		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
