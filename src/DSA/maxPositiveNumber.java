package DSA;

import java.util.ArrayList;
import java.util.List;

public class maxPositiveNumber {

//	Rearrange the given array in such a way that no of the elements which are positive in the prefix sum array is maximum
//
//	Output the maximum number of positive elements possible in the prefix array after rearranging
//	

	public static boolean isPositive(int n) {
		return (n > 0) ? true : false;
	}

	public static void main(String[] args) {

		int len = 4; // Array length
		int[] arr = { -2, -5, 4, 7, -10, 1, -3, 8, 0, -6 };
//		int[] arr = { -2, -5, 4, 7 };

		int countPosi = 0;
		int countNege = 0;
		for (int i : arr) {
			if (isPositive(i)) {
				countPosi = countPosi + 1;
			} else {
				countNege = countNege + 1;
			}
		}

		int[] arrPosi = new int[countPosi];
		int[] arrNege = new int[countNege];
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPositive(arr[i])) {
				arrPosi[a++] = arr[i];
			} else {
				arrNege[b++] = arr[i];
			}
		}

		int[] arrNew = new int[arr.length];
		int i = 0;
		int j = 0;
		while (i < arrPosi.length) {
			arrNew[j] = arrPosi[i];
			i++;
			j++;
		}
		i = 0;
		while (i < arrNege.length) {
			arrNew[j] = arrNege[i];
			i++;
			j++;
		}

		// { -2, -5, 4, 7}

		for (int d : arrNew) {
			System.out.print(d + " ");
		}
		System.out.println();
		int countPosi1 =0;
		for (int c = 0; c <= arrNew.length - 1; c++) {
			int sum = 0;
			for (int d = 0; d <= c; d++) {
				sum += arrNew[d];
			}
			System.out.println(c +" : "+sum);
			if(isPositive(sum)) {
				countPosi1++;
			}
		}
		
		System.out.println("count : "+countPosi1);

//		int maxPosi = 0;
//
//		for (int d : arrNew) {
//			if (isPositive(d)) {
//				maxPosi = maxPosi + 1;
//			}
//		}

//		System.out.println("maximum number of positive elements possible in the prefix array : " + maxPosi);

	}

}
