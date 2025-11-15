package Test;

import java.util.stream.IntStream;

import Array1D.MyArray;

public class TestMyArray {

	public static void main(String[] args) {
	MyArray ma=new MyArray(5);
	
	ma.add(10);
	ma.add(15);
	ma.add(17);
	ma.add(11);
	ma.add(13);
	
    //ma.findMaxPrime();
  System.out.println("maxprime is  "+ma.findMaxPrime());
  System.out.println();
  
    ma.adddigitofNumOfAArray();
    
    System.out.println();
    
    
   
 
    
    System.out.println();
    ma.factorialofPrime();
 
   ma.copyarray();
    //IntStream.of(c).forEach(e->System.out.println(e+","));
   
   
   
   
   ma.Stringarray();
  

	}

}
