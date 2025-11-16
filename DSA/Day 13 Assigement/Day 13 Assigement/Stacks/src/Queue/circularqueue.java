package Queue;

public class circularqueue {

	int arr[];
	int front;
	int rear;
	class Node{
		int data;
		int next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=next;
			
		}
		
	}
	public circularqueue(int size)
	{
		front=-1;
		rear=-1;
		arr=new int[size];
	}
	
	public boolean isempty()
	{
		if(front==-1)
		{
			System.out.println("empty");
			return true;
		}
		return false;
	}
		
	public boolean isfull()
	{
		if(front==0 && rear==arr.length-1)
		{
			return true;
		}
		else if(front==rear+1)
		{
			return true;
		}
		return false;
	}
	public void enqueue(int num)
	{
		Node newNode=new Node(num);
		if(!isfull())
		{
		   if(front==-1)
		   {
			   front=0;
		   }
		   
		   rear=(rear+1)%arr.length;
		   arr[rear]=num;
		   
		   System.out.println("added successfully");
		}
			
		}
		
		public int dequeue()
		{
			if(!isempty())
			{
				int n=arr[front];
				if(front==rear)
				{
					front=-1;
					rear=-1;
					
				}
				else
				{
					front=(front+1)%arr.length;
				}
				return n;
				
			}
			return -1;
		}
	
}
