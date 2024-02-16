package DSA;

import java.util.Random;

//Insert any integer in any place in the array. Find the minimum possible cost after 1 such insertion.

public class Problem_on_minimum_cost {

	public static void main(String[] args) {

		int len = 5; // array length

		int[] arr = { 1, 3, 5, 2, 10 };

		int actual_cost = 0;
		for (int i = 1; i < arr.length; i++) {
			actual_cost += (int) Math.pow((arr[i] - arr[i - 1]), 2);
		}

		System.out.println(actual_cost);

		Random rand = new Random();
		int[] arr1 = new int[arr.length + 1];

		int randIndex = rand.nextInt(arr1.length); // 3
		int randValue = rand.nextInt(1, 10); // 6

//		int randIndex = 3;
//		int randValue = 4;

		// arr = 1, 3, 5, 2, 10 -- i = 4
		// arr1 = 1 3 5 6 2 10 -- j = 5

		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (j == randIndex) {
				arr1[j] = randValue;
			} else {
				arr1[j] = arr[i];
				i++;
			}
			j++;
		}

		int updated_cost = 0;
		for (int k = 1; k < arr1.length; k++) {
			updated_cost = updated_cost + (int) Math.pow(((Integer) arr1[k] - (Integer) arr1[k - 1]), 2);
		}

		System.out.println(updated_cost);

		System.out.println("The minimum cost value is " + Math.min(actual_cost, updated_cost));
		System.out.println("The minimum cost value is " +( (actual_cost>updated_cost)? updated_cost:actual_cost));

	}

}
