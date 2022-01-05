package remove_duplicate;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void testRemoveDuplicateFromArrayInteger() {

		int[] arr = { 1, 1, 2, 3,3, 5, 9, 6 };
		RemoveDuplicateFromArray.removeduplicates(arr,8);
		
	}
}
