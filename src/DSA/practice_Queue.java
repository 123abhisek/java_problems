package DSA;

class Queue {
	int[] queue = new int[5];
	int size;
	int front;
	int rear;

	public void enqueue(int data) {
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}

	public int dequeue() {
		int data = queue[front];
//		queue[front]=0;
		front = front + 1;

		return data;
	}

	public void show() {
		for (int i=0;i<size;i++) {
			System.out.print(queue[front+i] + " ");		
		}
	}
}

public class practice_Queue {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enqueue(12);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

//		queue.show();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
//		System.out.println("\nDeleted value : "+queue.dequeue());
		queue.show();
	}

}
