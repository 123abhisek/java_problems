package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// Leaders in an array

public class Leaders_of_array {

	public static ArrayList<Integer> leaders(int arr[], int n) {
		// Your code here

		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[n - 1]);
		int leader = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			System.out.print(leader+" ");
			if (arr[i] >= leader) {
				list.add(arr[i]);
				leader = arr[i];
			}
		}
		
		System.out.println();

		Collections.reverse(list);
		return list;

	}

	public static void main(String[] args) {

//		int n = 5;
//		int[] A = { 1, 2, 3, 4, 0 };
//		int n = 6;
//		int[] A = { 16, 17, 4, 3, 5, 2 };
//		int n = 6;
//		int[] A = { 6 ,5 ,4 ,3 ,2, 1};
		int n = 7;
		int[] A = {63 ,70 ,80 ,33 ,33 ,47 ,20};

		ArrayList<Integer> list = leaders(A, n);

		for (Integer a : list) {
			System.out.print(a + " ");
		}

	}

}
