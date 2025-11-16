package Queue;

public class QueueUsingLinkedList {
	Node front;
	Node rear;
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	public QueueUsingLinkedList()
	{
		rear=null;
		front=null;
	}
	
	
	public void enqueue(int num)
	{
		Node newNode=new Node(num);
		
		if(isempty())
		{
			front=newNode;
			
		}
		else
		{
			rear.next=newNode;
		}
		rear=newNode;
	}

	public int dequeue()
	{
		if(!isempty())
		{
			Node temp=front;
			front=front.next;
			
			if(front==null)
			{
				rear=null;
			}
			temp.next=null;
			return temp.data;
		}
			else
			{
				System.out.println("queue is empty");
				return -1;
			}
		
	}

	private boolean isempty() {
		
		return front==null && rear==null;
	}

}
