package Problems;

public class Sort_Colors_75 {

	public static void sortColors(int[] nums) {

		int i = 0, j = nums.length - 1;
		while (i < j) {
			if (nums[i] > nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
			else {
				
			}
		}

	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColors(nums);
	}

}
