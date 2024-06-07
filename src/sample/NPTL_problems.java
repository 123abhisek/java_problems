package sample;

import java.util.Scanner;

public class NPTL_problems {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

//		String a = String.valueOf(num);
//		int i = 0;
//		int count = 0;
//		while (i < a.length()) {
//			if (a.charAt(i) == '0') {
//				continue;
//			} else {
//				count++;
//			}
//			i++;
//		}
//		System.out.print(count);

		// Complete the code segment to display the factors of a number n.

//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.print(i+" ");
//			}
//		}

//		int count = 0;
//		while(num >0){
//		  num = num/10;
//		count++;
//		}
//		 System.out.print(+(num)+(count));

		// Complete the code segment to find the standard deviation of the 1-D array.
//		Use the following formula

//		double sum = 0.0;
//        double standardDeviation = 0.0;
//        double mean = 0.0;
//        double res = 0.0;
//        double sq = 0.0;
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        double arr[] = new double[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextDouble();
//        }
//		
//		for (int i = 0; i < num; i++) {
//            mean += arr[i];
//          }
//
//          mean /= num; // Calculate mean more efficiently
//
//          double[] arr1 = new double[num];
//          for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = Math.pow((arr[i] - mean), 2);
//          }
//
//          for (int i = 0; i < arr1.length; i++) {
//            sum += arr1[i];
//          }
//
//          sq = sum / num;
//
//   		 res = Math.sqrt(sq);
//   		 
//   		 System.out.println(res);

		/*
		 * 
		 * 
		 * 
		 * Write a program which will print a pattern of "*" 's of height "n". For
		 * example: Input: n = 3 Output:
		 ***
		 **
		 *
		 **
		 ***
		 * 
		 */

		Scanner inr = new Scanner(System.in);
		int n = inr.nextInt();
		
		for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Printing the lower half of the pattern
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
