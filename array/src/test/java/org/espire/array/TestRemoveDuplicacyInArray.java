package org.espire.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestRemoveDuplicacyInArray {

    @Test
    public void test01() {
		int[] array = {1, 67, 3, 4, 5, 67, 7};
		int[] sorted= {1,3,4,5,7,63};
        RemoveDuplicacyInArray.removeDuplicates(array);
		System.out.println(Arrays.toString(array));
		
		assertArrayEquals(sorted,array);
    }

	@Test
	public void test02() {
		int[] array = {1, 67, 3, 4, 5, 67, 7, 96};
		int[] sorted = {1, 3, 4, 5, 7, 67, 96};
		RemoveDuplicacyInArray.removeDuplicates(array);
		
		System.out.println(Arrays.toString(array));
		assertArrayEquals(sorted,array);
	}
}
