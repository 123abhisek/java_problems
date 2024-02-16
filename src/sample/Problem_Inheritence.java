package sample;

/*
 * Create a class `Vehicle` with attributes `brand` and `year`, and a method 
	`displayInfo()` to print the brand and year of the vehicle. Create a subclass `Car`
	that inherits from `Vehicle` and adds a new attribute `model`. Override the 
	`displayInfo()` method in `Car` to include the model.
	
 */

//class Vehicle{
//	String brand;
//	int year;
//	
//	public Vehicle(String brand,int year) {
//		this.brand = brand;
//		this.year = year;
//	}
//	
//	public void displayInfo() {
//		System.out.println("Vehicle Information : "+brand+" "+year);
//	}
//}
//
//class Car extends Vehicle{
//	String model;
//	
//	public Car(String model) {		
//		this.model=model;
//	}
//	
//	public void displayInfo() {
//		System.out.println("Car Information : "+brand+" "+year+" "+model);
//	}
//}
//
//
//public class Problem_Inheritence {
//	
//	public static void main(String[] args) {
//		
//		Vehicle vehicle = new Vehicle("Toyota",2020);
//		vehicle.displayInfo();
//		Car car = new Car("Camry");
//		car.displayInfo();
//	}
//
//}

/*
 * 
 * Create a class `Person` with attributes `name` and `age`. Create a subclass 
`Student` that inherits from `Person` and adds a new attribute `grade`. Override 
the `toString()` method in both classes to display the information.
 * 
 */

//class Person{
//	String name;
//	int age;
//	
//	public Person(String name,int age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public void ToString() {
//		System.out.println("Person : "+name+", Age : "+age);
//	}
//	
//}
//
//class Student extends Person{
//	String grade;
//	
//	public Student(String name,int age,String grade) {
//		super(name,age);
//		this.grade=grade;
//	}
//	
//	public void ToString() {
//		System.out.println("Student : "+name+", Age : "+age+", Grade : "+grade);
//	}
//}
//
//public class Problem_Inheritence {
//
//	public static void main(String[] args) {
//		Person person = new Person("John", 25);
//		person.ToString();
//		Student student = new Student("Alice", 20, "A");
//		student.ToString();	
//	}
//
//}

/*
 * 
 * Implement a class `Shape` with a method `calculateArea()` that returns 0. Create
two subclasses `Circle` and `Rectangle` that inherit from `Shape` and override the 
`calculateArea()` method to compute the area of the circle and rectangle, 
respectively.

 * 
 */

//class Shape {
//
//	public double calculateArea() {
//		return 0;
//	}
//}
//
//class Circle extends Shape {
//
//	int radius;
//
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//
//	public double calculateArea() {
//		double PI = 3.14;
//		return PI * (radius * radius) ;
//	}
//}
//
//class Rectangle extends Shape {
//
//	int length;
//	int breadth;
//
//	public Rectangle(int length, int breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}
//
//	public double calculateArea() {
//
//		return length * breadth;
//	}
//}
//
//public class Problem_Inheritence {
//
//	public static void main(String[] args) {
//		Circle circle = new Circle(5);
//		System.out.println("Cirle Area : "+circle.calculateArea());
//		Rectangle rectangle = new Rectangle(4, 6);
//		System.out.println("Rectangle Area : "+rectangle.calculateArea());
//
//	}
//
//}

/*
 * 
 * Create a class `Animal` with a method `makeSound()` that prints "Generic Animal 
Sound". Create two subclasses `Dog` and `Cat` that inherit from `Animal` and 
override the `makeSound()` method with specific sounds for each.
 * 
 */

//class Animal{
//	public void makeSound() {
//		System.out.println("Generic Animal Sound");
//	}
//}
//
//class Dog extends Animal{
//	public void makeSound() {
//		System.out.println("Woof! Woof!");
//	}
//}
//
//class Cat extends Animal{
//	public void makeSound() {
//		System.out.println("Meow!");
//	}
//}
//
//
//public class Problem_Inheritence {
// 
//	public static void main(String[] args) {
//		
//		Animal genericAnimal = new Animal();
//		genericAnimal.makeSound();
//		Dog dog = new Dog();
//		dog.makeSound();
//		Cat cat = new Cat();
//		cat.makeSound();
//		
//	}
//}

/*
 * 
 * Implement a class `BankAccount` with attributes `accountNumber` and `balance`. 
Create two subclasses `SavingsAccount` and `CheckingAccount` that inherit from 
`BankAccount` and add specific methods such as `calculateInterest()` for savings 
account and `deductFees()` for checking account.
 * 
 * 
 */

class BankAccount{
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
}

class SavingAccount extends BankAccount{
	
	public SavingAccount(String accountnumber,int balance) {
		super(accountnumber,balance);
	}
	
	public void calculateInterest(double interest) {
		balance += interest;
	}
}

class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	
	public void deductFees(double deductFees) {
		balance -= deductFees;
	}
}

public class Problem_Inheritence {

	public static void main(String[] args) {

		SavingAccount savingsAccount = new SavingAccount("12345", 1000);
		savingsAccount.calculateInterest(12);
		System.out.println("Savings Account Balance: "+savingsAccount.getBalance());
		CheckingAccount checkingAccount = new CheckingAccount("67890", 1500);
		checkingAccount.deductFees(100);
		System.out.println("Checking Account Balance: "+checkingAccount.getBalance());
		
	}
}

/*
 * 
 * Create a base class `Shape` with a method `draw()` that prints "Drawing a 
Shape". Create a subclass `Circle` that inherits from `Shape` and overrides the 
`draw()` method to print "Drawing a Circle using Super"
 * 
 */

//class Shape{
//	public void draw() {
//		System.out.println("Drawing a Shape");
//	}
//}
//
//class Circle extends Shape{
//	public void draw() {
//		System.out.println("Drawing a Circle using Shape");
//	}
//}
//
//public class Problem_Inheritence {
//
//	public static void main(String[] args) {
//		
//		Circle circle = new Circle();
//		circle.draw();
//		
//	}
//}

/*
 * Create a class `Person` with a method `displayInfo()` that prints "Person 
Information". Create a subclass `Employee` that inherits from `Person` and 
overrides the `displayInfo()` method to print "Employee Information using Super".
 * 
 */

//class Person {
//	
//	public Person() {
//		
//	}
//	
//	public void displayInfo() {
//		System.out.println("Person Information");
//
//	}
//}
//
//class Employee extends Person {
//	
//	public Employee() {
//		super();
//	}
//
//	public void displayInfo() {
//		System.out.println("Employee Information using super");
//	}
//}
//
//public class Problem_Inheritence {
//
//	public static void main(String[] args) {
//
//		Employee employee = new Employee();
//		employee.displayInfo();
//	}
//}



