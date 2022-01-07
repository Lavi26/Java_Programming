/**
 * 
 */
package org.espire.binaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class BinaryTreeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLeafNodesOfBinaryTree() {
		 Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        root.right.left.left = new Node(8);
	        root.right.right.right = new Node(9);
	 
	     //   printRootToLeafPaths(root);
	
	        System.out.println("Leaf Nodes of Binary Tree");
	}

}
