package org.espire.linkedlist;


public class DoublyListToBinaryTree {
    
	//class for Binary Tree Node
	private static class BinaryTreeNode {
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;

		public BinaryTreeNode(int value) {	
			value = value;
			right=null;
			left=null;;
		}

		public static String printTree(BinaryTreeNode node) {
			if (node != null) {
				return node.value + "-(" + printTree(node.left) + "," + printTree(node.right) + ")";
			}
			return null;
		}

	}
    
	//class for doubly linked list node
	private static class DoublyListNode {
		int value;
		DoublyListNode previous;
	    DoublyListNode next;

		public DoublyListNode(int value) {
			value = value;
			previous=null;
			next=null;
		}

		public static void printList(DoublyListNode node) {
			while (node != null) {
				System.out.println("-" + node.value);
				node = node.next;
			}
		}
	}
    
	//sorted linked list to bst
	public static BinaryTreeNode listToBinary(DoublyListNode head) {
		//finding size of the list
		int count = 0;
		DoublyListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return construct(head, 0, count - 1);
	}

	//to find the middle element
	//first construct left sub tree by finding middle element 
	public static BinaryTreeNode construct(DoublyListNode head, int start, int end) {
		
		if (start > end) {
			return null;
		}

		// find middle index
		int mid = start + (end - start) / 2;

		// build left sub tree as bottom up approach
		BinaryTreeNode left = construct(head, start, mid - 1);
		
		//assign head value to the root node
		BinaryTreeNode root = new BinaryTreeNode(head.value);
		
		//assign previously generated left value to the root
		root.left = left;

		if (head.next != null) {
			head.value = head.next.value;
			
			//increment head pointer to point to the next node
			head.next = head.next.next;
		}
		//construct right subtree
		root.right = construct(head, mid + 1, end);
		return root;
	}

	public static void main(String args[]) {
		DoublyListNode node1= new DoublyListNode(1);
		
		DoublyListNode node2= new DoublyListNode(2);
		DoublyListNode node3= new DoublyListNode(3);
		DoublyListNode node4= new DoublyListNode(4);
		DoublyListNode node5= new DoublyListNode(5);
		System.out.println("node1:" +node1);
		node5.previous=node4; node4.next=node5;
		node4.previous=node3; node3.next=node4;
		node3.previous=node2; node2.next=node3;
		node2.previous=node1; node1.next=node2;
		
		DoublyListNode.printList(node1);
		
		System.out.println(BinaryTreeNode.printTree(listToBinary(node1)));
	}

}
