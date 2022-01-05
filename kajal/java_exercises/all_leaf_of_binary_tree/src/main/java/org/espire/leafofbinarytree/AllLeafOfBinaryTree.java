package org.espire.leafofbinarytree;

/* * Java Program to print all leaf nodes of binary tree 
 * * using recursion
 *  * input : a 
 *         * / \ 
 *         b     f 
 *        / \   / \ 
 *       c   e  g   h 
 *      /            \ 
 *     d              k 
 *    
 *output: d e g k 
 **/
public class AllLeafOfBinaryTree {
	public static void main(String[] args) throws Exception {
		// let's create a binary tree
		TreeNode d = new TreeNode("d");
		TreeNode e = new TreeNode("e");
		TreeNode g = new TreeNode("g");
		TreeNode k = new TreeNode("k");
		TreeNode c = new TreeNode("c", d, null);
		TreeNode h = new TreeNode("h", k, null);
		TreeNode b = new TreeNode("b", c, e);
		TreeNode f = new TreeNode("f", g, h);
		TreeNode root = new TreeNode("a", b, f);
// print all leaf nodes of binary tree using recursion 
		System.out.println("All leaf nodes of a binary tree:");
		printLeaves(root);
	}

	/** * A class to represent a node in binary tree */
	public static class TreeNode {
		String value;
		TreeNode left;
		TreeNode right;

		TreeNode(String value) {
			this.value = value;
		}

		TreeNode(String data, TreeNode left, TreeNode right) {
			this.value = data;
			this.left = left;
			this.right = right;
		}

		boolean isLeaf() {
			return left == null ? right == null : false;
		}
	}

	/**
	 * Java method to print leaf nodes using recursion
	 */
	public static void printLeaves(TreeNode node) {
		// base case
		if (node == null) {
			return;
		}
		if (node.isLeaf()) {
			System.out.printf("%s ", node.value);
		}
		printLeaves(node.left);
		printLeaves(node.right);
	}
}
