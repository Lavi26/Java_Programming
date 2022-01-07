package org.espire.removeDuplicate;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveDuplicate {

	@Test
	public void removeDuplicateFromInt() {
		int[] arr = { 16, 69, 28, 37, 37, 5, 69, 16 };
		RemoveDuplicate.removeDuplicate(arr);
	}

}
