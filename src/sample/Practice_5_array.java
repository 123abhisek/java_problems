package sample;

public class Practice_5_array {

	// 1. Write a Java function that takes a 1D array of integers as input and
	// returns the sum of all elements in the array.

//	public static void sum(int arr[]) {
//		int sum =0;
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		
//		System.out.println("Sum is : "+sum);
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] arr = {2,5,3,7,1};
//		sum(arr);
//	}

	// 2. Create a program to find the maximum element in a given 1D array of
	// doubles.

//	public static void main(String[] args) {
//		
//		double [] arr = {1.2,42.3,5.2,56.3,12.1,1.1};
//		double large = arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(large < arr[i]) {
//				large = arr[i];
//			}
//		}
//		System.out.println("Large is : "+large);
//	}

	// 3. Implement a function to reverse the elements of a 1D array of strings.

//	public static void reverse(String[] arr) {
//		for(int i = arr.length-1 ;i>=0;i--) {
//			System.out.print(" "+arr[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		String[] arr = {"Abhishek","Yash","Devraj","Nishant","Charan"};
//		
//		System.out.println("Orginal Values : ");
//		for(int i = 0 ;i< arr.length;i++) {
//			System.out.print(" "+arr[i]);
//		}
//		
//		System.out.println("\nReverse Values : ");
//		reverse(arr);
//		
//	}

	// 4. Write a Java function that adds two given 2D arrays of integers and
	// returns the result.

//	public static void add(int[][] arr) {
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum += arr[i][j];
//			}
//		}
//		
//		System.out.println("Sume is : "+sum);
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] arr1 = {
//				{2,4,6,1,2},
//				{3,5,1,2,5}
//		};
//		
//		add(arr1);
//	}

	// 5. Create a program that takes a 2D array of characters and returns its
	// transpose.

//	public static int[][] transpose(int[][] arr) {
//		int rows = arr.length;
//		int cols = arr[0].length;
//		int[][] result = new int[cols][rows];
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				result[j][i] = arr[i][j];
//			}
//		}
//		
//		return result;
//	}
//	
//	public static void display(int[][] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(" "+arr[i][j]);
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] arr1 = {
//				{2,4,6,1,2},
//				{3,5,1,2,5}
//		};
//		
//		System.out.println("Orginal Array : ");
//		display(arr1);
//		
//		int[][] result = transpose(arr1);
//		
//		System.out.println("Transpose Array : ");
//		display(result);		
//	}
//}

	// 6. Implement a function to find the sum of the diagonal elements in a square
	// 2D array.

//	public static int finDiagonalSum(int[][] arr) {
//		int sum=0;
//		
//		if(arr.length != arr[0].length) {
//			System.out.println("The matrix is not square !");
//			return -1;
//		}
//		
//		int size = arr.length;
//		
//		for(int i=0;i<size;i++) {
//			sum += arr[i][i];
//		}
//		
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] matrix = {
//	            {1, 2, 3},
//	            {4, 5, 6},
//	            {7, 8, 9}
//	        };
//		
//		int result = finDiagonalSum(matrix);
//		System.out.println("Sum of diagonal is : "+result);
//	}

	// 7. Write a Java program to find the average of each row in a jagged array of
	// integers.

//	public static void averageArray(int[][] arr) {
//		
//		for(int i=0;i<arr.length;i++) {
//			int sum =0;
//			for(int j=0;j<arr[i].length;j++) {
//				sum += arr[i][j];
//			}
//			
//			double avg = (double) sum/arr[i].length;
//			System.out.println("Avarage of row "+(i+1)+" is "+avg);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] matrix = {
//	            {1, 2, 3},
//	            {4, 5},
//	            {7, 8, 9}
//	        };
//		
//		averageArray(matrix);
//		
//	}

	// 8. Create a function that finds the largest element in each sub-array of a
	// jagged array of
	// doubles.

//	public static void largestNumber(int[][] arr) {
//		for(int i=0;i<arr.length;i++) {
//			int large =arr[i][0];
//			for(int j=1;j<arr[i].length;j++) {
//				if(large < arr[i][j]) {
//					large = arr[i][j];
//				}
//			}
//			System.out.println("Largest number of row "+(i+1)+" is "+large);
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] matrix = {
//	            {1, 5, 3},
//	            {8, 5},
//	            {7, 10, 9}
//	        };
//		
//		largestNumber(matrix);
//		
//	}

	// 9. Use an enhanced for loop to print all elements of a 1D array of strings.

//	public static void main(String[] args) {
//		
//		int[] arr = {2,5,3,7,1};
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
//	}

	// 10. Write a program that uses an enhanced for loop to calculate the total of
	// a 1D array of
	// floats.

//	public static void main(String[] args) {
//
//		float[] arr = { 2, 5, 3, 7, 1 };
//		int sum=0;
//		for (float i : arr) {
//			sum += i;
//		}
//		
//		System.out.println("Total is : "+sum);
//	}
	
	
	
	
	// 11.Implement a function that takes a variable number of integers as arguments (using
	//		varargs) and returns their sum
	
	
//	public static int sum(int ... num) {
//		int sum=0;
//		
//		for(int i : num) {
//			sum += i;
//		}
//		
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println("Sum : "+sum(1,4,6,2,8,3));
//	}
	
	
	
	// 12.  Write a Java program that uses varargs to concatenate a variable number of strings
	//		and returns the resulting string
	
//	public static String Concatenate(String ...strings) {
//		String value="";
//		
//		for(String val : strings) {
//			value = value +" "+val;
//		}
//		
//		return value;
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		System.out.println(Concatenate("Welcome","to","Java","World"));
//	
//	}
	
}
