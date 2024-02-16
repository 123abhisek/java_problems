package DSA;

public class SelectinSort {

	public static void main(String[] args) {
//		int nums[] = { 6, 5, 2, 8, 9, 4 };
		int nums[] = { 5,8,1,9,2 };

		System.out.println("before sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		int temp=0;
		for (int i = 0; i < nums.length-1; i++) {
			int minIndex=i;
			for (int j = i; j < nums.length; j++) {
				if(nums[minIndex] > nums[j]) {
					minIndex=j;
				}
			}
			temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}

		System.out.println("\nAfter sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
