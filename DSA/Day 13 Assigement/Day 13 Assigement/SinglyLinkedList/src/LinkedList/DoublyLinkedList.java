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
	
	//add after value
	
	public void addAfterValue(int num ,int val)
	{
		Node newNode=new Node(val);
		
		Node temp=head;
		
		if(head.data==num)
		{
			newNode.next=temp.next;
			temp.next=newNode;
			//newNode.prev=head;
			
		}
		else
		{
			while(temp!=null && temp.data!=num)
			{
				temp=temp.next;
			}
			
			if(temp!=null)
			{
				newNode.next=temp.next;
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
		
		
	}
	
	public void addByPos(int pos,int val) {
		Node newNode=new Node(val);
		Node temp=head;
		
		if(pos==1)
		{
			newNode.next=temp;
			temp.prev=newNode;
			head=newNode;
		}
		
		else {
			
		for(int i=1;temp!=null && i<=pos-2;i++)
		{
			temp.prev=temp;
			temp=temp.next;
			
		}
		
		if(temp!=null)
		{
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
		}
		else
		{
			System.out.println("not found");
		}
		}
	}
	
	public void deleteByValue(int val)
	{
		Node temp=head;
		
		if(head.data==val)
		{
		    head=temp.next;
		    temp.next=null;
		   
			
		}
		else
		{
			while(temp!=null && temp.data!=val)
			{
				temp.prev=temp;
				temp=temp.next;
				
			}
			
			if(temp!=null)
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp.next=null;
				temp.prev=null;
			}
			else
			{
				System.out.println("value not found");
			}
		}
	}
	
	public void deleteByPos(int pos)
	{
		Node temp=head;
		
		if(pos==1)
		{
			head=temp.next;
			temp.next=null;
			temp.prev=null;
		}
		
		else
		{
			for(int i=0; temp!=null && i<=pos-1;i++)
			{
				
				temp=temp.next;
				
			}
			
			if(temp==null)
			{
				System.out.println("out of bound");
			}
			
				if (temp.next != null) {
			        temp.next.prev = temp.prev;
			    }

			    if (temp.prev != null) {
			        temp.prev.next = temp.next;
			    }

			    temp.next = null;
			    temp.prev = null;
				
				
				
			
			
			
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
