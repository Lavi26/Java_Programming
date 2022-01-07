package org.espire.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestRemoveDuplicateInArray {

    @Test
    public void test01() {
		Integer[] array = {1, 67, 3, 4, 5, 67, 7};
		Integer[] sorted= {1,3,4,5,7,67};

		RemoveDuplicateInArray.quickSort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(RemoveDuplicateInArray.removeDuplicates(array)));
		
		assertArrayEquals(sorted,RemoveDuplicateInArray.removeDuplicates(array));
    }

	@Test
	public void test02() {
		Integer[] array = {7,7,7,1,1,1,2,2,2,4,4,4,0,0,0};
		Integer[] sorted = {0,1,2,4,7};

		RemoveDuplicateInArray.quickSort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(RemoveDuplicateInArray.removeDuplicates(array)));
		assertArrayEquals(sorted,RemoveDuplicateInArray.removeDuplicates(array));
	}
}
