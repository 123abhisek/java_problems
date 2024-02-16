package DSA.Tree;

import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
	}
}

class Tree {
	Scanner sc;

	public Node createTree() {

		Node root = null;
		System.out.println("Enter the data : ");
		int data = sc.nextInt();

		if (data == -1)
			return null;
		
		
		root = new Node(data);
		
		
		System.out.println();
		return root;
	}

}

public class Practice_Tree_structure {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.createTree();

	}

}
