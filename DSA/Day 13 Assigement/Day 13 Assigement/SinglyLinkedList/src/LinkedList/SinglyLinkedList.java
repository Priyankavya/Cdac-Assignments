package LinkedList;

import java.util.ArrayList;

public class SinglyLinkedList {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		public Node(int data ) {
			
			this.data=data;
			next=null;
		}
		
		
		
		
	}
	
	public SinglyLinkedList() {
		head =null;
	}
	
	//adding node
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
			temp.next=newNode;
		}
	}

    public void deleteallprimes()
    {
    	//Node prev;
    	while( head!=null && isprime(head.data))
    	{
    		
    		head=head.next;
    	}
    	
    	Node temp=head;
    	Node prev=null;
    	
    	while(temp!=null)
    	{
    		
    		if(isprime(temp.data))
    		{
    			prev.next=temp.next;
    		}
    		else
    		{
    			prev=temp;
    		}
    		temp=temp.next;
    	}
    	
    	
    }
    
    //displaying linked list
    public void display()
    {
    	Node temp=head;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+"--->");
    		temp=temp.next;
    		
    	}
    	System.out.print("null");
    	System.out.println();
    }
    
    //reverse
    public void displayreverse()
    {
    	int cnt=0;
    	Node temp=head;
    	while(temp!=null)
    	{
    		cnt++;
    		temp=temp.next;
    		
    	}
    	
    	temp=head;
    	
    	int arr[]=new int[cnt];
    	int i=0;
    	while(temp!=null)
    	{
    		arr[i]=temp.data;
    		temp=temp.next;
    		i++;
    		
    	}
    	
    	for(int j=arr.length-1;j>=0;j--)
    	{
    		System.out.println(arr[j]);
    		
    	}
    }
    
    //adding after vale
    public void addAftergiveNum(int num,int val)
    {
    	Node newNode=new Node(val);
    	
    	Node temp=head;
    	
    	while(temp!=null && temp.data!=num)
    	{
    		temp=temp.next;
    	}
    	
    	if(temp!=null)
    	{
    		newNode.next=temp.next;
    		temp.next=newNode;
    	}
    	else
    	{
    		System.out.println("number not found");
    	}
    }
    
    //add at pos
    public void addAtPos(int pos,int value)
    {
    	Node newNode=new Node(value);
    	if(pos==1)
    	{
    		newNode.next=head;
    		head=newNode;
    	}
    	else
    	{
    		Node temp=head;
    		
    		for(int i=1;temp!=null && i<=pos-2;i++)
    		{
    			
    			temp=temp.next;
    		}
    		if(temp!=null)
    		{
    			newNode.next=temp.next;
    			temp.next=newNode;
    		}
    		else {
    			System.out.println("not found pos");
    		}
    	}
    }
    
    //delete by value
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
    	Node prev=null;
    	while(temp!=null && temp.data!=val)
    	{
    		prev=temp;
    		temp=temp.next;
    	}
    	
    	
    	if(temp!=null)
    	{
    		
    	   prev.next=temp.next;
    	   temp.next=null;
    	}
    	else
    	{
    		System.out.println("not found");
    	}
    }
    }
    
    public void deleteByPos(int pos)
    {
    	Node temp=head;
    	Node prev=null;
    	if(pos==1)
    	{
    		head=temp.next;
    		temp.next=null;
    		
    	}
    	
    	else
    	{
    		for(int i=1;temp!=null && i<=pos-1;i++)
    		{
    			prev=temp;
    			temp=temp.next;
    		}
    		
    		if(temp!=null)
    		{
    			prev.next=temp.next;
    			temp.next=null;
    		}
    	}
    }
    
    //add before val
    
    public void addBeforeVal(int num,int val)
    {
    	Node newNode=new Node(val);
    	Node temp=head;
    	;
    	if(head.data==num)
    	{
    		newNode.next=head;
    		head=newNode;
    	}
    	
    	else
    	{
    		Node prev=null;
    		while(temp!=null && temp.data!=num)
    		{
    			prev=temp;
    			temp=temp.next;
    		}
    		
    		if(temp!=null)
    		{
    			prev.next=newNode;
    			newNode.next=temp;
    			temp=newNode;
    		}
    	}
    }
    public boolean isprime(int n)
    {
    	
    	if(n==0 || n==1)
    	{
    		return false;
    	}
    	if(n==2 )
    	{
    		return true;
    	}
         if(n%2==0)
         {
        	 return false;
         }
    	for(int i=3;i<=n/2;i++)
    	{
    		if(n%i==0)
    		{
    			return false;
    		}
    	}
    return true;
    }
	
	
}
