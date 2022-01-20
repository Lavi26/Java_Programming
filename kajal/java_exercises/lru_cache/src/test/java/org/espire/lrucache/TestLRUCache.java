package org.espire.lrucache;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLRUCache {

	@Test
	public void testLRUCache()

	{
		LRUCache lrucache = new LRUCache(4);
		lrucache.set(1, 3);
		lrucache.set(2, 2);
		lrucache.set(3, 3);
		lrucache.set(4, 4);

		assertEquals(2, lrucache.get(2));
		assertEquals(3, lrucache.get(3));
		assertEquals(4, lrucache.get(4));
	}
}