package org.espire.linkedlistlength;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

// Linked List class
class LinkedListLength {
	Node head; // head of list

	// Inserts a new Node at front of the list.
	public void push(int new_data) {
		// Allocate the Node and Put in the data
		Node new_node = new Node(new_data);

		// Make next of new Node as head
		new_node.next = head;

		// Move the head to point to new Node
		head = new_node;
	}

	// Returns count of nodes in linked list
	public int getCountRec(Node node) {
		// Base case
		if (node == null)
			return 0;

		// Count is this node plus rest of the list
		return 1 + getCountRec(node.next);
	}

	// Wrapper over getCountRec()
	public int getCount() {
		return getCountRec(head);
	}

	/*
	 * Driver program to test above functions. Ideally this function should be in a
	 * separate user class. It is kept here to keep code compact
	 */
	public static void main(String[] args) {
		// Start with the empty list
		LinkedListLength list = new LinkedListLength();
		list.push(1);
		list.push(3);
		list.push(1);
		list.push(2);
		list.push(1);

		System.out.println("Count of nodes is " + list.getCount());
	}
}
