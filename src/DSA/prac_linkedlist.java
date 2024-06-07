package DSA;

import java.util.Iterator;

class pNode {
	int data;
	pNode next;

	public pNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class prac_linkedlist {

	static pNode head = null;

	public static void insertData(int data) {

		pNode newNode = new pNode(data);

		if (head == null) {
			head = newNode;
		} else {
			pNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public static void display() {

		pNode temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);

	}

	public static pNode doubleIt(pNode head) {
		StringBuilder sb = new StringBuilder();
		pNode temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			sb.append(temp.data);
			temp = temp.next;
		}
		System.out.print(temp.data);
		sb.append(temp.data);

		System.out.println("string : " + sb.toString());
		String a =String.valueOf( Integer.valueOf(sb.toString()) * 2);
		sb.setLength(0);
		System.out.println("string 1 : "+sb.toString()+" a : "+a);
		for (int i = a.length()-1; i >=0; i--) {
			sb.append(a.charAt(i));
		}
		Integer a1 = Integer.valueOf(sb.toString());
		System.out.println(a1);

		System.out.println("node data 1 ");
		pNode temp1 = head;
		while (temp1.next != null) {
			System.out.print(temp1.data + " ");
			sb.append(temp1.data);
			temp1 = temp1.next;
		}
		System.out.print(temp1.data + " ");
		head = null;
		while (a1 > 0) {
			int digit = a1 % 10;
			insertData(digit);
			System.out.println("number : " + digit);
			a1 = a1 / 10;
		}
		
		System.out.println("node data ");
		pNode temp2 = head;
		while (temp2.next != null) {
			System.out.print(temp2.data + " ");
			sb.append(temp2.data);
			temp2 = temp2.next;
		}
		System.out.print(temp2.data + " ");

		return head;
	}

	public static void main(String[] args) {
		insertData(1);
		display();
		System.out.println();
		insertData(8);
		display();
		System.out.println();
		insertData(9);
		display();

		doubleIt(head);
	}

}
