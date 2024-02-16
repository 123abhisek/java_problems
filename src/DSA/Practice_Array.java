package DSA;

public class Practice_Array {

	public static void main(String[] args) {

		int nums[] = { 5, 7, 9, 11, 13 };
		int target = 5 ;

		int result = binarySearch(nums, target);
		int result2 = binarySearchRecursive(nums, target,0,nums.length-1);
		int result1 = linearSearch(nums, target);
		if (result != -1)
			System.out.println("Element found ar index : " + result);
		else
			System.out.println("Element not found");
	}

	private static int binarySearchRecursive(int[] nums, int target, int left, int right) {

		if (left <= right) {
			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;

			} else if (nums[mid] < target) {
				binarySearchRecursive(nums, target, mid+1, right);
			} else
				binarySearchRecursive(nums, target, left, mid-1);
		}

		return -1;
	}

	private static int linearSearch(int[] nums, int target) {
		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			steps++;
			if (nums[i] == target) {
				System.out.println("Steps taken by Linear search : " + steps);
				return i;
			}
		}

		return -1;
	}

	private static int binarySearch(int[] nums, int target) {
		int steps = 0;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				System.out.println("Steps taken by Binary search : " + steps);
				return mid;

			} else if (nums[mid] < target) {
				left = mid + 1;
			} else
				right = mid - 1;
		}

		return -1;
	}

}
