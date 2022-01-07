package org.espire.binaryTree;

public class BinaryTree {

	// class for binary tree node
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}

	// function to create a new node
	public static TreeNode newNode(int data) {
		TreeNode node = new TreeNode();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	// function to print leaf
	public static TreeNode printLeaves(TreeNode root) {
		if (root == null) {
			return null;
		}

		if (root.left == null && root.right == null) {
			System.out.println("" + root.data);
		}

		// if left child exist
		if (root.left != null) {
			printLeaves(root.left);
		}

		// if right child exist
		if (root.right != null) {
			printLeaves(root.right);
		}
		return root;
	}

	public static void main(String args[]) {

		TreeNode root = newNode(1);
		root.left = BinaryTree.newNode(2);
		root.right = BinaryTree.newNode(3);
		root.left.left = BinaryTree.newNode(4);
		root.right.left = BinaryTree.newNode(5);
		root.right.right = BinaryTree.newNode(6);

		printLeaves(root);
	}
}
