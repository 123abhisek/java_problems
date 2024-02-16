package sample;

public class Problem_Recursion {

//	Factorial Calculation :
//		 Write a recursive function to calculate the factorial of a given non-negative 
//		integer.

//	public static int factorial(int n) {
//
//		if (n == 1) {
//			return 1;
//		}
//		return n * factorial(n - 1);
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(factorial(5));
//
//	}

//	Fibonacci Sequence :
//		 Implement a recursive function to generate the nth Fibonacci number.

//	private static int fibonacci(int n) {
//		
//		if(n==1 || n==0) {
//			return n;
//		}
//		
//		int fib1=fibonacci(n-1);
//		int fib2=fibonacci(n-2);
//		int fib = fib1+fib2;
//		return fib;
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println(fibonacci(5));
//
//	}

//	 Sum of Digits :
//		 Create a recursive function to find the sum of digits of a positive integer.

//	private static int sumOfDigit(int num) {
//
//		if(num==0) {
//			return 0;
//		}
//		return (num% 10 +sumOfDigit(num/10));
//
//		
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(sumOfDigit(123));
//
//	}

//	 Power Calculation :
//		 Write a recursive function to calculate the power of a number given its base and
//		exponent.
//	private static int power(int num, int expo) {
//		
//		if(expo==0) {
//			return 1;
//		}
//		
//		return num * power(num,expo-1);
//	}
//	
//	public static void main(String[] args) {
//
//		System.out.println(power(2,8));
//
//	}

//	Palindrome Check :
//		 Implement a recursive function to check if a given string is a palindrome.
//		 - Input: "racecar"
//		 - Output: True

	// using array so converting the string into array

//	private static boolean palindrome(char[] arr,int low,int high) {
//
//		if(low > high) {
//			return true;
//		}
//		
//		if(arr[low] != arr[high]) {
//			return false;
//		}
//		
//		return palindrome(arr, low+1, high-1);
//	}
//
//	public static void main(String[] args) {
//		String str = "";
//		char[] arr = str.toCharArray();
//		System.out.println(palindrome(arr,0,arr.length-1));
//
//	}

	// only using String

//	private static boolean palindrome(String str) {
//		if (str.length() == 0 || str.length() == 1) {
//			return true;
//		}
//		
//		if(str.charAt(0) == str.charAt(str.length()-1)) {
//			return palindrome(str.substring(1, str.length()-1));
//		}
//		else {
//			return false;
//		}
//			
//		
//	}
//
//	public static void main(String[] args) {
//		String str = "raceetcar";
//		System.out.println(palindrome(str));
//
//	}

//	Binary Search :
//		 Write a recursive function to perform a binary search on a sorted array.
//		 - Input: [1, 3, 5, 7, 9], target = 5
//		 - Output: True

//	private static boolean binarySearch(int[] arr, int l, int r, int x) {
//
//		if (r >= l && l <= arr.length - 1) {
//
//			int mid = l + (r - l) / 2;
//
//			if (arr[mid] == x)
//				return true;
//
//			if (arr[mid] > x)
//				return binarySearch(arr, l, mid - 1, x);
//
//			return binarySearch(arr, mid + 1, r, x);
//		}
//
//		return false;
//	}
//
//	public static void main(String[] args) {
//
//		int[] arr = { 1, 3, 5, 7, 9 };
//		int target = 1;
//
//		System.out.println(binarySearch(arr, 0, arr.length - 1, target));
//	}

//	 Greatest Common Divisor (GCD) :
//		 Create a recursive function to find the greatest common divisor of two positive 
//		integers.

	public static void main(String[] args) {

		System.out.println(gcd(48, 18));

	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

}
