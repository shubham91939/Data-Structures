package singlyLinkedList;

public class Length 
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
	
	public int length()
	{
		int count=0;
		Node n=head;
		while(n!=null)
		{
			count++;
			n=n.next;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int a;
		Length llist= new Length();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		a=llist.length();
		System.out.println("Length of Linked List : " + a );
	}

}
