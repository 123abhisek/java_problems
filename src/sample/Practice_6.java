package sample;

import java.util.Scanner;

/*
 * 
 * Problem: Sum of Two Integers 
 - Write a program that takes two integer inputs from the user, wraps them using 
the Integer class, performs the sum using auto-boxing, and then prints the result
 *
 */

/*
 * public class Practice_6 {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the first number : "); Integer in1 = sc.nextInt();
 * 
 * System.out.println("Enter the second number : "); Integer in2 = sc.nextInt();
 * 
 * Integer sum = in1.intValue() + in2.intValue();
 * 
 * System.out.println(sum);
 * 
 * }
 * 
 * }
 */

/*
 * - Create a program that reads three double values from the user, wraps them
 * using the Double class, calculates their average using auto-boxing, and
 * displays the result.
 * 
 */

/*
 * public class Practice_6 {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the first double : "); Double d1 = sc.nextDouble();
 * System.out.println("Enter the second double : "); Double d2 =
 * sc.nextDouble(); System.out.println("Enter the third double : "); Double d3 =
 * sc.nextDouble();
 * 
 * Double avg = ( d1 + d2 + d3 ) / 3;
 * System.out.println("Average of "+d1+" "+d2+" and "+d3+" is : "+avg); } }
 */

/*
 * Problem: Concatenate Strings using AutoBoxing 
 - Implement a program that takes two strings as input, wraps them using the 
String class, concatenates them using auto-boxing, and then prints the concatenated
result.
*/

/*
 * public class Practice_6 { public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("enter the first string : "); String s1 = sc.next();
 * 
 * System.out.println("enter the second string : "); String s2 = sc.next();
 * 
 * String result = s1+" "+s2;
 * 
 * System.out.println("Concatenated string : "+result);
 * 
 * } }
 */

/*
 * 
 * Problem: Abstract Shape Area Calculation 
 - Create an abstract class called `Shape` with an abstract method 
`calculateArea()`. Implement concrete classes `Circle` and `Rectangle` that extend 
the `Shape` class. Calculate and display the area of a circle and a rectangle.
 * 
 */

/*
 * abstract class Shape {
 * 
 * public abstract void calculateArea();
 * 
 * }
 * 
 * class Circle extends Shape { public void calculateArea() { int radius = 12;
 * double area = 2 * 3.14 * radius; System.out.println("Area of circle : "+
 * area); }
 * 
 * }
 * 
 * class Rectangle extends Shape{ public void calculateArea() { int length = 12;
 * int breadth = 13; double area = length * breadth;
 * System.out.println("Area of Rectangle : "+ area); } }
 * 
 * public class Practice_6 { public static void main(String[] args) { Circle c1
 * = new Circle(); c1.calculateArea(); Rectangle r1 = new Rectangle();
 * r1.calculateArea(); } }
 */

/*
 * Problem: Abstract Employee Class 
 - Design an abstract class called `Employee` with attributes `name` and 
`salary`. Extend this class to create concrete classes `Manager` and `Developer`. 
Implement a method to display the details of each employee.

 */

/*
 * abstract class Employee{ String name; int salary;
 * 
 * public Employee(String name,int salary) { this.name=name; this.salary=salary;
 * }
 * 
 * public abstract void display(); }
 * 
 * class Manager extends Employee{ public Manager(String name ,int salary) {
 * super(name,salary); }
 * 
 * public void display() {
 * System.out.println("Manager Details : \nName : "+name+"\nSalary : "+salary);
 * } }
 * 
 * class Developer extends Employee{ public Developer(String name,int salary) {
 * super(name,salary); }
 * 
 * public void display() {
 * System.out.println("Developer Details : \nName : "+name+"\nSalary : "+salary)
 * ; }
 * 
 * }
 * 
 * public class Practice_6 {
 * 
 * public static void main(String[] args) {
 * 
 * Manager manager = new Manager("John",2000); manager.display();
 * 
 * Developer developer = new Developer("Alice",23000); developer.display();
 * 
 * }
 * 
 * }
 */

/*
 * 
 * Create a class with a final variable, and try to change its value within the 
class. Implement another class that extends the first class and tries to modify the
final variable. Observe the compiler error and explain the concept of a final 
variable.
 * 
 */

/*
 * interface Shape{ public void calculateArea(); public void displayShape(); }
 * 
 * class Circle implements Shape{
 * 
 * public void calculateArea() { double radius = 12; double area = 2 * 3.14 *
 * radius; System.out.println("Circle Area : "+area); }
 * 
 * public void displayShape() { System.out.println("Circle Shape : Circle"); } }
 * 
 * class Square implements Shape{ public void calculateArea() { double area =
 * 2*2; System.out.println("Square Area : "+area); }
 * 
 * public void displayShape() { System.out.println("Square Shape : Square"); } }
 * 
 * public class Practice_6 { public static void main(String[] args) {
 * 
 * Circle c = new Circle(); c.calculateArea(); c.displayShape();
 * 
 * Square s = new Square(); s.calculateArea(); s.displayShape();
 * 
 * } }
 */

/*
 * 
 * - Create two interfaces `Flyable` and `Swimmable` with respective methods 
`fly()` and `swim()`. Implement these interfaces in a class called `Bird`. Display 
the actions of a bird flying and swimming.
 * 
 */

/*
 * interface Flyable { public void fly(); }
 * 
 * interface Swimmable { public void swim(); }
 * 
 * class Bird implements Flyable, Swimmable { public void fly() {
 * System.out.println("Bird is flying"); }
 * 
 * public void swim() { System.out.println("Bird is Swimming"); } }
 * 
 * public class Practice_6 { public static void main(String[] args) { Bird bird
 * = new Bird(); bird.fly(); bird.swim(); } }
 */

/*
 * 
 * Problem: Anonymous Inner Class 
 * 
 */

//class A{
//	void show() {
//		System.out.println("This is show");
//	}
//}
//
//public class Practice_6 {
//	public static void main(String[] args) {
//		A obj = new A() {
//			void show() {
//				System.out.println("This is anonymous show");
//			}
//		};
//		obj.show();
//	}
//}

/*
 * 
 * Problem: Anonymous Inner Interface 
 * 
 */

/*
 * interface A { void show(); }
 * 
 * public class Practice_6 { public static void main(String[] args) {
 * 
 * A obj = () -> { System.out.println("This is interface ananymous"); };
 * obj.show(); } }
 */

