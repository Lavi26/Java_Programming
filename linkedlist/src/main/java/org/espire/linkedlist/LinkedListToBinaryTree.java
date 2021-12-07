package org.espire.linkedlist;

public class LinkedListToBinaryTree {
	private static ListNode current;

	private static class ListNode {
		int data;

		// reference to next node
		ListNode next;
		ListNode prev;

		// constructor to create a new node
		public ListNode(int d) {
			data = d;

			// last of the list
			next = null;
			prev=null;
		}
	}
	
	public static ListNode listToBT(ListNode head) {
		if(head==null) {
		return head;
		}
		
		current=head;
		int size= getSize(head);
		return buildTree(size);
	}
	
	private static int getSize(ListNode head) {
		int size=0;
		
		while(head!=null) {
			size++;
			head=head.next;
		}
		return size ;
	}
	
	private static ListNode buildTree(int size) {
		
		if(size<=0) {
			return null;
		}
		ListNode left = buildTree(size/2);
		ListNode root = current;
		current=current.next;
		
		ListNode right=buildTree(size-1- size/2);
		root.prev=left;
		root.next=right;
		return root;
	}
	
	public ListNode getTail(ListNode head) {
		if(head==null||head.next==null) {
			return null;
		}
		ListNode slow=head;
		ListNode fast=head.next;
		
		while(fast!=slow) {
			if(fast==null || fast.next==null) {
				return null;
			}
			
			fast=fast.next.next;
			slow=slow.next;
		}
		while(head!=slow.next) {
			head=head.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public static void main(String args[]) {
		LinkedListToBinaryTree.current= new ListNode(1);
		LinkedListToBinaryTree.current.next= new ListNode(2);
		LinkedListToBinaryTree.current.next.next= new ListNode(3);
		LinkedListToBinaryTree.current.next.next.next= new ListNode(4);
		
		LinkedListToBinaryTree.listToBT(current);
		System.out.println("" + listToBT(current));
	}

}
