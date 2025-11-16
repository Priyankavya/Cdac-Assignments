package StringTest;

import java.util.Arrays;

import StringDemo.Stringsorting;

public class Stringmain {

	public static void main(String[] args) {
		String s[]= {"sita","gita","nita","priya"};
		
		System.out.println(Arrays.toString(s));
		Stringsorting so=new Stringsorting();
		so.quicksortstring(s,0,s.length-1);
		
	}


}
