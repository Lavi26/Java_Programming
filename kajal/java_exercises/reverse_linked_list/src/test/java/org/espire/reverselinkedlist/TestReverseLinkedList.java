package org.espire.reverselinkedlist;

import org.espire.reverselinkedlist.ReverseLinkedList.Node;
import org.junit.Test;

public class TestReverseLinkedList {

	@Test
	public void testReverseLinkedList() {
		ReverseLinkedList.head = new Node(85);
		ReverseLinkedList.head.next = new Node(15);
		ReverseLinkedList.head.next.next = new Node(4);
		ReverseLinkedList.head.next.next.next = new Node(20);

	}
}