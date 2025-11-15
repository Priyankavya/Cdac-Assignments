package LinkedList;

public class DoublyLinkedList {

	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
		
		
	}
	public DoublyLinkedList()
	{
		head=null;
	}
	
	public void addNode(int val)
	{
		Node newNode=new Node(val);
				
	   if(head==null)
	   {
		   
		   head=newNode;
	   }
	   
	   else
	   {
		   Node temp=head;
		   while(temp.next!=null)
		   {
			   temp=temp.next;
		   }
		   
		 newNode.prev=temp;
		 temp.next=newNode;
		  
	   }
		
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			
			System.out.println("null");
		}
	}
	
		public void reverse()
		{
			Node temp=head;
			if(head==null)
			{
				System.out.println("empty");
			}
			else
			{
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				
				
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.prev;
					
				}
			}
		}
}
