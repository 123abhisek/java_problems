package Problems;

import java.util.HashSet;
import java.util.Set;

// 		2540. Minimum Common Value

public class Minimum_Common_Value_2540 {

	public static int getCommon(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		int commonVal = Integer.MAX_VALUE;
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				commonVal = Math.min(commonVal, nums2[i]);
			}
		}
		return (commonVal == Integer.MAX_VALUE) ? -1 : commonVal;
	}

	public static void main(String[] args) {

//		int[] nums1 = { 1, 2, 3 };
//		int[] nums2 = { 2, 4 };

		// { 2, 4 , 1, 2, 3 }

		int[] nums1 = { 1, 2, 3, 6 };
		int[] nums2 = { 2, 3, 4, 5 };

		// 1, 2, 3, 6 , 2, 3, 4, 5
		// 1 - 1
		// 2 - 2
		// 3 - 2
		// 6 - 1
		// 4 - 1
		// 5 - 1

		System.out.println(getCommon(nums1, nums2));

	}
}
