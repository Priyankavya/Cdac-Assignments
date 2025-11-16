package EmpinfoService;

import java.util.Arrays;

import com.demo.beans.Empinfo;

public class QuickSortEmp {
	
	

	

	public static int partition(Empinfo[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j) {
		while(i<end && arr[i].getEmpid()<=arr[pivot].getEmpid())
		{
			i++;
		}
		while(j>start && arr[j].getEmpid()>arr[pivot].getEmpid())
		{
			j--;
		}
		
		if(i<j)
		{
			Empinfo temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		if(pivot!=j)
		{
			Empinfo temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
		}
		
		
		return j;
	}
	
	public static void quicksort(Empinfo arr[],int start,int end)
	{
		if(start<end)
		{
		int p=partition(arr, start, end);
		quicksort(arr, start, p-1);
		quicksort(arr, p+1, end);
		}
	}
	
	
}
