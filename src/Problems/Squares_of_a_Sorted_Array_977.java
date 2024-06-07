package Problems;

import java.util.Arrays;

// 		977. Squares of a Sorted Array

public class Squares_of_a_Sorted_Array_977 {
	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {

//		int[] nums = { -4, -1, 0, 3, 10 };
		int[] nums = { -7, -3, 2, 3, 11 };
		nums = sortedSquares(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

}
