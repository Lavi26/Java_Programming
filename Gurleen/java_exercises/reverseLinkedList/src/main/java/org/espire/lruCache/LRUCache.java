/**
 * 
 */
package org.espire.lruCache;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author gurleen.kaur
 *
 */

//public class LRUCache {
//
//	private Node<K, V> lru;
//	private Node<K, V> mru;
//	private Map<K, Node<K, V>> container;
//	private int capacity;
//	private int currentSize;
//
//	public LRUCache(int capacity) {
//		this.capacity = capacity;
//		this.currentSize = 0;
//		lru = new Node<K, V>(null, null, null, null);
//		mru = lru;
//		container = new HashMap<K, Node<K, V>>();
//	}
//
//	public V get(K key) {
//		Node<K, V> tempNode = container.get(key);
//		if (tempNode == null) {
//			return null;
//		}
//		// If MRU leave the list as it is
//		else if (tempNode.key == mru.key) {
//			return mru.value;
//		}
//
//		// Get the next and prev nodes
//		Node<K, V> nextNode = tempNode.next;
//		Node<K, V> prevNode = tempNode.prev;
//
//		// If at the left-most, we update LRU
//		if (tempNode.key == lru.key) {
//			nextNode.prev = null;
//			lru = nextNode;
//		}
//
//		// If we are in the middle, we need to update the items before and after our
//		// item
//		else if (tempNode.key != mru.key) {
//			prevNode.next = nextNode;
//			nextNode.prev = prevNode;
//		}
//
//		// Finally move our item to the MRU
//		tempNode.prev = mru;
//		mru.next = tempNode;
//		mru = tempNode;
//		mru.next = null;
//
//		return tempNode.value;
//
//	}
//
//	public void put(K key, V value) {
//		if (container.containsKey(key)) {
//			return;
//		}
//
//		// Put the new node at the right-most end of the linked-list
//		Node<K, V> myNode = new Node<K, V>(mru, null, key, value);
//		mru.next = myNode;
//		container.put(key, myNode);
//		mru = myNode;
//
//		// Delete the left-most entry and update the LRU pointer
//		if (currentSize == capacity) {
//			container.remove(lru.key);
//			lru = lru.next;
//			lru.prev = null;
//		}
//
//		// Update container size, for the first added entry update the LRU pointer
//		else if (currentSize < capacity) {
//			if (currentSize == 0) {
//				lru = myNode;
//			}
//			currentSize++;
//		}
//	}
//
//	// Node for doubly linked list
//	class Node<T, U> {
//		T key;
//		U value;
//		Node<T, U> prev;
//		Node<T, U> next;
//
//		public Node(Node<T, U> prev, Node<T, U> next, T key, U value) {
//			this.prev = prev;
//			this.next = next;
//			this.key = key;
//			this.value = value;
//		}
//	}
//
//}

////store keys of cache
//private Deque<Integer> doublyQueue;
//
//// store references of key in cache
//private HashSet<Integer> hashSet;
//
//// maximum capacity of cache
//private final int CACHE_SIZE;
//
//LRUCache(int capacity) {
//    doublyQueue = new LinkedList<>();
//    hashSet = new HashSet<>();
//    CACHE_SIZE = capacity;
//}
//
//public void refer(int page) {
//    if (!hashSet.contains(page)) {
//        if (doublyQueue.size() == CACHE_SIZE) {
//            int last = doublyQueue.removeLast();
//            hashSet.remove(last);
//        }
//    }
//    else {
//        doublyQueue.remove(page);
//    }
//    doublyQueue.push(page);
//    hashSet.add(page);
//}
//
//// display contents of cache
//public void display() {
//    Iterator<Integer> itr = doublyQueue.iterator();
//    while (itr.hasNext()) {
//        System.out.print(itr.next() + " ");
//    }
//}
//
//public static void main(String[] args) {
//    LRUCache cache = new LRUCache(4);
//    cache.refer(1);
//    cache.refer(2);
//    cache.refer(3);
//    cache.refer(1);
//    cache.refer(4);
//    cache.refer(5);
//    cache.refer(2);
//    cache.refer(2);
//    cache.refer(1);
//    cache.display();
//  }
	
	class Node{
	    int key;
	    int value;
	    Node prev;
	    Node next;
	 
	    public Node(int key, int value){
	        this.key = key;
	        this.value = value;
	    }
	}
	public class LRUCache {
	    int capacity;
	    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	    Node head=null;
	    Node end=null;
	 
	    public LRUCache(int capacity) {
	        this.capacity = capacity;
	    }
	 
	    public int get(int key) {
	        if(map.containsKey(key)){
	            Node n = map.get(key);
	            delete(n);
	            setHead(n);
	            return n.value;
	        }
	 
	        return -1;
	    }
	 
	    /*This method will delete node*/
	    public void delete(Node node){
	        if(node.prev!=null){
	            node.prev.next = node.next;
	        }else{
	            head = node.next;
	        }
	 
	        if(node.next!=null){
	            node.next.prev = node.prev;
	        }else{
	            end = node.prev;
	        }
	 
	    }
	 
	    /*This method will make passed node as head*/
	    public void setHead(Node node){
	        node.next = head;
	        node.prev = null;
	 
	        if(head!=null)
	            head.prev = node;
	 
	        head = node;
	 
	        if(end ==null)
	            end = head;
	    }
	 
	    public void set(int key, int value) {
	        if(map.containsKey(key)){
	            // update the old value
	            Node old = map.get(key);
	            old.value = value;
	            delete(old);
	            setHead(old);
	        }else{
	            Node newNode = new Node(key, value);
	            if(map.size()>=capacity){
	 
	                map.remove(end.key);
	                // remove last node
	                delete(end);
	                setHead(newNode);
	 
	            }else{
	                setHead(newNode);
	            }    
	 
	            map.put(key, newNode);
	        }
	    }   
	 
	    public static void main(String[] args) throws java.lang.Exception {
	        LRUCache lrucache = new LRUCache(4);
	        lrucache.set(1, 100);
	        lrucache.set(10, 99);
	        lrucache.set(15, 98);
	        lrucache.set(10, 97);
	        lrucache.set(12, 96);
	        lrucache.set(18, 95);
	        lrucache.set(1, 94);
	 
	        System.out.println(lrucache.get(1));
	        System.out.println(lrucache.get(10));
	        System.out.println(lrucache.get(15));
	 
	    }
	}	
//}

