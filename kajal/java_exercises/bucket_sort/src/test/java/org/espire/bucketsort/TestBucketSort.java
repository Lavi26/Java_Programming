package org.espire.bucketsort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestBucketSort {

	@Test
	public void test() {
		  int[] expected = new int[] {1 ,3, 5, 6, 7, 8, 9, 12, 14, 89  };
	        int[] array = new int[] { 12, 3, 8, 9, 1, 14, 6, 7, 5, 89 };
	        BucketSort.bucketSort(89);
	        assertNotNull(Arrays.equals(array, expected));
	   
	}
}
