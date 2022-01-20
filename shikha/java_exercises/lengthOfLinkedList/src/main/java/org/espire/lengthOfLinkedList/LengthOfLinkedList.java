package org.espire.lengthOfLinkedList;

public class LengthOfLinkedList {

	private static ListNode head;

	private static class ListNode {
		private Integer data;
		private ListNode next;

		public ListNode(Integer data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to print the created linked list
	public static void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.print("null");

	}

	// Method to find the length of LinkedList
	public static Integer linkedListLength() {
		Integer count = 0;
		if (head == null) {
			return count;
		}
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;

	}

	// Main method
	public static void main(String[] args) {
		LengthOfLinkedList linkedList = new LengthOfLinkedList();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(9);
		ListNode fourth = new ListNode(15);

		// Now we will connect them together to form a chain
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		// calling method
		display();
		System.out.println("\n Length linked list: " + linkedListLength());

	}
}
