package Test;

import Bubblesort.BubbleSort;

public class TestBubblesort {

	public static void main(String[] args) {
		BubbleSort ob=new BubbleSort();
		
		
		int []arr= {40,70,10,90,30,100,80};

		System.out.println(" bubble sort :");

	//	ob.Bubblesort(arr);
		System.out.println("Improved bubble sort :");
		
		
		//ob.Bubblesortimproved(arr);
		
		System.out.println("bubble sort in descending order");
		ob.bubblesortdesc(arr);
	}

}
