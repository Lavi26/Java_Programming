package org.espire.linkedlist;

import org.espire.linkedlist.ReverseLinkedList.Node;
import org.junit.Test;

import static org.espire.linkedlist.DoublyListToBinaryTree.listToBinary;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {

	@Test
	public void lengthTest() {
		
		LengthOfLinkedList.addNode(2);
		LengthOfLinkedList.addNode(3);
		
		assertEquals(2,LengthOfLinkedList.countNode());
	}
	

	@Test
	public void reverseTest() {
		
		ReverseLinkedList.head= new Node(10);
		ReverseLinkedList.head.next= new Node(20);
		ReverseLinkedList.head.next.next= new Node(30);
		
		
		Node reverse = ReverseLinkedList.reverseList(ReverseLinkedList.head);
		ReverseLinkedList.printList(reverse);
		
	}

	@Test
	public void binaryTreeTest() {

		DoublyListToBinaryTree.DoublyListNode node1 = new DoublyListToBinaryTree.DoublyListNode(1);
		DoublyListToBinaryTree.DoublyListNode node2 = new DoublyListToBinaryTree.DoublyListNode(2);
		DoublyListToBinaryTree.DoublyListNode node3 = new DoublyListToBinaryTree.DoublyListNode(3);
		DoublyListToBinaryTree.DoublyListNode node4 = new DoublyListToBinaryTree.DoublyListNode(4);
		DoublyListToBinaryTree.DoublyListNode node5 = new DoublyListToBinaryTree.DoublyListNode(5);
		DoublyListToBinaryTree.DoublyListNode node6 = new DoublyListToBinaryTree.DoublyListNode(6);
		DoublyListToBinaryTree.DoublyListNode node7 = new DoublyListToBinaryTree.DoublyListNode(7);
		node7.previous = node6;
		node6.next = node7;
		node6.previous = node5;
		node5.next = node6;
		node5.previous = node4;
		node4.next = node5;
		node4.previous = node3;
		node3.next = node4;
		node3.previous = node2;
		node2.next = node3;
		node2.previous = node1;
		node1.next = node2;

		DoublyListToBinaryTree.DoublyListNode.printList(node1);

		System.out.println(DoublyListToBinaryTree.BinaryTreeNode.print(listToBinary(node1)));
	}

}
