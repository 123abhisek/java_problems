package Problems;

import java.util.*;

class Node {
	long data;
	Node next;
}

class LinkedList {
	Node head;

	public void insert(long data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}
	
	public long count() {
		Node temp = head;
		long count=0;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		count=count+1;
		return count;
	}

	long DecimalValue(Node head) {
		Node temp=head;
		int exp = (int)count()-1;
		int sum=0;
		while(temp.next!= null) {
			
			sum+= (temp.data * Math.pow(2, exp));
			System.out.println("expo : "+exp+"\t sum : "+sum);
			exp--;
			
			temp=temp.next;
		}
		sum+= (temp.data * Math.pow(2, exp));
		System.out.println("expo : "+exp+"\t sum : "+sum);
		return sum;
	}

	public void printItems() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
}

public class Decimal_Equivalent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			long data = sc.nextInt();
			list.insert(data);
		}

		list.printItems();
		System.out.println("\n"+list.count());
		System.out.println("\n"+list.DecimalValue(list.head));
	}
}