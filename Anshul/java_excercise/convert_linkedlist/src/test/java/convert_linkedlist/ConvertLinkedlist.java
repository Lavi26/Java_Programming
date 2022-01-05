package convert_linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import convert_linkedlist.DoublyLinkedlistToBinaryTree.BinaryTreeNode;
import convert_linkedlist.DoublyLinkedlistToBinaryTree.DoublyListNode;

public class ConvertLinkedlist {

	@Test
	public void binaryTreeTest() {

		DoublyLinkedlistToBinaryTree.DoublyListNode node1 = new DoublyLinkedlistToBinaryTree.DoublyListNode(1);
		DoublyLinkedlistToBinaryTree.DoublyListNode node2 = new DoublyLinkedlistToBinaryTree.DoublyListNode(2);
		DoublyLinkedlistToBinaryTree.DoublyListNode node3 = new DoublyLinkedlistToBinaryTree.DoublyListNode(3);
		DoublyLinkedlistToBinaryTree.DoublyListNode node4 = new DoublyLinkedlistToBinaryTree.DoublyListNode(4);
		DoublyLinkedlistToBinaryTree.DoublyListNode node5 = new DoublyLinkedlistToBinaryTree.DoublyListNode(5);
		DoublyLinkedlistToBinaryTree.DoublyListNode node6 = new DoublyLinkedlistToBinaryTree.DoublyListNode(6);
		DoublyLinkedlistToBinaryTree.DoublyListNode node7 = new DoublyLinkedlistToBinaryTree.DoublyListNode(7);
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

		DoublyLinkedlistToBinaryTree.DoublyListNode.printList(node1);

		System.out.println(DoublyLinkedlistToBinaryTree.BinaryTreeNode.print(DoublyLinkedlistToBinaryTree.listToBinary(node1)));
	}


}
