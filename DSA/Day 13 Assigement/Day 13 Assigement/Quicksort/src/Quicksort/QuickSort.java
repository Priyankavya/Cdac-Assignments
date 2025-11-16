package Quicksort;

import java.util.Arrays;

public class QuickSort {
  private static int partition(int []arr, int start,int end) {
	  int pivot=start;
	  int i =start;
	  int j=end;
	  
	  while(i<j) {
		  
		  while(i<end && arr[i]<=arr[pivot]) {
			  i++;
		  }
		  
		  while(j>start && arr[j]>=arr[pivot]) {
			  j--;
		  }
	 
	  if(i<j) {
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
	  }
	  
	  }
	  
	  if(pivot!=j) {
		  int temp=arr[pivot];
		  arr[pivot]=arr[j];
		  arr[j]=temp;
	  }
	  System.out.println("the pivot is "+j+"pivot no"+arr[j]);
	System.out.println(Arrays.toString(arr));
	  
	return j;
	
	  
  }
  public static void QuickSorts(int []arr, int start,int end) {
	  
	  if(start<end) {
	  int p=partition(arr, start, end);
	  QuickSorts(arr, start, p-1);//left
	  QuickSorts(arr, p+1, end);//right
	  
	  }
  }
}
