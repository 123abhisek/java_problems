package Problems;

import java.util.Arrays;

//		268. Missing Number
public class Missing_Number_268 {

	public static int missingNumber(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				return i;
			}
		}
		return nums.length;
	}

	public static void main(String[] args) {

		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(nums));
	}

}
