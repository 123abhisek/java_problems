//package DSA;
//
//class Stack {
//
//	int[] stack = new int[5];
//	int top = 0;
//
//	public void push(int data) {
//		if (!isFull()) {
//			stack[top] = data;
//			top++;
//		} else {
//			System.out.println("Stack is full");
//		}
//	}
//
//	public int pop() {
//		if (!isEmpty()) {
//			int data;
//			top--;
//			data = stack[top];
//			stack[top] = 0;
//			return data;
//		}
//		else {
//			System.out.println("Stack is Empty");
//		}
//	}
//
//	public int peek() {
//		int data;
//		data = stack[top - 1];
//		return data;
//	}
//
//	public int size() {
//		return top;
//	}
//
//	public boolean isEmpty() {
//		return (size() == 0) ? true : false;
//	}
//
//	public boolean isFull() {
//		return (top == 5) ? true : false;
//	}
//
//	public void display() {
//		for (int i = stack.length - 1; i >= 0; i--) {
//			System.out.println(stack[i]);
//		}
//	}
//}
//
//public class Practice_Stack {
//
//	public static void main(String[] args) {
//		Stack stack = new Stack();
//
//		stack.push(12);
//		stack.push(10);
//		stack.push(14);
//		stack.push(16);
//		stack.push(20);
//		stack.push(21);
//		stack.display();
//		System.out.println(stack.size() + "\n" + stack.isEmpty());
//
//	}
//
//}



// Dynamic stack implementation

package DSA;

class Stack {
	int capacity = 2;
	int[] stack = new int[2];
	int top = 0;

	public void push(int data) {
		if (size() == capacity) {
			expand();
		}
			stack[top] = data;
			top++;
		
	}

	private void expand() {
		
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity*= 2;
	}

	public int pop() {
		int data;
		if (!isEmpty()) {
			
			top--;
			data = stack[top];
			stack[top] = 0;
			return data;
		}
		else {
			System.out.println("Stack is Empty");
		}
		
		return -1;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return (size() == 0) ? true : false;
	}

	public boolean isFull() {
		return (top == 5) ? true : false;
	}

	public void display() {
		for (int i = stack.length - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}

public class Practice_Stack {

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(12);
		stack.push(10);
		stack.push(14);
		stack.push(16);
		stack.push(20);
		stack.push(21);
		stack.push(27 );
		stack.display();
		System.out.println(stack.size() + "\n" + stack.isEmpty());

	}

}
