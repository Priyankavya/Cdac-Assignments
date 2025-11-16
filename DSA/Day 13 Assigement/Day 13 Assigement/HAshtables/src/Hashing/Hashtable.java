package Hashing;

public class Hashtable {

	Node heads[];
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public Hashtable(int size)
	{
		heads=new Node[size];
		for(int i=0;i<heads.length;i++)
		{
			heads[i]=null;
		}
	}
	
	public void insertdata(int val)
	{
		Node newNode=new Node(val);
		
		int pos=val%heads.length;
		if(heads[pos]!=null)
		{
			newNode.next=heads[pos];
		}
		heads[pos]=newNode;
	}
	
	public void displaydata()
	{
		for(int i=0;i<heads.length;i++)
		{
			Node temp=heads[i];
			System.out.print(i+"--->");
			
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	public void searchdata(int num)
	{
		int pos=num%heads.length;
		Node temp=heads[pos];
		
		while(temp!=null)
		{
			if(temp.data==num)
			{
				System.out.println("found at"+pos);
			}
			
			temp=temp.next;
			
		}
		
		System.out.println("not  found");
		
	}
}
