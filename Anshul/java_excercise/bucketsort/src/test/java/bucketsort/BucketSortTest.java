package bucketsort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BucketSortTest {

	@Test
	public void bucketSorttest() {

		int array[] = { 4, 6, 2, 3, 1, 8 };
		int expArray[] = { 1, 2, 3, 4, 6, 8 };

		BucketSort.bucketSort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expArray, array);

	}
}
