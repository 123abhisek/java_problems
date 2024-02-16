package DSA.Tree;

public class Practice_Binary_tree {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static int index = -1;

	public static Node insertNodes(int[] nodes) {
		index++;
		if (index >= nodes.length || nodes[index] == -1) {
			return null;
		}
		Node newNode = new Node(nodes[index]);
		newNode.left = insertNodes(nodes);
		newNode.right = insertNodes(nodes);

		return newNode;
	}

	public static void preOrder(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static int countNodes(Node root) {
		if (root == null) {
			return 0;
		}

		int leftNode = countNodes(root.left);
		int rightNode = countNodes(root.right);

		return leftNode + rightNode + 1;
	}

	public static int sumOfNodes(Node root) {
		if (root == null) {
			return 0;
		}

		int leftSum = sumOfNodes(root.left);
		int rigthSum = sumOfNodes(root.right);

		return leftSum + rigthSum + root.data;
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rigthHeight = height(root.right);

		return Math.max(leftHeight, rigthHeight) + 1;
	}

	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = insertNodes(nodes);

//		preOrder(root);

//		inOrder(root);

//		postOrder(root);

//		System.out.println(countNodes(root));

//		System.out.println(sumOfNodes(root));

//		System.out.println(height(root));
		
		
		
	}

}
