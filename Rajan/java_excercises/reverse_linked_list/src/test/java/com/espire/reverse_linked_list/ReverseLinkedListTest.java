/**
 * 
 */
package com.espire.reverse_linked_list;

import com.espire.reverse_linked_list.ReverseLinkedList.Node;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class ReverseLinkedListTest {

	@Test
	public void test() {
		ReverseLinkedList.head= new Node(5);
		ReverseLinkedList.head.next= new Node(8);
		ReverseLinkedList.head.next.next= new Node(12);
		
		
		Node reverse = ReverseLinkedList.reverseList(ReverseLinkedList.head);
		ReverseLinkedList.printList(reverse);
		
	}
	}


