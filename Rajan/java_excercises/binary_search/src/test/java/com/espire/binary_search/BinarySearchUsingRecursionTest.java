/**
 * 
 */
package com.espire.binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class BinarySearchUsingRecursionTest {

	@Test
	public void test() {
		Integer arr[] = { 9, 21, 38, 44, 56, 78, 97 };
		Integer output = 3;
		assertEquals(output, BinarySearchUsingRecursion.findRecursively(arr, 0, arr.length - 1, 44));

	}

}
