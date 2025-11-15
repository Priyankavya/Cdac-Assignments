package Bubblesort;

public class BiniarySerach {
	
	public static  int BinarySearchRecue(int []arr,int search,int low ,int high) {
		
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				return mid;
			}
			else if(search<arr[mid]) {
				return BinarySearchRecue(arr, search, low, mid-1);
			}
			
			else {
				return BinarySearchRecue(arr, search, mid+1, high);
			}
		}
		return -1;
		
	
	}
	
	public static int binarysearchnonrec(int arr[],int search)
	{
		int low=0;
		int high=arr.length-1;
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==search)
			{
				return mid;
			}
			
			else if(search<arr[mid])
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
		
	
	}
	
	
	
}
