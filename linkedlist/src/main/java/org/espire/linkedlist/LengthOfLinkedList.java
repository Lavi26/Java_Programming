package org.espire.linkedlist;

import java.util.Scanner;

/*
 * finding length of the linked list
 * */
public class LengthOfLinkedList {

	// head and tail of list
	public static Node head;
	public static Node tail;

	// initialization of node
	static class Node {
		
		int data;
		
		// reference to next node
		Node next;

		// constructor to create a new node
		public Node(int d) {
			data = d;
			
			//last of the list
			next = null;
		}

	}
    	
	//add new node in the list
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
	
	//count the node
	public static int countNode() {
		
		int count=0;
		
		//current pointing head
		Node current = head;
		
		//until current not equal to null..., count increases and current pointing to the next
		while(current!=null) {
			count++;
			current= current.next;
		}
		
		return count;
		
	}
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in)
				;
		System.out.println("How many element you want to add:");
		int num = scanner.nextInt();
		
		System.out.println("Add element:");
		for(int i=0; i<num;i++) {
			
			int data= scanner.nextInt();
			addNode(data);
			
		}
		
		//list.countNode();
		System.out.println("Length of the list is equal to:"+ countNode() );
	}

}
