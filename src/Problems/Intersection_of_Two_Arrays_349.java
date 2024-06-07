package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 	349. Intersection of Two Arrays

public class Intersection_of_Two_Arrays_349 {

	// This code take 3ms of RunTime in LeetCode
	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++)
			set1.add(nums1[i]);

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (set1.contains(nums2[i]) && !list.contains(nums2[i]))
				list.add(nums2[i]);
		}

		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);

		return arr;
	}

	public static void main(String[] args) {

//		int[] nums1 = { 1, 2, 2, 1 };
//		int[] nums2 = { 2, 2 };
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		int[] arr = intersection(nums1, nums2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
