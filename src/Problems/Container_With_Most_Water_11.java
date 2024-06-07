package Problems;

// 	11. Container With Most Water

public class Container_With_Most_Water_11 {

	public static int maxArea(int[] height) {

		int i = 0, j = height.length - 1;

		while(i < j) {
			if (height[i] < height[j]) {
				
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(maxArea(height));
	}

}
