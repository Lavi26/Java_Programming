package org.espire.reverseLinkedList;

import org.espire.reverseLinkedList.ReverseLinkedList.Node;

import org.junit.Test;

public class TestReverseLinkedList {

	@Test
	public void testReverseLinkedList() {
		ReverseLinkedList.head= new Node(40);
		ReverseLinkedList.head.next= new Node(50);
		ReverseLinkedList.head.next.next= new Node(60);
		
		
		Node reverse = ReverseLinkedList.reverseList(ReverseLinkedList.head);
		ReverseLinkedList.printList(reverse);
	}

}
