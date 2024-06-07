package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 		3005. Count Elements With Maximum Frequency

public class Count_Elements_With_Maximum_Frequency_3005 {

	public static int maxFrequencyElements(int[] nums) {

		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (maps.containsKey(nums[i])) {
				maps.put(nums[i], maps.get(nums[i]) + 1);
			} else {
				maps.put(nums[i], 1);
			}
		}

		Object[] arr = maps.values().toArray();
		Integer max = 0;
		for (Object a : arr) {
			if ((Integer) a > max) {
				max = (Integer) a;
			}
		}

		System.out.println("max : " + max);
		Integer sum = 0;
		for (Object a : arr) {
			if ((Integer) a == max) {
				sum += (Integer) a;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
//		int[] nums = { 1, 2, 2, 3, 1, 4 };
		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println(maxFrequencyElements(nums));
	}

}
