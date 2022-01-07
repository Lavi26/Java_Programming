/**
 * 
 */
package org.espire.bubbleSort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class BubbleSortTest {
	
	int[] array = { 24, 45, 12, 20, 36, 8 };
	int[] sortArray = { 8, 12, 20, 24, 36, 45 };

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
		BubbleSort.Sort(array);
		assertArrayEquals(sortArray, array);
		
		System.out.println("Bubble Sort Test Case is Success");
	}

}
