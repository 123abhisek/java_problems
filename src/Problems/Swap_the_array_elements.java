package Problems;

// 		Swap the array elements

public class Swap_the_array_elements {

	public static void swapElements(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int index = i + 2;
//			System.out.println("index " + index + " i = " + i);
			if (index > n - 1) {
				break;
			} else {
//				System.out.println(arr[i] + " : " + arr[index]);
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}

		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

	public static void main(String[] args) {

//		int n = 5;
//		int arr[] = { 1, 2, 3, 4, 5 };

		int n = 3;
		int arr[] = { 1, 2, 3 };

		swapElements(arr, n); // 3 4 5 2 1

	}
}
