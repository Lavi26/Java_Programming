/**
 * 
 */
package org.espire.binarySearch;

import static org.junit.Assert.assertEquals;

import java.sql.Array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class BinarySearchTest {
	
	private BinarySearch bs;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bs = new BinarySearch();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBinarySearch() {
		BinarySearch bsh = new BinarySearch();
		System.out.println("Binary Search Test Case is Success");
	}

}
