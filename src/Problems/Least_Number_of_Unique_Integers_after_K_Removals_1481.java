package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//		1481. Least Number of Unique Integers after K Removals

public class Least_Number_of_Unique_Integers_after_K_Removals_1481 {

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {

		Arrays.sort(arr);
		Map<Integer, Integer> freq_count = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (freq_count.containsKey(i)) {
				int val = freq_count.get(i);
				freq_count.put(i, val + 1);
			} else {
				freq_count.put(i, 1);
			}
		}

		int count = 0;
		for (Entry<Integer, Integer> a : freq_count.entrySet()) {
			System.out.println("Key : " + a.getKey() + " Value : " + a.getValue());
			if (a.getValue() != 1) {
				count++;
			}
		}

		System.out.println("Count : " + count);

		for (int j : arr) {
			System.out.print(j + " ");
		}

		System.out.println();
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 1, 3, 3, 2 };
		int k = 3;

		System.out.println(findLeastNumOfUniqueInts(arr, k));
	}

}
