package Problems;

public class Rearrange_Array_Elements_by_Sign_2149 {

	public static int[] rearrangeArray(int[] nums) {

		int countNeg = 0, countPos = 0;

		for (int i : nums) {
			if (i < 0)
				countNeg++;
			else
				countPos++;
		}

		int[] PosArr = new int[countPos];
		int[] negArr = new int[countNeg];
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				negArr[a] = nums[i];
				a++;
			} else {
				PosArr[b] = nums[i];
				b++;
			}
		}

		int[] finalArr = new int[nums.length];
		int i = 0, j = 0;

		while (j < nums.length) {
			if (i < PosArr.length) {
				finalArr[j] = PosArr[i];
				j++;
			}
			if (i < negArr.length) {
				finalArr[j] = negArr[i];
				j++;
			}
			i++;
		}
		return finalArr;
	}

	public static void main(String[] args) {

//		int[] nums = { 3, 1, -2, -5, 2, -4 }; // [3, -2, 1, -5, 2, -4]
//		int[] nums = { -1, 1 }; // [1, -1]
//		int[] nums = { 3, 1, -2, -5, -3, -4 }; // [3, -2, 1, -5, -3, -4]
//		int[] nums = { 1, 2, 3, -1, -2, -3 }; // [1, -1, 2, -2, 3, -3]
		int[] nums = { -10, -12, 9, 14, -6, -7 };// [9, -10, 14, -12, -6, -7]

		nums = rearrangeArray(nums);

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
