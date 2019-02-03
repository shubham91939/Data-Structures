package singlyLinkedList;

public class IterativeSearch
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
	
	public void search(int a)
	{
		Node n=head;
		while(n!=null)
		{
			if(n.Data==a)
			{
				System.out.println("Yes");
			}
			n=n.next;
		}
	}
	
	public static void main(String[] args) 
	{
		IterativeSearch llist= new IterativeSearch();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
	
		llist.search(3);
	}

}
