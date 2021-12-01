package org.espire.linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {

	// head and tail of list
	public static Node head;
	public static Node tail;

	// initialization
	static class Node {

		int data;

		// reference to next node
		Node next;

		// constructor to create a new node
		public Node(int d) {
			data = d;

			// last of the list
			next = null;
		}

	}

	// add new node in the list
	public static void addNode(int data) {

		// create new node
		Node newNode = new Node(data);

		// check if list is empty
		if (head == null) {

			// if list is empty head n tail pointing new node
			head = newNode;
			tail = newNode;

		} else {

			// new node added next to the tail
			tail.next = newNode;

			// tail pointing to new node
			tail = newNode;
		}
	}

	public static void reverseList(Node current) {
		
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			
		reverseList(current.next);
		
		System.out.println(""+ current.data);
		}
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many element you want to add:");
		int num = scanner.nextInt();

		System.out.println("Add element:");

		for (int i = 0; i < num; i++) {

			int data = scanner.nextInt();
			addNode(data);

		}
		
	    reverseList(head);

		System.out.println("Reverse of the LinkedList is:" );
	}
}
