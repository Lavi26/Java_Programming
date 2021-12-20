/**
 * 
 */
package com.espire.remove_duplicates;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class RemoveDuplicatesFromArrayTest {

	@Test
	public void test() {
		int[] array = { 1, 67, 3, 4, 5, 67, 7 };
		RemoveDuplicatesFromArray.removeDuplicateUsingSorting(array);
		System.out.println(array);

	}

}
