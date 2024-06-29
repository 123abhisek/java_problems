package Problems;

public class Median_of_Two_Sorted_Arrays_4 {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] arr = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0;
		double mid;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				arr[k] = nums1[i];
				i++;
				k++;
			} else {
				arr[k] = nums2[j];
				j++;
				k++;
			}
		}

		while (i < nums1.length) {
			arr[k] = nums1[i];
			i++;
			k++;
		}

		while (j < nums2.length) {
			arr[k] = nums2[j];
			j++;
			k++;
		}

		for (int l : arr) {
			System.out.print(l + " ");
		}

		if (arr.length % 2 == 0) {
			mid = 0 + ((double) arr.length - 0) / 2;
			System.out.println(mid);
			mid = (mid + (mid + 1)) / 2;
		} else {
			mid = Math.ceil( 0 + ((double) arr.length - 0) / 2;
			System.out.println("\n" + (0 + (arr.length - 0) / 2));
		}

		System.out.println("mid : " + mid);

		return 0;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3 }, nums2 = { 2 };

		System.out.println("\n" + findMedianSortedArrays(nums1, nums2));

	}

}
