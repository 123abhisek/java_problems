package DSA;

class Node {
	int data;
	Node next;
}

class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {

		if (index == 0) {
			insertAtStart(data);
		} else {

			Node node = new Node();
			node.data = data;
			node.next = null;

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next=n1.next;
			
			n1=null;
		}
	}

	public void show() {
		Node n = head;

		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);

	}
}

public class Practice_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(24);
		list.insert(34);
		
		list.insertAtStart(25);
		list.insertAtStart(50);
		
		list.insertAt(2, 70);
		
		list.deleteAt(4);
		
		list.show();
	}

}
