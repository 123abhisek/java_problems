package Lab_prog;

import java.util.Scanner;

public class binaryDiv {

	public static void main(String[] args) {

		String input_bit = "100100"; // input dividend
		String key = "1101";	// input key

		String input_copy = input_bit;
		// Adding Zeros at the end
		for (int i = 0; i < key.length() - 1; i++) {
			input_bit += '0';
		}

		String divident = input_bit; // store the divident

		int divisor_Len = key.length(); // store the length of divisor
		String divisor = key;

		System.out.println("Divisor : " + divisor + " , divident : " + divident);
		String temp = divident.substring(0, divisor_Len); // extract the value as same length of divisor
		System.out.println("\nSender Side ..... ");
		System.out.print("\nDivisor : " + divisor + " , Temp : " + temp + "\n");

		String result = BinaryDivision(divident, key, temp); // perform binary division

		System.out.println("\nRemainder : " + result); // display the remainder

		String final_result = recieverSide(key, input_copy, result); // perform the receiver side

		//	checks for errors 
		if (final_result.contains("1")) {
			System.out.println("The remainder doesn't contains all zeros , hence errors");
		} else {
		
			System.out.println("correct message received \nThe remainder contains all zeros , hence no errors");
		}
	}

	// Perform Binary Division Operation
	private static String BinaryDivision(String divident, String key, String temp) {
		int divisor_Len = key.length(); // length of key 
		String result = XOR_Operation(key, temp); 	// // perform XOR operation
		result = extractStr_Zero(result); // extract the zero from the result if it contains in first position

		String divisor = "";
		for (int i = divisor_Len; i < divident.length(); i++) {
			if (result.length() != key.length()) {
				result = result + divident.charAt(i);
			}

			if (result.charAt(0) == '0') {
				divisor = "0000";
			} else {
				divisor = key;
			}
			System.out.println("Divisor : " + divisor + " , Temp : " + result);
			result = XOR_Operation(divisor, result);

			result = extractStr_Zero(result);

		}
		return result;
	}

	//  Extract the zero from the result if it contains in first position
	private static String extractStr_Zero(String result) {
		int i = 0;
		while (i < result.length()) {
			if (result.charAt(0) == '0') {
				i++;
				break;
			}
		}
		return result.substring(i, result.length());
	}

	// Perform XOR Operation 
	private static String XOR_Operation(String divisor, String temp) {
		String result = "";

		for (int i = 0; i < temp.length(); i++) {
			result += (divisor.charAt(i) == temp.charAt(i)) ? "0" : "1"; // if values are same set as 0 or else 1
		}

		return result;
	}

	// Perform Receiver Side
	public static String recieverSide(String key, String divident, String senderKey) {

		for (int i = 0; i < senderKey.length(); i++) {
			divident += senderKey.charAt(i);
		}

		System.out.println("Encoded Data (Data + Remainder) : " + divident);

		int divisor_Len = key.length();
		String divisor = key;

		String temp = divident.substring(0, divisor_Len);

		System.out.println("\n\nDivisor : " + divisor + " , divident : " + divident);
		System.out.println("\nReciever Side ......");
//		System.out.print("\nDivisor : " + divisor + " , Temp : " + temp + "\n");

		System.out.print("\nPlease enter the correct divident : ");
		
		Scanner sc = new Scanner(System.in); 
		
		String input = sc.nextLine();	// takes an input 
		
		divident = input; // replace the input into dividend
		
		String result = BinaryDivision(divident, key, temp); // perform binary division

		System.out.println("\nRemainder : " + result);
		return result;
	}
}