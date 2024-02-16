package sample;

public class sample {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4};
		
		int[] darr = arr.clone();
		
		print(darr);
		System.out.print("\n");
		print(arr);
		
		System.out.print(darr);
		
	}

	public static void print(int[] arr) {
		System.out.print(arr[0]);
		for(int i=1;i< arr.length;i++) {
			System.out.print(","+arr[i]);
		}
	}

}
