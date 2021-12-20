package org.espire.linkedlistlength;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestlinkedListLength {

	@Test
	public void testNewLinkedList() {
		LinkedListLength singly = new LinkedListLength();
		assertNotNull(singly.getCount());
		assertEquals(0, singly.getCount());

	}
}
