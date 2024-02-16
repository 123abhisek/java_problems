package sample;

import java.util.Scanner;

public class exercise {

	// solution :

	// print the even length of word

//	public static void main(String[] args) {
//		
//		String str = "Welcome to java world";
//		
//		String[] arr = str.split(" ");
//		
//		// using for loop
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].length() % 2 == 0) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//		// using for-each loop
//		for(String a : arr) {
//			if(a.length() % 2 == 0) {
//				System.out.println(a);
//			}
//		}

	// calculate the time
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*****   Convert Minutes into Time   ***** \n ");
//		System.out.println("Enter the number : ");
//		int input = sc.nextInt();
//		
//		double hr_res = (double)input / 60;
//		double min_res = ( hr_res - Math.floor(hr_res) ) * 60;
//		int hour = (int) Math.floor(hr_res);
//		int min = (int)Math.ceil(min_res);
//		System.out.println("The Time is : "+hour+" Hrs "+min+" min");
//		
//		
//		// OUTPUT 
//		
//		// *****   Convert Minutes into Time   ***** 
//		 
//		// Enter the number : 160
//		
//		// The Time is : 2 Hrs 40 min

//	}

	// Rotate an Array

	// input : [2,3,4,1,6,10]
	// output : [ 4,1,6,10,2,3]

//	public static void mergeArray(int[] ... arr) {
//		
//		for(int[] i : arr) {
//			for(int j : i ) {
//				System.out.print(j +" ");
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] arr = {4,3,4,3,1,2};
//		
//		System.out.println("Orginal array : ");
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
//		
//		int index = arr[0];
//		int[] arr1 = new int[arr.length-index];
//		for(int i=index,k=0;i< arr.length;i++,k++){
//			arr1[k]= arr[i]; 
//		}
//		
//		int[] arr2 = new int[index];
//		for(int i=0;i<index;i++) {
//			arr2[i] = arr[i];
//		}
//		
//		System.out.println("\nAfter rotation of  array : ");
//		mergeArray(arr1,arr2);
//		
//		
//		// OUTPUT 
//		
//		// Original array : 
//		// 4 3 4 3 1 2 
//		
//		// After rotation of  array : 
//		// 1 2 4 3 4 3 
//		
//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month in muber : ");
		int month = sc.nextInt();

		System.out.println("Enter the year : ");
		int year = sc.nextInt();

		String[] arr = { "Jan", "Feb", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };

		int days = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;

		case 2:
			if (year % 4 == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;

		default:
			System.out.println("Invalid Input !");
		}

		if (month > 0 && month <= 12) {
			System.out.println(arr[month - 1] + " " + year + " " + days + " days");
		}

	}

}
