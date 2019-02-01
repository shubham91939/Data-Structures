package singlyLinkedList;

import singlyLinkedList.LinkedListTraversal.Node;

public class LinkedListDeletion 
{
	Node head;
	
	static class Node
	{
		int Data;
		Node next;
		Node(int d)
		{
			Data=d;
			next=null;
		}
	}
	
	public void printLinkedList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(" " + n.Data + "");
			n=n.next;
		}
	}
	
	public void Delete()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		LinkedListDeletion llist = new LinkedListDeletion();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		System.out.println("Linked List");
		llist.printLinkedList();
		System.out.println("Deleting Linked List");
		llist.Delete();
		System.out.println("Linked List Deleted");	
	}
}
