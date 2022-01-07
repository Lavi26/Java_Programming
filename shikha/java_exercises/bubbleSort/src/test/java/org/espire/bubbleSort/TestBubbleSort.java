package org.espire.bubbleSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void test() {
		Integer array[] = {64, 34, 25, 12, 22, 11, 90};
		Integer expectedArray[]= {11, 12, 22, 25, 34, 64, 90};
		
		BubbleSort.bubbleSorting(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expectedArray,array);
	}

}
