package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Minimum_Cost_to_Hire_K_Workers_857 {

	public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {

		double[] arr = new double[wage.length];
		Map<Integer, Double> map = new HashMap<>();
		for (int i = 0; i < wage.length; i++) {
			arr[i] = (double) wage[i] / (double) quality[i];
			map.put(i, arr[i]);
		}

		Arrays.sort(arr);

		int[] index = new int[k];
		int l = 0;
		for (Map.Entry<Integer, Double> entry : map.entrySet()) {
			if (entry.getValue() == arr[l]) {
				index[l] = entry.getKey();
				l++;
			}
		}
		Arrays.sort(index);
		double value = wage[index[0]];
		for (int i = 1; i < k; i++) {
			value += (map.get(index[0]) * quality[index[i]]);
		}

		return value;
	}

	public static void main(String[] args) {

//		int[] quality = { 3, 1, 10, 10, 1 };
//		int[] wage = { 4, 8, 2, 2, 7 };
//		int k = 3;
		int[] quality = { 10, 20, 5 };
		int[] wage = { 70, 50, 30 };
		int k = 2;

		System.out.println(mincostToHireWorkers(quality, wage, k));

	}
}
