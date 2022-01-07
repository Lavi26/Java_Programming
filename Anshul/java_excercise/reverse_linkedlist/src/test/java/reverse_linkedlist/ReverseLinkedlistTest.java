package reverse_linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import reverse_linkedlist.Reverse.Node;

public class ReverseLinkedlistTest {

	@Test
	public void testReverseSinglyLinkedList() {
		Reverse linkedList = new Reverse();
		linkedList.head = new Node(10);
		linkedList.head.next = new Node(8);
		linkedList.head.next.next = new Node(48);
		linkedList.head.next.next.next = new Node(63);
		// calling method
		System.out.println("Singly linked list before reverse");
		linkedList.display(linkedList.head);
		// Calling reverse method
		Node reverseListHead = linkedList.reverse(linkedList.head);
		System.out.println("\nSingly linked list after reverse");
		linkedList.display(reverseListHead);

	}
}
