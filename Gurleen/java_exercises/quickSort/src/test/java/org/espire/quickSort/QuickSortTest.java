/**
 * 
 */
package org.espire.quickSort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class QuickSortTest {

	int[] array = {54, 23, 231, 43, 78};
	int[] sortArray = {23, 43, 54, 78, 231};
	
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
	public void testQuickSort() {
		QuickSort.quickSort(array, 0, array.length - 1);
		assertArrayEquals(sortArray, array);
		
		System.out.println("Quick Sort Test is Success");
	}

}
