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
	
	
	public void AddNode( int val ) {
		Node newNode= new Node(val);
		
		if(head==null) {
			head=newNode;
			
		}
		
		else {
			Node temp=head;
			
			while(temp.next!=null) {
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
	public void Display() {
		
		
		if(head==null) {
			System.out.println("List is empty");
		}
		
		else {
			
			for(Node temp=head;temp!=null; temp=temp.next) {
				System.out.print(temp.data+"---->");
				
			}
			
			System.out.println("null");
		}
		
	}

	public void reverse()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		
		else
		{
			Node temp=head;
		   int cnt=0;
			while(temp!=null)
			{
				cnt++;
				temp=temp.next;
				
			}
			  int arr[]=new int[cnt];
			  temp=head;
			  int i=0;
			  while(temp!=null)
				{
					arr[i]=temp.data;
					temp=temp.next;
					i++;
					
				}
			  for(int j=arr.length-1;j>=0;j--) {
                   System.out.println(arr[j]);				
			  }
		}
	}

	public void AddByPosition(int pos ,int value) {
		
		
		
		
	}
}
