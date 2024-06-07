package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//287. Find the Duplicate Number
public class Find_the_Duplicate_Number_287 {
	public static int findDuplicate(int[] nums) {
//		Map<Integer, Integer> maps = new HashMap<>();
//		for (int i : nums) {
//			if (maps.containsKey(i)) {
//				maps.put(i, maps.get(i) + 1);
//			} else {
//				maps.put(i, 1);
//			}
//		}
//
//		for (Entry<Integer, Integer> k : maps.entrySet()) {
//			System.out.println("key :" + k.getKey() + " value :" + k.getValue());
//			if (k.getValue() > 1) {
//				return k.getKey();
//			}
//		}
//
//		return 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count > 1) {
				return nums[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 1, 3, 4, 2 };
		System.out.println(findDuplicate(nums));
	}

}
