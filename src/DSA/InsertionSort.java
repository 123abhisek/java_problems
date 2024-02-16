package DSA;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = { 5,8,1,9,2 };

		System.out.println("before sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		for(int i=1;i<nums.length;i++) {
			int key = nums[i];
			int j=i-1;
			
			while(j>=0 && nums[j] > key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}

		System.out.println("\nAfter sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

}
