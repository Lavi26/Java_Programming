package org.espire.reverselinkedlist;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.espire.reverselinkedlist.ReverseLinkedList.Node;
import org.junit.Before;
import org.junit.Test;

public class TestReverseLinkedList {
	
	
		@Test
		void testReversion() {
		    ReverseLinkedList list = new ReverseLinkedList(); 
		    list.head = new Node(85); 
		    list.head.next = new Node(15); 
		    list.head.next.next = new Node(4); 
		    list.head.next.next.next = new Node(20); 
		    
		    
		} }