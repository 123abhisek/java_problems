package Problems;

import java.util.Arrays;

public class Height_Checker_1051 {
	public static int heightChecker(int[] heights) {
		int[] arr = new int[heights.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = heights[i];
		}
		Arrays.sort(heights);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != heights[i]) {
				count++;

			}
		}

		return count;
	}

	public static void main(String[] args) {
//		int[] heights = { 1, 1, 4, 2, 1, 3 };
		int[] heights = { 5, 1, 2, 3, 4 };

		System.out.println(heightChecker(heights));
	}

}
