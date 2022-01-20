/**
 * 
 */
package org.espire.array;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class RemoveDuplicateFromArrayTest {

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
	//	assertEquals((0),RemoveDuplicateElementFromArray.removeDuplicateElementsFromArray(null, 0));
		int arr[] = { 1, 1, 2, 3, 3, 5, 9, 6, 6 };
		int n = arr.length;
		RemoveDuplicateElementFromArray.removeDuplicateElementsFromArray(arr, n);
	    System.out.println("Remove Duplicate Elements From Array");
	}

}
