package Problems;

import java.util.Scanner;

class stack {
	int n = 10;
	int a[] = new int[n];
	int top = -1;

	public void push() {
		if (top == (n - 1)) {
			System.out.println("stack is overflow");
		} else {
			System.out.println("enter a elements");
			// Scanner sc=new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			top = top + 1;
			a[top] = i;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("the stack is underflow");
		} else {
			top = top - 1;

		}
	}

	public void display() {
		System.out.println("the elements are...");
		for (int j = top; j >= 0; j--) {
			System.out.println(a[j]);
		}
	}

}

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack s = new stack();

		s.push();
		s.display();
		s.pop();
		s.display();

	}

}
