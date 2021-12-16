package org.espire.binarytree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
		
	  LeafNode.TreeNode root = LeafNode.newNode(1);
	    root.left = LeafNode.newNode(2);
	    root.right = LeafNode.newNode(3);
	    root.left.left = LeafNode.newNode(4);
	    root.right.left = LeafNode.newNode(5);
	    root.right.right = LeafNode.newNode(6);

	    LeafNode.printLeaves(root);
	
	   
	}

}
