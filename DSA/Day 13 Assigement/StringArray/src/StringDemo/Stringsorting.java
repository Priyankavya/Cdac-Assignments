package StringDemo;

import java.util.Arrays;

public class Stringsorting {

	private int partition(String[] s, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(i<end && s[i].compareTo(s[pivot])<=0)
			{
				i++;
			}
			

			while(j>start && s[i].compareTo(s[pivot])>0)
			{
				j--;
			}
		}
		
		if(i<j)
		{
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			
		}
		
		if(pivot!=j)
		{
			String temp=s[pivot];
			s[pivot]=s[j];
			s[j]=temp;
		}
	
		
		System.out.println(Arrays.toString(s));
		//System.out.println("pivot position  "+j+"   pivot  "+s[j]);
		//System.out.println("pivot   "+s[j]+"   swapped with  "+s[pivot]);
		
		
		return j;
	}
	public void quicksortstring(String[] s, int start, int end) {
		if(start<end)
		{
			int p=partition(s,start,end);
			quicksortstring(s, start, p-1);
			quicksortstring(s, p+1, end);
		}
		
	}

	

}
