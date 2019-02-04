package singlyLinkedList;

public class RecursiveSearch 
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
	
	public void search(Node head,int a)
	{
		if(head==null)
			System.out.println("No");
		else if(head.Data==a)
			System.out.println(head.Data + " Yes");
		else 
			search(head.next,a);	
	}
	
	public static void main(String[] args) 
	{
		RecursiveSearch llist = new RecursiveSearch();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
	
		llist.search(llist.head,3);
		
	}

}
