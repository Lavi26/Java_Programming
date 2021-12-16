/**
 * 
 */
package org.espire.removeduplicates;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class RemoveDuplicatesTest {

	/**
	 * Test method for {@link org.espire.removeduplicates.RemoveDuplicates#removeDuplicateFromArray(E[])}.
	 */
	@Test
	public void testRemoveDuplicateFromArray() {
		Integer[] array = {1,3,4,5,7,67,67};
		RemoveDuplicates.removeDuplicateFromArray(array);
//		int[] sorted= {1,3,4,5,7,67,67};
//		int[] sorted1= {1,3,4,5,7,67};
//        RemoveDuplicateIntArray.removeDuplicate(sorted);
//		//System.out.println(Arrays.toString(array));
//		
//		assertArrayEquals(sorted1,sorted);
		
		Integer[] expArray= {1,3,4,5,7,67};
		assertArrayEquals(expArray, array);
	}
}
