//Deletion of a Linked list Node at a given position

package singlyLinkedList;

import singlyLinkedList.NodeDeletion.Node;

public class Deletion 
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
	
	public void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.Data);
			n=n.next;
		}
	}
	
	public void Delete(int position)
	{
		Node n=head;
		if(position==0)
		{
			head=n.next;
		}
		while(position>1)
		{
			n=n.next;
			position--;
		}
		n.next=n.next.next;
	}
	
	public static void main(String[] args) 
	{
		Deletion llist = new Deletion();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
	
		System.out.println("Original Linked List :-");
		llist.print();
		llist.Delete(4);
		System.out.println("Linked List After Deletion");
		llist.print();
	}

}
