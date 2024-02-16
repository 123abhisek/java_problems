package sample;

import java.util.Scanner;

//Class and Object, constructor , overloading with methods and constructors  : 2h:3min time ,

//class Calculator{
//	
//	int num1;
//	int num2;
//	int result ;
//	
//	public void perform() {
//		
//		result = num1+num2;
//	}
//	
//	
//}

//class A{
//	
//	int num1;
//	int num2;
//	
//	public A() { // default Consructor
//		num1=5;
//		num2=5;
//	}
//	
//	public A(int a,int b) { // Parameterized Constructor
//		num1 = a;
//		num2 = b;
//	}
//}

//class Emp{
//	int empId;
//	int salary;
//	String ceo;
//	
//	public void show() {
//		System.out.println(empId+" : "+salary+" : "+ceo);
//	}
//	
//}

// 1. Define a Car class with attributes such as make, model, and year.
//	  Create an object of the Car class and set values for its attributes.
// 	  Write a method to display the details of the car.

//class Car {
//	String make;
//	String model;
//	int year;
//	
//	public void display() {
//		System.out.println(make+" : "+model+" : "+year);
//	}
//}

// 2. Create a Student class with attributes name, rollNumber, and grade.
//    Instantiate multiple objects of the Student class and display their information.

//class Student{
//	String name;
//	int rollNumber;
//	double grade;
//	
//	public void display() {
//		System.out.println(name +" : "+ rollNumber +" : "+ grade);
//	}
//}

// 3. Create a Book class with attributes title, author, and price.
// 		Implement a parameterized constructor to initialize these attributes.
// 		Create an object using the constructor and display the book details.

//class Book{
//	String title;
//	String author;
//	int price;
//	
//	public Book(String _title,String _author,int _price) {
//		title = _title;
//		author = _author;
//		price = _price;
//	}
//	
//	public void display() {
//		System.out.println(title+" : "+author+" : "+price);
//	}
//}

// 4. Create an Employee class with attributes name, employeeId, and position.
//		Implement a default constructor that sets default values for these attributes.
//		Create an object using the default constructor and display the employee details.

//class Employee{
//	String name ;
//	int employeeId;
//	String position;
//	
//	public Employee() {
//		name = "Abhishek R J";
//		employeeId = 1011;
//		position = "Senior";
//	}
//	
//	public void display() {
//		System.out.println(name +" : "+employeeId+" : "+position);
//	}
//}

// 5. Create a Calculator class with overloaded methods for addition, subtraction, multiplication, and division.
//		Include versions of these methods that accept different data types (int, double).
//		Demonstrate the use of each method.

