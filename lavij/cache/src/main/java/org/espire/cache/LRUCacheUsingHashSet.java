package org.espire.cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * LRU implementation using Deque and HashSet
 * */
public class LRUCacheUsingHashSet {

    // store keys of cache
    private Deque<Integer> doublyQueue;

    // store references of key
    private HashSet<Integer> hashSet;

    // maximum capacity of cache
    private final int CACHE_SIZE;

    public LRUCacheUsingHashSet(Integer capacity) {
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    // Refer the page within the LRU cache
    public void refer(Integer page) {

        // If the page is not present in the LRU Cache
        if (!hashSet.contains(page)) {

            if (doublyQueue.size() == CACHE_SIZE) {

                // Finding and removing the last page
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        } else {
            // found page may not be always the last element, if it's an intermediate
            // element that needs to be removed and added to the start of the Queue
            doublyQueue.remove(page);
        }
        // Inserting that page in the front of Cache
        doublyQueue.push(page);

        // Updating the address in the hash set
        hashSet.add(page);
    }

    // display contents of cache
    public void display() {
        //Traversing
        Iterator<Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String args[]) {
        LRUCacheUsingHashSet cache = new LRUCacheUsingHashSet(4);

        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);

        cache.display();
    }
}
