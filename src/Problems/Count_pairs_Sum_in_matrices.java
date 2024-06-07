package Problems;

import java.util.ArrayList;

// 		Count pairs Sum in matrices

public class Count_pairs_Sum_in_matrices {

	static int countPairs(int mat1[][], int mat2[][], int n, int x) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int[] i : mat1) {
			for (int j : i) {
				arr1.add(j);
			}
		}

		for (int[] i : mat2) {
			for (int j : i) {
				arr2.add(j);
			}
		}
		int count = 0;
		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if ((arr1.get(i) + arr2.get(j)) == x) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

//		int n = 3;
//		int x = 21;
//		int[][] mat1 = { { 1, 5, 6 }, { 8, 10, 11 }, { 15, 16, 18 } };
//		int[][] mat2 = { { 2, 4, 7 }, { 9, 10, 12 }, { 13, 16, 20 } };

		int n = 2;
		int x = 10;
		int[][] mat1 = { { 1, 2 }, { 3, 4 } };
		int[][] mat2 = { { 4, 5 }, { 6, 7 } };

		System.out.println(countPairs(mat1, mat2, n, x));

	}
}
