/**
 * 
 */
package org.espire.reverseLinkedList;

/**
 * @author gurleen.kaur
 *
 */

public class ReverseLinkedList {

//	public Node head;
//
//	public static class Node {
//
//		Node next;
//
//		Object data;
//
//		Node(Object data) {
//			this.data = data;
//			next = null;
//		}
//	}
//	
//	public static void main(String[] args) {
//		ReverseLinkedList myLinkedList = new ReverseLinkedList();
//		myLinkedList.head = new Node(1);
//		myLinkedList.head.next = new Node(2);
//		myLinkedList.head.next.next = new Node(3);
//
//		printLinkedList(myLinkedList);
//		reverseLinkedList(myLinkedList);
//		printLinkedList(myLinkedList);
//
//	}
//
//	public static void printLinkedList(ReverseLinkedList linkedList) {
//		Node h = linkedList.head;
//		while (linkedList.head != null) {
//			System.out.print(linkedList.head.data + " ");
//			linkedList.head = linkedList.head.next;
//		}
//		System.out.println();
//		linkedList.head = h;
//	}
//
//	public static void reverseLinkedList(ReverseLinkedList linkedList) {
//		Node previous = null;
//		Node current = linkedList.head;
//		Node next;
//		while (current != null) {
//			next = current.next;
//			current.next = previous;
//			previous = current;
//			current = next;
//		}
//		linkedList.head = previous;
//	}
	
	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to reverse the linked list */
    Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
    	ReverseLinkedList list = new ReverseLinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list: "); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list: "); 
        list.printList(head); 
    } 


}
