package find_length_Linkedlist;

//Java program to find length of linked list

// Linked list Node
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

//Linked List class
public class FindLengthOfLinkedlist {
	static Node head; // head of list

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		// Allocate the Node & Put in the data
		Node new_node = new Node(new_data);

		// Make next of new Node as head
		new_node.next = head;

		// Move the head to point to new Node
		head = new_node;
	}

	// Returns count of nodes in linked list
	public static int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// create empty list
		FindLengthOfLinkedlist list = new FindLengthOfLinkedlist();
		list.push(1);
		list.push(3);
		list.push(1);
		list.push(2);
		list.push(1);

		System.out.println("Length of the linked list is " + FindLengthOfLinkedlist.getCount());
	}
}
