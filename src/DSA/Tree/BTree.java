package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {

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

	static class BinaryTree {
		static int index = -1;

		public static Node buildTree(int nodes[]) {
			index++;
			if (index >= nodes.length || nodes[index] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

	public static void preorder(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {

		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void levelOrder(Node root) {

		if (root == null) {
			return;
		}

		Queue<Node> q = new LinkedList<BTree.Node>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node curNode = q.remove();
			if (curNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(curNode.data + " ");
				if (curNode.left != null) {
					q.add(curNode.left);
				}
				if (curNode.right != null) {
					q.add(curNode.right);
				}
			}
		}
	}

	public static int countOfNode(Node root) {

		if (root == null) {
			return 0;
		}
		int leftNodes = countOfNode(root.left);
		int rightNodes = countOfNode(root.right);

		return leftNodes + rightNodes + 1;

	}

	public static void postorder(Node root) {

		if (root == null) {
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	public static int sumOfNodes(Node root) {
		if (root == null) {
			return 0;
		}

		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);

		return leftSum + rightSum + root.data;
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}

		int leftSum = height(root.left);
		int rightSum = height(root.right);

		int myheight = Math.max(leftSum, rightSum) + 1;

		return myheight;
	}

	public static int diameter(Node root) {

		if (root == null) {
			return 0;
		}
		
		int diameter1 = diameter(root.left);
		int diameter2 = diameter(root.right);
		int diameter3 = height(root.left) + height(root.right) + 1;

		return Math.max(diameter3, Math.max(diameter1, diameter2));
	}

	static class TreeInfo {
		int ht;
		int diam;

		public TreeInfo(int ht, int diam) {
			this.ht = ht;
			this.diam = diam;
		}
	}

	public static TreeInfo diameter2(Node root) {

		if (root == null) {
			return new TreeInfo(0, 0);
		}

		TreeInfo left = diameter2(root.left);
		TreeInfo right = diameter2(root.right);

		int myHeight = Math.max(left.ht, right.ht) + 1;

		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;

		int mydiam = Math.max(Math.max(diam1, diam2), diam3);

		TreeInfo myInfo = new TreeInfo(myHeight, mydiam);

		return myInfo;

	}

	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);

//		preorder(root);

//		inorder(root);

//		postorder(root);

//		levelOrder(root);

//		System.out.println(countOfNode(root));

//		System.out.println(sumOfNodes(root));
		
//		System.out.println(height(root));
		
//		System.out.println(diameter(root));
		
//		System.out.println(diameter2(root).diam);
		
		
	}

}
