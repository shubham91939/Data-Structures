package singlyLinkedList;

public class Insertion 
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
	
	public void push(int d)
	{
		Node newNode = new Node(d);
		newNode.next = head;
		head=newNode;
	}
	
	public void append(int d)
	{
		Node newNode = new Node(d);
		newNode.next = null;
		if(head == null)
		{
			head=new Node (d);
			return; 
		}
		
		Node n = head;
		while(n!=null)
		{
			n=n.next;
		}
		n.next= newNode;
	}
	
	public void insert(Node prevNode, int d)
	{
		if(prevNode==null)
		{
			Node newNode = new Node(d);
			newNode.next = head;
			head=newNode;
			return;
		}
		Node newNode = new Node(d);
		newNode.next= prevNode.next;
		prevNode.next= newNode;
	}
	
	public static void main(String[] args) 
	{
		Insertion llist = new Insertion();
		llist.push(2);
		llist.push(1);
		llist.append(4);
		llist.append(5);
		llist.insert(llist.head.next,3);
		
	}

}
