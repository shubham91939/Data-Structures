package singlyLinkedList;

public class NodeDeletion 
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
	
	public void Delete(int a)
	{
		Node n=head;
		if(n.Data == a)
		{
			head=n.next;
		}
		
		while(n!=null)
		{
			if(n.next.Data==a)
			{
				n.next = n.next.next;
				break;
			}
			n=n.next;
		}
	}
	
	public static void main(String[] args) 
	{
		NodeDeletion llist = new NodeDeletion();
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
