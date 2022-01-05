package org.espire.stringpermutations;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringPermutations {

	@Test

	public void printAllPermutations() {

		assertNotEquals(("AB"), StringPermutations.swapString("AB,BA", 0, 1));
		assertEquals(("A"), StringPermutations.swapString("A", 0, 0));

	}

}