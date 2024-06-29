package Problems;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static int removeDuplicates(int[] nums) {

		int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        return j;
	}

	public static void main(String[] args) {

//		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] nums = { 1, 1, 2 };

		System.out.println(removeDuplicates(nums));

	}

}
