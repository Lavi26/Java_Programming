package reverse_linkedlist;

public class Reverse {
	
	// We have created data and reference part of singly linked list
	public static Node head;

	public static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to print the created linked list
	public static void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-");
			current = current.next;
		}
		System.out.print("");

	}

	// Method to reverse the linked list
	public static Node reverse(Node head) {
		Node current=head;
		Node previous=null;
		Node next=null;
	    while(current!=null) {
	    	next=current.next;
	    	current.next=previous;
	    	previous=current;
	    	current=next;
	    }
	    return previous;
	}

	public static void main(String[] args) {
		Reverse linkedList = new Reverse();
		linkedList.head = new Node(19);
		Node second = new Node(20);
		Node third = new Node(9);
		Node fourth = new Node(21);

		// Now we will connect them together to form a chain
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		// calling method
		System.out.println("Singly linked list before reverse");
		display(head);
		//Calling reverse method
		Node reverseListHead=linkedList.reverse(head);
		System.out.println("\nSingly linked list after reverse");
		display(reverseListHead);

	}

}