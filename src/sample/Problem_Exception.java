package sample;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
/*
 * Write a Java program that reads two integers from the user and calculates the 
result of dividing the first integer by the second integer. Handle the 
`ArithmeticException` using a try-catch block. Ensure that the program always 
prints "End of Program" regardless of whether an exception occurs or not.
 * 
 */

/*
 * public class Problem_Exception {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first integer : "); int num1 = sc.nextInt();
 * System.out.println("Enter the second integer : "); int num2 = sc.nextInt();
 * try { int result = num1 / num2; } catch (ArithmeticException e) {
 * System.out.println("Error: Cannot divide by zero!"); }
 * 
 * System.out.println("End of Program");
 * }
 * 
 * }
 */

/*Practice Problem: 
Create a Java program that prompts the user to enter a filename and then attempts 
to open and read the content of the file. Handle both `FileNotFoundException` and 
`IOException` using separate catch blocks. Ensure that the program prints an 
appropriate error message for each exception.*/

/*
 * public class Problem_Exception { public static void main(String[] args)
 * throws IOException { Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the file name : "); String fileName =
 * sc.nextLine();
 * 
 * try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
 * 
 * String line;
 * 
 * while ((line = reader.readLine()) != null) { System.out.println(line); }
 * 
 * } catch (FileNotFoundException e) { System.out.println(e.getMessage()); }
 * 
 * System.out.println("End of Program"); } }
 */

/*. Try with Resource - User Input using Scanner:
 Practice Problem: 
Write a Java program that takes a file name from the user and reads its content 
using the `Scanner` class within a try-with-resources block. Handle any potential 
`IOException` and print an error message if it occurs. Ensure that the program*/


class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String s) {
		super(s);
	}
}

public class Problem_Exception {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter initial account balance : ");
		int initial_account = sc.nextInt();
		
		System.out.println("Enter withdrawal amount : ");
		int withdrawal = sc.nextInt();
		
		try {
			int result = (initial_account - withdrawal); 
			throw new InsufficientFundsException("Error: Insufficient funds") ;
			
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage()+"to withdraw "+withdrawal+". Balance : "+initial_account);
		}
		
		System.out.println("End of program");
	}
}
