/**
 * 
 */
package org.espire.mergeSort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class MergeSortTest {
	
	int[] array = { 234, 43, 23, 213, 56 };
	int[] sortArray = { 23, 43, 56, 213, 234 };

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
	public void testMergeSort() {
		MergeSort.mergeSort(array, 0, array.length - 1);
		assertArrayEquals(sortArray, array);
		
		System.out.println("Merge Sort Test is Success");
	}

}
