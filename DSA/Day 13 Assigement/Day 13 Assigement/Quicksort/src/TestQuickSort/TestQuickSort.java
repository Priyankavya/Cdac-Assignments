package TestQuickSort;

import Quicksort.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		
		
		QuickSort q=new QuickSort();
		
		int []arr= {20,40,80,30,50,90};
		System.out.println("Quick sort");

		q.QuickSorts(arr, 0, arr.length-1);
	
	}

}
