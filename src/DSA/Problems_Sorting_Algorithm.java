package DSA;

public class Problems_Sorting_Algorithm {

	// Linear Search

	/*
	 * #### Problem 1:
	 * 
	 * Input: ```
	 * 
	 * Array: [12, 34, 56, 78, 90, 23, 45] Search Element: 78 ```
	 * 
	 * Output: ``` Element 78 found at index 3.
	 * 
	 */

//	private static int linearSreach(int[] arr, int key) {
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == key) {
//				return i;
//			}
//		}
//
//		return -1;
//
//	}
//
//	public static void main(String[] args) {
//		int[] arr = { 12, 34, 56, 78, 90, 23, 45 };
//		int key = 10;
//
//		int index = linearSreach(arr, key);
//
//		if (index != -1) {
//			System.out.println("Element " + arr[index] + " found at index " + index);
//		} else {
//			System.out.println("Element " + arr[index] +" not found in the array !");
//		}
//	}

	// Binary search

	/*
	 * #### Problem 1:
	 * 
	 * Input: ``` Sorted Array: [2, 5, 8, 12, 16, 20, 23] Search Element: 16 ```
	 * 
	 * Output: ``` Element 16 found at index 4.
	 * 
	 */

//	public static void main(String[] args) {
//		int[] arr = { 12, 34, 56, 78, 90, 23, 45 };
//		int key = 12;
//
//		int index1 = binarySreach(arr, key);
//
//		if (index1 != -1) {
//			System.out.println("Element " + key + " found at index " + index1);
//		} else {
//			System.out.println("Element " + key + " not found in the array !");
//		}
//	}
//
//	private static int binarySreach(int[] arr, int key) {
//
//		int low = 0;
//		int high = arr.length - 1;
//
//		while (low <= high) {
//			int mid = (low + high) / 2;
//			if (arr[mid] == key) {
//				return mid;
//			} else if (arr[mid] < key) {
//				low = mid + 1;
//			} else
//				high = mid - 1;
//		}
//
//		return -1;
//	}

	// Bubble Sort

//	public static void main(String[] args) {
//
//		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
//
//		System.out.println("Before Sorting : ");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		bubbleSort(arr);
//
//		System.out.println("\nAfter Sorting : ");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//	}
//
//	private static void bubbleSort(int[] arr) {
//
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; j < arr.length-i-1; j++) {
//
//				if (arr[j] < arr[i]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//
//	}

	// Selection Sort

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Before Sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		selectionSort(arr);

		System.out.println("\nAfter Sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void selectionSort(int[] arr) {

		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i; j < arr.length; i++) {

				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			temp=arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]= temp;
		}

	}

}
