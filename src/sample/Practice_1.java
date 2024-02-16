package sample;

import java.util.*;

public class Practice_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Globally declared 
		
		
		// 1. Declare two variables, x and y, and assign values of your choice to them. Print their sum.
		
		int x = 5;
		int y = 10;
		
		System.out.println("Sum is : "+ (x+y));
		
		// 2. Create a variable name and assign your name to it. Print a greeting using the variable.
		
		String name = "Abhishek";
		System.out.println("Good Morning "+name);
		
		
		// 3. Write a program that takes an integer input from the user and prints whether it is even or odd.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the positive number : ");
		int value = sc.nextInt();
		
		// using Ternary Operator
		System.out.println((value % 2 == 0) ? "Even" : "Odd");
		
		// using If-else statement
		
		if(value % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		// Switch Statement
		
		switch(value % 2 ) {
			case 0:
				System.out.println("Even");
				break;
			case 1 :
				System.out.println("Odd");
				break;
		}
		
		
		// 4. Create two variables, num1 and num2. Write a program that compares them and prints the larger number.
		
		
		System.out.println("Enter num 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num 2 :");
		int num2 = sc.nextInt();
		
		System.out.println((num1 > num2 ) ? "Larger is "+num1 : "Larger is "+num2 );  // using Ternary Operator
		
		// 5. Declare three variables a, b, and c. Calculate the result of the expression (a + b) * c and print it.
		
		int a = 2 , b=10 , c= 5 ;
		
		int result = (a + b) * c ;
		
		System.out.println("The Result is "+result);
		
		// 6. Take two numerical inputs from the user and calculate their quotient and remainder. Print the result.
		
		
		System.out.println("enter the num 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("enter the num 2 :");
		int num2 = sc.nextInt();
		
		int rem = num1 % num2 ; // return remainder 
		double quotient = (double) num1 / num2 ; 
		
		System.out.println("Quotient is : "+quotient+"\nRemainder is : "+rem);
		
		
		// 7. Create a program that asks the user for their age. If the age is less than 18, print "You are a minor." Otherwise, print "You are an adult."
	
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println((age < 18) ? "You are a minor." : "You are an adult." );

		
		// 8. Declare a variable temperature and initialize it with a value. Write a program that checks if the temperature is above 30 degrees Celsius. If it is, print "It's a hot day!" otherwise, print "The weather is pleasant."
		
		double temperature = 32;
		
		System.out.println((temperature > 30) ?  "It's a hot day!" :  "The weather is pleasant." );
		
	}

}
