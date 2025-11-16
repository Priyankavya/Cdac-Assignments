package Stack;

public class StackUsingArray {

	private int arr[];
	private int top;
	public StackUsingArray( int size) {
		
		arr = new int[size];
		top = -1;
	}
	
	public void push(int num)
	{
		if(!isfull())
		{
		   	top++;
		   	arr[top]=num;
		   	System.out.println("pushed"+num);
		}
	}

	private boolean isfull() {
		
		return top==arr.length-1;
	}
	public int pop()
	{
		if(!isEmpty())
		{
			int num=arr[top];
			top--;
			return num;
		}
		else {
			System.out.println(" stack is empty");
			return -1;
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
	
}
