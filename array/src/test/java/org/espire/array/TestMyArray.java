package org.espire.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestMyArray {

    @Test
    public void test01() {
		Integer[] array = {1, 67, 3, 4, 5, 67, 7};
        MyArray.removeDuplicates(array);
		System.out.println(Arrays.toString(array));
    }

	@Test
	public void test02() {
		Integer[] array = {1, 67, 3, 4, 5, 67, 7, 96};
		Integer[] sorted = {1, 3, 4, 5, 7, 67, 96};
		MyArray.removeDuplicates(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(array, sorted);
	}
}
