package com.espire.binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeafNodeTest {

	@Test
	public void test() {
		LeafNode.TreeNode root = LeafNode.newNode(1);
		root.left = LeafNode.newNode(2);
		root.right = LeafNode.newNode(3);
		root.left.left = LeafNode.newNode(4);
		root.left.right = LeafNode.newNode(5);
		root.right.left = LeafNode.newNode(6);
		root.right.right = LeafNode.newNode(7);
		root.left.left.left = LeafNode.newNode(8);
		root.left.left.right = LeafNode.newNode(9);

		LeafNode.printLeaves(root);

	}

}
