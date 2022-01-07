package com.espire.bubblesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortUsingRecursionTest {

	@Test
	public void test() {
		int arr[] = { 6, 14, 8, 7, 9, 13 };
		int expArray[] = { 6, 7, 8, 9, 13, 14 };

		BubbleSortUsingRecursion.sortUsingRecursuion(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(expArray, arr);

	}

}
