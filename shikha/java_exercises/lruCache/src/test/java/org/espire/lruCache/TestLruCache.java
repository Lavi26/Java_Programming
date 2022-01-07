package org.espire.lruCache;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLruCache {

	@Test
	public void testLruCache() {
		LRUCache cache = new LRUCache(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(1);
		cache.refer(4);
		cache.refer(5);
		cache.refer(2);
		cache.refer(2);
		cache.refer(1);
		cache.display();
	}
}
