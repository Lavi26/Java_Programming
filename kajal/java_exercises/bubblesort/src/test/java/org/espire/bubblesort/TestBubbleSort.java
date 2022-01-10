package org.espire.bubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void testBubbleSort() {
		int[] myarray = { 6, 5, 3, 2 };
		int[] expected = { 2, 3, 5, 6 };
		BubbleSort.bubbleAscending(myarray);
		assertArrayEquals(expected, myarray);

	}

}
