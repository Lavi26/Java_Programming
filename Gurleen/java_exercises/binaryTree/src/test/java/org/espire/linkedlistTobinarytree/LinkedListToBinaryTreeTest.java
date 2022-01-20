/**
 * 
 */
package org.espire.linkedlistTobinarytree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class LinkedListToBinaryTreeTest {

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
	public void test() {
		LinkedListToBinaryTree bt = new LinkedListToBinaryTree();  
	      
	      bt.insertNode(1);  
	        
	      bt.insertNode(2);  
	      bt.insertNode(3);  
	        
	      bt.insertNode(4);  
	      bt.insertNode(5); 
	        
	      bt.insertNode(6);  
	      bt.insertNode(7);
	      bt.inorderTraversal(bt.root); 
	      
	      System.out.println("\n Linked List to Binary Tree Test Case is Success");
	}

}
