package Array1D;
import java.util.*;
public class MyArray {
	 int arr[];
	private int count;
	
	public MyArray()
	{
		arr=new int[10];
		count=0;
	}
	
	public MyArray(int size)
	{
		arr=new int[size];
		count=0;
	}

	//gives the length of an array
	public int getcapacity()
	{
		return arr.length;
				
	}
	
	//gives the size of an array
	public int getsize()
	{
	 return count;	
	}
	
	//add element in the array
	public boolean add(int x)
	{
		if(count<arr.length)
		{
			arr[count]=x;
			count++;
			
			return true;
		}
		return false;
	}
	
	//find maximum prime number of an array
	public int findMaxPrime()
	{
		int maxprime=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isprime(arr[i]))
			{
				if(arr[i]>maxprime)
				{
					maxprime=arr[i];
				}
			}
		}
		
		
		return maxprime;
	}

	//  sub function check each number of an array is prime or not
	private boolean isprime(int i) {
	
		if(i<2)
		{
			return false;
		}
		else
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					return false;
				
				else
					return true;
			}
		}
		
		return false;
	}
	
	
	//find factorial of all prime numbers from the array
	public  int[] factorialofPrime() {
		int arrf[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			
		if(isprime(arr[i])) {
			
			
			arrf[i]=factorial(arr[i]);
			
			 System.out.println("factorial of "+arr[i]+"=  "+arrf[i]);
			
			
		  }
		}
		return arrf;
	}

	
//subfunction to find factorial of number
	private int  factorial(int i) {
		
		int  fact=1;
		for(int j=2;j<=i;j++) {
			fact=fact*j;
		}
		return fact;
	}
	
	
	// add digits of all numbers of an array
	public void adddigitofNumOfAArray()
	{
		System.out.println(" sum of digit of numbers of an array");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("sum of digit of "+arr[i]+" =" +Adddigitof(arr[i]));
		}
	}

	//subfunction to add digit of an number 
	private int Adddigitof(int i) {
		
		int num=i;
		int sum=0;
		
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	
		
	}
	
	
	public int[] copyarray()
	
	{
		int newarr[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			newarr[i]=arr[i];
			if(isprime(newarr[i] ) && newarr[i]>5)
			{
				int rev=0;
				
				
				while(newarr[i]!=0)
				{
					int digit=newarr[i]%10;
					
					rev=rev*10+digit;
					
					newarr[i]=newarr[i]/10;
					
				}
				newarr[i]=rev;
				
				
			}
			
			System.out.println(newarr[i]);
		}
		return newarr;
	}
	
	
	public void Stringarray()
	{
		String sarr[]=new String[20];
		int count=0;
		
		sarr[count++]="sita";
		sarr[count++]="mohan";
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the String");
		
		  while(count<20)
		  {
			  String st=sc.nextLine();
			  if(st.equalsIgnoreCase("exit")) break;
			  char ch=st.charAt(1);
			  
			  int pos=count;
			 
			  for(int i=0;i<count;i++)
			  {
				  if(sarr[i].charAt(1)==ch)
				  {
					  pos=i+1;
				  }
			  }
			  
			  for(int i=count;i>pos;i--)
			  {
				  sarr[i]=sarr[i-1];
			  }
			  sarr[pos]=st;
			  count++;
			  
			  for(int i=0;i<count;i++)
			  {
				  System.out.println(sarr[i]);
			  }
		  }
		  
		 sc.close();
	}
}
