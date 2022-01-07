/**
 * 
 */
package org.espire.linkedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class LinkedListTest {

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
    public void lengthTest() {
		
		LinkedList.addNode(2);
		LinkedList.addNode(3);
		
		assertEquals(2,LinkedList.countNode());
		System.out.println("Length of Linked List Test Case");
	}

}
