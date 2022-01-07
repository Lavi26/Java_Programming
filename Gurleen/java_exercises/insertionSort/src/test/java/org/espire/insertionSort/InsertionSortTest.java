/**
 * 
 */
package org.espire.insertionSort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class InsertionSortTest {
	
	int[] array = {30,6,20,4,50};
	int[] sortArray = {4,6,20,30,50};

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
		InsertionSort.sort(array);
		assertArrayEquals(sortArray, array);
		
		System.out.println("Insertion Sort Test is Success");
	}

}
