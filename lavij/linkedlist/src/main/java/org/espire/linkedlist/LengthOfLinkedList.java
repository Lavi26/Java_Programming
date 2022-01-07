package org.espire.linkedlist;

/*
 * finding length of the linked list
 * */
public class LengthOfLinkedList {

    // head and tail of list
    private static Node head;
    private static Node tail;

    // initialization of node
    private static class Node {

        Integer data;

        // reference to next node
        Node next;

        // constructor to create a new node
        public Node(Integer d) {
            data = d;

            //last of the list
            next = null;
        }

    }

    //to display the list
    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("" + current.data);
            current = current.next;
        }
        System.out.println("null");

    }

    //add new node in the list
    public static void addNode(Integer data) {

        // create new node
        Node newNode = new Node(data);

        // check if list is empty
        if (head == null) {

            // if list is empty head and tail pointing new node
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

        Integer count = 0;

        //current pointing head
        Node current = head;

        if (head == null && current.next == null) {
            System.out.println("List is empty");
            return 0;
        }

        //until current not equal to null..., count increases and current pointing to the next
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;

    }


    public static void main(String args[]) {

        addNode(2);
        addNode(3);
        addNode(4);

        printList();

        System.out.println("Length of the list is equal to:" + LengthOfLinkedList.countNode());
    }

}
