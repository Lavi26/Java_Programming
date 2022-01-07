/**
 * 
 */
package org.espire.reverseLinkedList;

import static org.junit.Assert.*;

import org.espire.reverseLinkedList.ReverseLinkedList.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class ReverseLinkedListTest {
	
	static Node head;

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
	public void testReverseLinkedList() {
		ReverseLinkedList list = new ReverseLinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15);
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
        
        System.out.println("Reverse Linked List is Success");
	}

}
