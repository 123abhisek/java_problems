package DSA;

public class Practice_1 {

	public static void main(String[] args) {

		// Selection Sort

//		int[] arr = {12, 23, 45, 56, 78, 89};
//		
//		System.out.println("Before Sorting :");
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			int maxValue=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[maxValue] > arr[j]) {
//					maxValue=j;
//				}
//			}
//			
//			int temp= arr[maxValue];
//			arr[maxValue] = arr[i];
//			arr[i]= temp;
//		}
//		
//		System.out.println("\nAfter Sorting :");
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}

		// Insertion Sort

//		int[] arr = {56, 23, 78, 12, 45, 89};
//		
//		System.out.println("Before Sorting :");
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
//		
//		
//		for(int i=1;i<arr.length;i++) {
//			int key = arr[i];
//			int j=i-1;
//			
//			while(j>= 0 && arr[j] > key ) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//		}
//		
//		
//		System.out.println("\nAfter Sorting :");
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}

		// Insertion Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//		for(int i=1;i<arr.length;i++) {
//			int key = arr[i];
//			int j = i-1;
//			
//			while(j>= 0 && arr[j] > key) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			
//			arr[j+1] = key;
//		}
//
//		System.out.println("\nAfter Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// Bubble Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i + 1; j < arr.length-1; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//				
//			}
//		}
//
//		System.out.println("\nAfter Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// Selection Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			int maxIndex = i;
//			for (int j = i + 1; j < arr.length - 1; j++) {
//				if (arr[maxIndex] > arr[j]) {
//					maxIndex = j;
//				}
//
//			}
//			int temp = arr[maxIndex];
//			arr[maxIndex] = arr[i];
//			arr[i] = temp;
//		}
//
//		System.out.println("\nAfter Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// Insertion Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//		
//		for(int i=1;i<arr.length;i++) {
//			int key = arr[i];
//			int j = i-1;
//			
//			while(j >= 0 && arr[j] > key ) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			
//			arr[j+1] = key;
//			
//			
//		}
//		
//		
//
//		System.out.println("\nAfter Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// Bubble Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for(int j=i+1;j<arr.length-i-1;j++) {
//				
//				if(arr[i] > arr[j]) {
//				
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		
//
//		System.out.println("\nAfter Sorting :");
//		for (int o : arr) {
//			System.out.print(o + " ");
//		}

		// Selection Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			int minValue = i;
//			for (int j = i + 1; j < arr.length-i-1; j++) {
//				
//				if (arr[minValue] > arr[j]) {
//					minValue = j;
//				}
//			}
//			int temp = arr[minValue];
//			arr[minValue] = arr[i];
//			arr[i] = temp;
//		}
//
//		System.out.println("\nAfter Sorting :");
//		for (int o : arr) {
//			System.out.print(o + " ");
//		}

		// Insertion Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		
//		int steps=0;
//		for (int i = 1; i < arr.length; i++) {
//			int key = arr[i];
//			int j= i-1;
//			
//			while(j>=0 && arr[j] > key) {
//				steps++;
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//		}
//
//		System.out.println("\nAfter Sorting :");
//		for (int o : arr) {
//			System.out.print(o + " ");
//		}

		// Quick Sort

//		int[] arr = { 56, 23, 78, 12, 45, 89 };
//
//		System.out.println("Before Sorting :");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//
//		quickSort(arr, 0, arr.length - 1);
//
//		System.out.println("\nAfter Sorting :");
//		for (int o : arr) {
//			System.out.print(o + " ");
//		}
//
//	}
//
//	private static void quickSort(int[] arr, int low, int high) {
//
//		if (low < high) {
//			int pivot = partition(arr, low, high);
//			quickSort(arr, low, pivot - 1);
//			quickSort(arr, pivot + 1, high);
//		}
//
//	}
//
//	private static int partition(int[] arr, int low, int high) {
//		int pivot = arr[high];
//		int i = low - 1;
//		int temp = 0;
//		for (int j = low; j < high; j++) {
//			if (arr[j] < pivot) {
//				i++;
//				temp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		temp = arr[high];
//		arr[high] = arr[i + 1];
//		arr[i + 1] = temp;
//		return i + 1;
//	}

		// Merge Sort

		int[] arr = { 56, 23, 78, 12, 45, 89 };

		System.out.println("Before Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nAfter Sorting :");
		for (int o : arr) {
			System.out.print(o + " ");
		}

	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);

		}

	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] lArr = new int[n1];
		int[] rArr = new int[n2];

		for (int i = 0; i < n1; i++) {
			lArr[i] = arr[low + i];
		}

		for (int i = 0; i < n2; i++) {
			rArr[i] = arr[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = low;

		while (i < n1 && j < n2) {
			if (lArr[i] < rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = arr[j];
			j++;
			k++;
		}

	}

//	private static void mergeSort(int[] arr, int low, int high) {
//
//		if (low < high) {
//
//			int mid = (low + high) / 2;
//			mergeSort(arr, low, mid);
//			mergeSort(arr, mid + 1, high);
//
//			merge(arr, low, mid, high);
//		}
//
//	}
//
//	private static void merge(int[] arr, int low, int mid, int high) {
//
//		int n1 = mid - low + 1;
//		int n2 = high - mid;
//
//		int[] lArr = new int[n1];
//		int[] rArr = new int[n2];
//
//		for (int i = 0; i < n1; i++) {
//			lArr[i] = arr[low + i];
//		}
//
//		for (int i = 0; i < n2; i++) {
//			rArr[i] = arr[mid + 1 + i];
//		}
//
//		int i = 0;
//		int j = 0;
//		int k = low;
//
//		while (i < n1 && j < n2) {
//			if (lArr[i] < rArr[j]) {
//				arr[k] = lArr[i];
//				i++;
//			} else {
//				arr[k] = rArr[j];
//				j++;
//			}
//			k++;
//		}
//
//		while (i < n1) {
//			arr[k] = lArr[i];
//			i++;
//			k++;
//		}
//
//		while (j < n2) {
//			arr[k] = rArr[j];
//			j++;
//			k++;
//		}
//
//	}

}
