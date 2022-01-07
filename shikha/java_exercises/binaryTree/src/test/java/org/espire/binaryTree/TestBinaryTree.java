package org.espire.binaryTree;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void test() {
		 BinaryTree.TreeNode root = BinaryTree.newNode(1);
		    root.left = BinaryTree.newNode(2);
		    root.right = BinaryTree.newNode(3);
		    root.left.left = BinaryTree.newNode(4);
		    root.right.left = BinaryTree.newNode(5);
		    root.right.right = BinaryTree.newNode(6);

			BinaryTree.printLeaves(root);
	}

}
