package singlyLinkedList;

public class LinkedListTraversal 
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
	
	public static void main(String[] args) 
	{
		LinkedListTraversal llist = new LinkedListTraversal();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		llist.printLinkedList();
	}

}
