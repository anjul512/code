/*  A simple Java program to introduce a linked list 
	Let us create a simple linked list with 3 nodes.
*/

package linkedLists;

import linkedLists.LinkedList.Node;

public class LinkedList {
   Node head ; // head of the list
	
	/* 	Linked list Node.  
	 	This inner class is made static so that main() can access it 
    	*/
	
	static class Node {
		int data;
		Node next ;
		
		//Constructor to create a new node 
		//By default next initialized as null
		Node(int d){
			data=d;
			next =null;
		}
	}
	
	//function to print linked list 
	public void printList() {
		Node n = head ;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	// function to add a node at the start 
	public   void push(int new_data) {
		//1. allocate a node and put data 
		Node newNode=allocateNode(new_data);
		
		//2. Make next of new node as head 
		newNode.next = head;
		
		//3. Point head to new node 
		head =newNode;
		
	}

	//function to add a node after a given node 
	public void addAfter(Node curNode,int new_data) {
		
		// check if the Node passed is null 
		if(curNode==null) {
			System.out.println("The current Node is null");
			return;
		}
		//1. allocate a new node and put data 
		Node newNode=allocateNode(new_data);
		
		//2. Put the new Node next to current Node Next
		newNode.next=curNode.next;
		
		//3. Point the current Node next to new Node
		curNode.next=newNode;
	}
	
	public Node allocateNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}
	
	//function to add a node at the end of the list 
	public void addAtEnd(Node head,int new_data) {
		//When we add at the end we need to traverse the list to get the end 
		//1. Get the end node 
		Node endNode = head;
		while(endNode.next !=null) {
			 endNode = endNode.next;
		}
		//2. allocate a new node and put data 
		Node newNode=allocateNode(new_data);
		
		//3. Point end Node next to New node and New node next to null
		endNode.next=newNode;
		newNode.next=null;
		
	}
	
}