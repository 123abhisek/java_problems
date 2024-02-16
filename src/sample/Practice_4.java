package sample;

/*
 * 
 * Inner CLass
 * Member Class
 * Static Class
 * 
 * 
 */

//class Outer{

// with using static
//	int a;
//	public void show() {
//		
//	}
//	
//	class Inner{
//		
//		public void display() {
//			System.out.println("In Display");
//		}
//	}

// using  static 
//	static int a;
//	public static void show() {
//		
//	}
//	
//	static class Inner{
//		
//		public void display() {
//			System.out.println("In Display");
//		}
//	}
//	
//	
//}

//public class Practice_4 {
//
//	public static void main(String[] args) {
// TODO Auto-generated method stub

//		Outer out = new Outer();
//		out.show();
//		Outer.Inner in = out.new Inner();
//		in.display();

// using Static class 

//		Outer.Inner in = new Outer.Inner();
//		in.display();
//	}
//
//}

// Excercise 

// 1. Create a class Outer with a private instance variable outerVar. Inside the Outer class, define an inner class Inner with a method displayInner(), which prints the value of outerVar.

//class Outer{
//	int outervar;
//	
//	class Inner{
//	
//		public void display() {
//			System.out.println(outervar);
//		}
//	}
//}
//
//public class Practice_4{
//	public static void main(String[] args) {
//		Outer out = new Outer();
//		out.outervar = 24;
//		Outer.Inner in = out.new Inner();
//		in.display();
//	}
//}

// 2. Design a class University with an inner class Student. The Student class should have private attributes for student name and roll number. Implement methods in both classes to set and display the student details.

//class University{
//	class Student{
//		String name;
//		int rollNo;
//		
//		public void display() {
//			name = "Abhishek";
//			rollNo = 234;
//			System.out.println(name+" : "+rollNo);
//		}
//	}
//	
//	public void display() {
//		Student s1 = new Student();
//		s1.name = "Devraj";
//		s1.rollNo = 1234;
//		System.out.println(s1.name+" : "+s1.rollNo);
//		
//	}
//}
//
//public class Practice_4 {
//	public static void main(String[] args) {
//		University uni = new University();
//		uni.display();
//		Student s1 = uni.new Student();
//		s1.display();
//	}
//}

// 3. Create a class Car with a member class Engine. The Engine class should have attributes like horsepower and a method to start the engine. Implement methods in both classes to set and display the details of the car and its engine.

//class Car{
//	String name;
//	String model;
//	class Engine {
//		int horsepower;
//		
//		public void start_engine() {
//			System.out.println("Horsepower "+horsepower);
//		}
//	}
//	
//	public void display() {
//		System.out.println(name+" : "+model);
//	}
//}
//
//public class Practice_4 {
//	public static void main(String[] args) {
//		Car c = new Car();
//		c.model = "Swift";
//		c.name = "Ford";
//		c.display();
//		Car.Engine eng = c.new Engine();
//		eng.horsepower = 1234;
//		eng.start_engine();
//		
//	}
//}

// 4. Develop a class Bank with a member class Account. The Account class should have private attributes for account number and balance. Include methods in both classes to deposit and withdraw money.
//
//class Bank{
//	class Account{
//		int account_number;
//		int balance;
//		
//		public void deposit(int amount) {
//			balance = balance + amount;
//			System.out.println(amount+" Rs deposit");
//		}
//		
//		public void widthdraw(int amount) {
//			balance = balance - amount;
//			System.out.println(amount+" Rs withdraw");
//		}
//		
//		public void display() {
//			System.out.println("Total Balanace : "+balance);
//		}
//	}
//	
//	public void deposit(int amount) {
//		Account acc = new Account();
//		acc.balance = acc.balance + amount;
//		System.out.println(amount+" Rs deposit");
//	}
//	
//	public void widthdraw(int amount) {
//		Account acc = new Account();
//		acc.balance = acc.balance - amount;
//		System.out.println(amount+" Rs withdraw");
//	}
//	
//}
//
//
//public class Practice_4 {
//	public static void main(String[] args) {
//		
//		Bank bank = new Bank();
//		Bank.Account acc = bank.new Account();
//		acc.display();
//		acc.deposit(12);
//		acc.display();
//		acc.deposit(8);
//		acc.display();
//		acc.widthdraw(10);
//		acc.display();
//	}
//}

// 5. Implement a static class MathOperations with static methods for addition, subtraction, multiplication, and division. Demonstrate the usage of these methods in a simple program.

//public class Practice_4 {
//	
//	static class MathOperations{
//		public static void addition(int a,int b) {
//			System.out.println("Addition of "+ a +"and"+b+" : "+(a+b));
//		}
//		
//		public static void subtraction(int a,int b) {
//			System.out.println("subtraction of "+ a +"and"+b+" : "+(a-b));
//		}
//		
//		public static void multiplication(int a,int b) {
//			System.out.println("multiplication of "+ a +"and"+b+" : "+(a*b));
//		}
//		
//		public static void division(int a,int b) {
//			System.out.println("division of "+ a +"and"+b+" : "+(a/b));
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		Practice_4.MathOperations.addition(12, 8);
//		Practice_4.MathOperations.subtraction(5,3);
//		Practice_4.MathOperations.division(10, 2);
//		Practice_4.MathOperations.multiplication(5, 2);
//	}
//}

// 6. Create a class Configuration with static attributes for storing configuration settings. Include static methods to set and retrieve the configuration values. Illustrate the usage of this static class in a sample application

//public class Practice_4 { // Practice_4 same as Configuration
//	
//	static String name ;
//	static int amount;
//	
//	public static void setValues(String _name,int _amount) {
//		name = _name;
//		amount = _amount;
//	}
//	
//	public static void getValues() {
//		System.out.println(name +" : "+amount);
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		
//		setValues("Abhishek",1000);
//		getValues();
//		
//	}
//}


