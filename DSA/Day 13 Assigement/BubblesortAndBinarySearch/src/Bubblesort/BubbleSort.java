package Bubblesort;

import java.util.Arrays;

public class BubbleSort {

	// bubble sort algorithm for sorting array in ascending
	public void Bubblesort( int arr[]) {
		
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			cnt++;
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			System.out.println("NO of itreations are"+cnt);
			System.out.println(Arrays.toString(arr));
			
		}
		
		
	}
	
	// improved bubble sort for sorting array in ascending order.it reduces number of comparisions
public void Bubblesortimproved( int arr[]) {
		
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag= false;
			cnt++;
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					
					 flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					
				}
				
				
			}
			System.out.println("NO of itreations are"+cnt);
			System.out.println(Arrays.toString(arr));
			
			if(!flag)
				break;
			
		}
		
		
	}


//sorting array in descending using buuble sort
    public void bubblesortdesc(int arr[])
    {
    	int cnt=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		boolean flag=false;
    		for(int j=1;j<arr.length-i;j++)
    		{
    			cnt++;
    			
    			if(arr[j-1]<arr[j])
    			{
    				
    				flag=true;
    				int temp=arr[j-1];
    				arr[j-1]=arr[j];
    				arr[j]=temp;
    			}
    			
    			System.out.println("iterations "+cnt);
    			System.out.println(Arrays.toString(arr));
    		}
    		if(!flag)
    			break;
    	}
    }


	
	
}
