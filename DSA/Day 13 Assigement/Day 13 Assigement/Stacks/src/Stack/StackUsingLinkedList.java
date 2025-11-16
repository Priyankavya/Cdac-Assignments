package Stack;

public class StackUsingLinkedList {
	Node top;
	class Node{
		int data;
		Node next;
		
	
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}
	}
	public StackUsingLinkedList() {
		top=null;
	}
	
	public void push(int num)
	{
		Node newNode=new Node(num);
		if(!isempty())
		{
			newNode.next=top;
			
		}
		top=newNode;
		System.out.println("pushhed"+num);
	}

	private boolean isempty() {
		
		return top==null;
	}
	
	
	public int pop()
	{
		if(!isempty())
		{
			Node temp=top;
			top=top.next;
			temp.next=null;
			
			return temp.data;
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	

}
