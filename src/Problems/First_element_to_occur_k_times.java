package Problems;

import java.util.HashMap;
import java.util.Map;

//	First element to occur k times

public class First_element_to_occur_k_times {

	public static int firstElementKTime(int n, int k, int[] a) {

		Map<Integer, Integer> maps = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (maps.containsKey(a[i])) {
				int val = maps.get(a[i]) + 1;
				maps.put(a[i], val);
				if (val == k) {
					return a[i];
				}
			} else {
				maps.put(a[i], 1);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

//		int n = 7, k = 2;
//		int a[] = { 1, 7, 4, 3, 4, 8, 7 };

		int n = 10, k = 3;
		int a[] = { 3, 1, 3, 4, 5, 1, 3, 3, 5, 4 };

		System.out.println(firstElementKTime(n, k, a));

	}

}
