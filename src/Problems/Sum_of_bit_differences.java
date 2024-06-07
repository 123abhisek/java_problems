package Problems;

public class Sum_of_bit_differences {

	static int display(String a, String b) {
		int count = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					count++;
				}
			}
		} else if (a.length() > b.length()) {
			int n = a.length() - b.length();
			for (int i = 1; i <= n; i++) {
				b = "0" + b;
			}
			System.out.println("b:" + b);
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					count++;
				}
			}
		} else {
			int n = b.length() - a.length();
			for (int i = 1; i <= n; i++) {
				a = "0" + a;
			}

			System.out.println("a: " + a);
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					count++;
				}
			}
		}

		return count;
	}

	static long sumBitDifferences(int[] arr, int n) {
		String[] arr1 = new String[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.toBinaryString(arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				sum += display(arr1[i], arr1[j]);
			}
		}

		System.out.println(display("001", "0111"));

		return sum;
	}

	public static void main(String[] args) {

		int n = 2;
		int arr[] = { 1, 2 };
//		int n = 3;
//		int arr[] = { 1, 3, 5 };

		System.out.println(sumBitDifferences(arr, n));

	}

}
