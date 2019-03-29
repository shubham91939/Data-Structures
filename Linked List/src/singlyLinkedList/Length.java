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
	
	public static int length() //this function needs to be static in order to be called from the 'main' function and here 'main' is a static function and length() is not.So main will not be able to call length(). As one static function can call another static function. Thus 'static' keyword needs to be added in front of length() function so 'main' function can call it. 
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