//		class Calculator{
//			
//			// Addition
//			public void add(int a,int b) {
//				int result = a+b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void add(int a,double b) {
//				double result = (double)(a + b);
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void add(double a,double b) {
//				double result = a + b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			// Subtraction
//			public void sub(int a,int b) {
//				int result = a-b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void sub(int a,double b) {
//				double result = (double)(a - b);
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void sub(double a,double b) {
//				double result = a - b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			// Multiplication
//			public void mul(int a,int b) {
//				int result = a*b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void mul(int a,double b) {
//				double result = (double)(a * b);
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void mul(double a,double b) {
//				double result = a * b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			// Divide
//			public void div(int a,int b) {
//				int result = a/b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void div(int a,double b) {
//				double result = (double)(a / b);
//				System.out.println(a+" + "+b+" : "+result);
//			}
//			
//			public void div(double a,double b) {
//				double result = a / b;
//				System.out.println(a+" + "+b+" : "+result);
//			}
//		}


		// 6. Create a Rectangle class with attributes length and width.
		// 		Implement overloaded constructors to initialize the rectangle with either default values or user-provided values.
		//		Calculate and display the area of the rectangle.

//class Rectangle{
//	int length;
//	int width;
//	
//	public Rectangle() {
//		length = 10;
//		width = 5;
//	}
//	
//	public Rectangle(int _length,int _width) {
//		length = _length;
//		width = _width;
//	}
//	
//	public void display() {
//		System.out.println("Area of Rectangle : "+(length*width));
//	}
//}

		// 7. Create a Counter class with a static variable count to keep track of the number of instances created.
		//		Implement a parameterized constructor that increments the count.
		//		Display the total count of instances created.

class Counter{
	public static int count = 0;
	
	public Counter() {
		count ++;
	}
	
	public static void display() {
		System.out.println("total cunt od instance created : "+count);
	}
}

		// 8. Enhance the Employee class from a previous problem with a printDetails method.
		//		Use the this keyword to differentiate between instance variables and parameters in the method.


		class Employee {
			String name;
			int employeeId;
			String position;

			public Employee(String name, int employeeId, String position) {
				this.name = name;
				this.employeeId = employeeId;
				this.position = position;
			}

			public void display() {
				System.out.println(name + " : " + employeeId + " : " + position);
			}
		}

public class Pracice_3 {

	public static void main(String[] args) {

//		Calculator cal = new Calculator(); // object knows something and does somethings
//		cal.num1 = 5;
//		cal.num2 = 3;
//		
//		cal.perform();
//		
//		System.out.println(cal.result);

//		A obj = new A(2,4);
//		
//		System.out.println(obj.num1);

//		Emp emp1 = new Emp();
//		emp1.empId = 10;
//		emp1.salary = 40000;
//		emp1.ceo = "Mukesh";
//		
//		Emp emp2 = new Emp();
//		emp2.empId = 11;
//		emp2.salary = 550000;
//		emp2.ceo = "Sukesh";
//		
//		emp1.show();
//		emp2.show();

		// 1. Define a Car class with attributes such as make, model, and year.
		// Create an object of the Car class and set values for its attributes.
		// Write a method to display the details of the car.

//		Car c1 = new Car();
//		c1.make = "loin";
//		c1.model = "Swift";
//		c1.year = 2010;
//		
//		c1.display();
//		
//		Car c2 = new Car();
//		c2.make = "tiger";
//		c2.model = "honda";
//		c2.year = 2015;
//		
//		c2.display();

		// 2. Create a Student class with attributes name, rollNumber, and grade.
		// Instantiate multiple objects of the Student class and display their
		// information.

//		Student s1 = new Student();
//		s1.name = "Abhishek";
//		s1.rollNumber = 90;
//		s1.grade = 9.5;
//		
//		s1.display();
//		
//		Student s2 = new Student();
//		s2.name = "Nishant";
//		s2.rollNumber = 15;
//		s2.grade = 8.4;
//		
//		s2.display();
//		
//		Student s3 = new Student();
//		s3.name = "Yashwant";
//		s3.rollNumber = 67;9 
//		
//		s3.display();
//		s3.grade = 9.0;

		// 3. Create a Book class with attributes title, author, and price.
		// Implement a parameterized constructor to initialize these attributes.
		// Create an object using the constructor and display the book details.

//		Book b1 = new Book("Data Structure","Guru Swamy",1000);
//		b1.display();
//		
//		Book b2 = new Book("OPPs with Java","Mr. Java",1500);
//		b2.display();

		// 4. Create an Employee class with attributes name, employeeId, and position.
		// Implement a default constructor that sets default values for these
		// attributes.
		// Create an object using the default constructor and display the employee
		// details.

//		Employee emp = new Employee();
//		emp.display();

		// 5. Create a Calculator class with overloaded methods for addition,
		// subtraction, multiplication, and division.
		// Include versions of these methods that accept different data types (int,
		// double).
		// Demonstrate the use of each method.

//		Calculator cal = new Calculator();
//		cal.add(12, 13);
//		cal.sub(14.5, 12.3);
//		cal.mul(12, 5.5);
//		cal.div(12, 6);
		
		
		// 6. Create a Rectangle class with attributes length and width.
		// 		Implement overloaded constructors to initialize the rectangle with either default values or user-provided values.
		//		Calculate and display the area of the rectangle.
		
//		Scanner sc = new Scanner(System.in);
//		
//		Rectangle rec = new Rectangle();
//		rec.display();
//		
//		System.out.println("Enter the Length : ");
//		int length = sc.nextInt();
//		System.out.println("Enter the Width : ");
//		int width = sc.nextInt();
//		Rectangle rec1 = new Rectangle(length,width);
//		rec1.display();
		
		
		// 7. Create a Counter class with a static variable count to keep track of the number of instances created.
		//		Implement a parameterized constructor that increments the count.
		//		Display the total count of instances created.
		
//		Counter c = new Counter();
//		Counter c1 = new Counter();
//		Counter c2 = new Counter();
//		Counter.display();
		
		
		// 8. Enhance the Employee class from a previous problem with a printDetails method.
		//		Use the this keyword to differentiate between instance variables and parameters in the method.
		
		
//		Employee emp = new Employee("Abhishek",1100,"Senior");
//		emp.display();

		

	}
}
