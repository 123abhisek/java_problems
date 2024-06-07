package Problems;

import java.util.Arrays;

public class Relative_Ranks_506 {

	public static String[] findRelativeRanks(int[] score) {
//		int[] 
		Arrays.sort(score);
		

		return new String[0];
	}

	public static void main(String[] args) {

//		int[] score = { 5, 4, 3, 2, 1 };// ["Gold Medal","Silver Medal","Bronze Medal","4","5"]

		int[] score = { 10, 3, 8, 9, 4 };// ["Gold Medal","5","Bronze Medal","Silver Medal","4"]

		findRelativeRanks(score);

	}

}
