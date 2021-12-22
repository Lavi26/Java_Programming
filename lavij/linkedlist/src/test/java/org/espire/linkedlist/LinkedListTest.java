package org.espire.linkedlist;

import static org.junit.Assert.*;

import org.espire.linkedlist.ReverseLinkedList.Node;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void lengthTest() {
		
		LengthOfLinkedList.addNode(2);
		LengthOfLinkedList.addNode(3);
		
		assertEquals(2,LengthOfLinkedList.countNode());
	}
	

	@Test
	public void reverseTest() {
		
		ReverseLinkedList.head= new Node(10);
		ReverseLinkedList.head.next= new Node(20);
		ReverseLinkedList.head.next.next= new Node(30);
		
		
		Node reverse = ReverseLinkedList.reverseList(ReverseLinkedList.head);
		ReverseLinkedList.printList(reverse);
		
	}

}
