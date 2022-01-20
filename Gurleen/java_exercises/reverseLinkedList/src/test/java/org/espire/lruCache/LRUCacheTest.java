package org.espire.lruCache;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLruCache() {
		LRUCache lrucache = new LRUCache(4);
        lrucache.set(1, 100);
        lrucache.set(10, 99);
        lrucache.set(15, 98);
        lrucache.set(10, 97);
        lrucache.set(12, 96);
        lrucache.set(18, 95);
        lrucache.set(1, 94);
 
//        System.out.println(lrucache.get(1));
//        System.out.println(lrucache.get(10));
//        System.out.println(lrucache.get(15));
        System.out.println("LRU Cache Test Case is Success");
 
	}

}
