/**
 * 
 */
package com.espire.removeduplicate;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sahil.jamwal
 *
 */
public class RemoveDuplicateTest {

	@Test
	public void test() {
		int[] array = { 1, 67, 3, 4, 5, 67, 7 };
		RemoveDuplicate.removeDuplicateUsingSorting(array);
		System.out.println(array);

	}

}
