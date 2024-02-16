package sample;

public class Practice_Recursion {

	public static void printDesc(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}

		System.out.println(n + " ");
		printDesc(n - 1);
	}

	public static void printInc(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}

		printInc(n - 1);
		System.out.println(n + " ");

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int func1 = factorial(n - 1);
		int fn = n * factorial(n - 1);
		return fn;
	}

	private static int sumOfNaturalNumber(int n) {

		if (n == 1) {
			return 1;
		}

		int sum1 = sumOfNaturalNumber(n - 1);
		int sum = n * sum1;
		return sum;
	}

	private static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fib1 = fibonacci(n - 1);
		int fib2 = fibonacci(n - 2);
		int fn = fib1 + fib2;
		return fn;
	}

	private static boolean isSorted(int[] arr, int i) {

		if (i == arr.length - 1) {
			return true;
		}

		if (arr[i] > arr[i + 1]) {
			return false;
		}

		return isSorted(arr, i + 1);
	}

	private static int firstOccurance(int[] arr,int i, int key) {
		if(i== arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		
		return firstOccurance(arr, i+1, key);
	}

	public static void main(String[] args) {

		// Print numbers from n into 1 (Decreasing order)
//		printDesc(10);

		// Print numbers from n into 1 (Increasing order)
//		printInc(10);

		// factorial
//		System.out.println(factorial(4));

		// sum of natural numbers
//		System.out.println(sumOfNaturalNumber(5));

		// fibonacci numbers

//		System.out.println(fibonacci(5 ));

		// check if a given array is sorted or not
//		int[] arr = {2,4,6,8,10};
//		System.out.println(isSorted(arr,0));

		// WAF to find the first occurence of element in an array

//		int[] arr = { 2, 4, 6, 8, 10 };
//		int key = 10;
//		System.out.println(firstOccurance(arr, 0,key));

	}

}
