package Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Find duplicates in an array

public class Find_duplicates {

	public static int max(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}

		return temp;
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		// code here

		int[] countArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i]] = countArr[arr[i]] + 1;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int j = 0; j < countArr.length; j++) {
			if ( countArr[j] > 1 ) {
				list.add(j);
			}
		}

		if (list.isEmpty()) {
			list.add(-1);
		}

		return list;

	}

	public static void main(String[] args) {
		int N = 4;
		int a[] = { 0, 3, 1, 2 };
//		int N = 10;
//		int a[] = { 7, 6, 8, 4, 9, 8, 4, 7, 4, 4 };

		ArrayList<Integer> arr = duplicates(a, N);

		for (Integer a1 : arr) {
			System.out.print(a1 + " ");
		}

	}

}
