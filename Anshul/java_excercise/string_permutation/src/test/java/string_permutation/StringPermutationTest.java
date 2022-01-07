package string_permutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPermutationTest {
	@Test
	public void testFindPermutation1() {
		StringPermutation.generatePermutation("ABCD", 0, 3);
	}

	@Test
	public void testFindPermutation2() {
		StringPermutation.generatePermutation("ABC", 0, 2);
	}
}
