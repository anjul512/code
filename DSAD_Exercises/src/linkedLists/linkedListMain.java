package linkedLists;

import linkedLists.LinkedList;
import linkedLists.LinkedList.Node;

public class linkedListMain {
	public static void main(String args[]) {
		//Start with empty linked list 
				LinkedList llist = new LinkedList();
				llist.head = new Node(1);
				Node second = new Node(2);
				Node third = new Node(3);
				
				// Link first node with the second node 
				llist.head.next=second;
				// Link second node with the third node 
				second.next=third;
				System.out.println("Before adding new node list is:");
				llist.printList();
				System.out.println("After adding new node at the front");
				llist.push(5);
				llist.printList();
				System.out.println("Inserting a new node after a given node");
				llist.addAfter(second, 6);
				llist.printList();
				System.out.println("Inserting a node at the end of list");
				llist.addAtEnd(llist.head, 7);
				llist.printList();
	}
}