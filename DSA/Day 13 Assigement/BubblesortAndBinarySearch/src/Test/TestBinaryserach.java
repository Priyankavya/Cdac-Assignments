package Test;

import Bubblesort.BiniarySerach;

public class TestBinaryserach {

	public static void main(String[] args) {
		
			int []arr= {20,30,40,50,60};
			
			BiniarySerach ob=new BiniarySerach();
			
			int pos=ob.BinarySearchRecue(arr, 50, 0, arr.length-1);
			if (pos!=-1)
			{		
			System.out.println("ELE found at"+pos);
			}
			else {
				System.out.println("not found");
			}
			//System.out.println("Element found at"+BinarySearchRecue(arr, 20, 0, 7));
			
			
			int pos1=ob.binarysearchnonrec(arr, 50);
			if(pos1!=-1)
			{
				System.out.println("found at "+pos);
			}
			else
			{
				System.out.println("not found");
			}
			{
				
			}
		}


	}


