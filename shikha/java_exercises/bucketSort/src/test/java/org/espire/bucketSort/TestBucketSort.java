package org.espire.bucketSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestBucketSort {

	@Test
	public void testBucketSort() {
		int array[] = {42, 32, 33, 52, 37, 47, 51};
		int expectedArray[]= {32, 33, 37, 42, 47, 51, 52};
		
		BucketSort.bucketSorting(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expectedArray,array);
	}

}
