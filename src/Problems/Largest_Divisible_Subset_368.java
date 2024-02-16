package Problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Largest_Divisible_Subset_368 {

	public static List<Integer> largestDivisibleSubset(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		Arrays.sort(nums);

		int maxSize = 1, maxIndex = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] % nums[j] == 0) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
					if (dp[i] > maxSize) {
						maxSize = dp[i];
						maxIndex = i;
					}
				}
			}
		}

		List<Integer> result = new ArrayList<>();
		int num = nums[maxIndex];
		for (int i = maxIndex; i >= 0; i--) {
			if (num % nums[i] == 0 && dp[i] == maxSize) {
				result.add(nums[i]);
				num = nums[i];
				maxSize--;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 4, 6, 8, 10 };

		System.out.println(largestDivisibleSubset(nums));

//		List<Integer> mylist = new ArrayList<Integer>();
//		Map<Integer, Integer> myMaps = new HashMap<Integer, Integer>();
//		
//		for (int i = 0; i < nums.length; i++) {
//			Integer count = 1;
//			for (int j = 0; j < nums.length; j++) {
//				if (nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0) {
//					myMaps.put(nums[i], count++);
//				}
//			}
//			
//		}
//
//		for(Entry<Integer,Integer> d : myMaps.entrySet()) {
//			System.out.println("key : "+d.getKey()+" value : "+d.getValue());
//		}

	}

}
