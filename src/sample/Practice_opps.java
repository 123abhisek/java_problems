package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// int, float,double

//public class Practice_opps {
//
//	public static void main(String[] args) {
//
//		// Wrapper class
//		
//		
////		int i=5; // Primitive datatype
////		Integer i = new Integer(5); // boxing - wrapper
//		
//		
////		String str = "123";
////		int n = Integer.parseInt(str);
////		System.out.println(n);
//	}
//}

// Abstract Class

//abstract class Human {
//	
//	public abstract void eat();
//	
//	public void walk() {
//
//	}
//}
//
//class Man extends Human{
//	public void eat() {
//		
//	}
//}
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//		
////		Human h = new Human(); // cannot create object 
//		Man h = new Man();
//	}
//}

// Final keyword

//class A{
//	final int i=0;
//	
//	public A() {
////		i=5;
//	}
//}

//final class A {
//	final int i = 0;
//
//	public A () {
////		i=5;
//	}
//}
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//
//		A obj = new A();
//		System.out.println(obj.i);
//	}
//}

// Anonymous class

// when we want to create class for one time use then it is called as Anonymous class
// this class cannot be inherited ..

//class A {
//	public void show() {
//		System.out.println("A class show ");
//	}
//}
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//		
//		A obj = new A() { // anonymous class
//			public void show() {
//				System.out.println(" this is best ");
//			}
//		};
//		
//		obj.show();
//	}
//}

//Anonymous Interface

//interface A {
//	public void show();
//}
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//
//		A obj = new A() { // anonymous interface
//			public void show() {
//				System.out.println(" this is best ");
//			}
//		};
//
//		obj.show();
//	}
//}

// types of interface
/*
 *  1. Normal
 *   2. Single abstract method - Functional interface  ->  lambda expression -- scala
 *   3. Marker interface
 */

//interface Abc{
//	void show();
//}
//
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//		
//		
//	}
//}

// Inheritence using interface

//interface A {
//	default void show() {
//		System.out.println("this is A show");
//	}
//}
//
//interface B {
//	default void show() {
//		System.out.println("this is B show");
//	}
//}
//
//class C implements A, B {
//	
//	public void show() {
//		B.super.show();
//	}
//
//}
//
//public class Practice_opps {
//
//	public static void main(String[] args) {
//		C obj = new C();
//		obj.show();
//	}
//}

// Package 

// Access modifier : public , private , protected
// It is used in classes and methods

// Exception Handling 

// Try Catch Finally

//public class Practice_opps {
//
//	public static void main(String[] args) {

//		try {
//			int result = 4/ 0;
//			System.out.println(result);
//		}
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Byee");
//		}

// Multiple Catch Block

//		try {
//			int result = 4 / 0;
//			System.out.println(result);
//		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Byee");
//		}

// checked exceptions 

public class Practice_opps {

	public static void main(String[] args) throws Exception {
//		int a = 5;
//		
//		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		// try - catch finally
//		try {
//			br1.readLine();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			br1.close();
//		}

		// try - with resources
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			br.readLine();
//		}// automatically closes the buffer reader

		// the classes related to I/O packages are considered as resources

		// use defined Exception

//		int k = 5;
//		int j = 5;
//
//		try {
//			if (k == j)
//				throw new AbhiException("This is not possible");
//		} catch (Exception e) {
//			System.out.println("Error "+e.getMessage());
//		}

	}
}
