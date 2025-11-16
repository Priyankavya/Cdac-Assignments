package com.demo.service;

import java.util.Scanner;

import com.demo.beans.EmployeeInfo;

public class EmployeeService {

	
	
	static EmployeeInfo []arr=new EmployeeInfo[20];
	static int cnt=0;
	
	static {
		arr[cnt++]=new EmployeeInfo(100,"Vipul",5000.00);
		arr[cnt++]=new EmployeeInfo(101,"Gopal",6000.00);
		arr[cnt++]=new EmployeeInfo(102,"Madhav",7000.00);
		arr[cnt++]=new EmployeeInfo(103,"tushar",8000.00);
		arr[cnt++]=new EmployeeInfo(104,"suyog",9000.00);
		arr[cnt++]=new EmployeeInfo(105,"sumit",10000.00);
		arr[cnt++]=new EmployeeInfo(106,"ram",11000.00);
		arr[cnt++]=new EmployeeInfo(107,"sham",12000.00);
		arr[cnt++]=new EmployeeInfo(108,"rohan",13000.00);
		arr[cnt++]=new EmployeeInfo(109,"rohit",14000.00);
		arr[cnt++]=new EmployeeInfo(110,"vikrat",15000.00);
		arr[cnt++]=new EmployeeInfo(111,"virat",16000.00);
		arr[cnt++]=new EmployeeInfo(112,"Vikerant",17000.00);
		arr[cnt++]=new EmployeeInfo(113,"Vitthal",18000.00);
		arr[cnt++]=new EmployeeInfo(114,"mauli",19000.00);
		arr[cnt++]=new EmployeeInfo(114,"mauli",19000.00);
		
	}

	public void AcceptData() {
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter the Emp id");
		int eid=sc.nextInt();
		
		System.out.println("Enter the Emp Name");
		String Ename=sc.next();
		
		
		System.out.println("Enter the salary of the emp");
		double sal=sc.nextDouble();
		
	EmployeeInfo info=new EmployeeInfo(eid, Ename, sal)	;
	
	if(cnt<arr.length)
	{
		
	   int j=cnt-1;
	   
	   while(j>=0 && arr[j].getEmpid()>info.getEmpid())
	   {
		   arr[j+1]=arr[j];
		   j--;
	   }
	   arr[j+1]=info;
	   cnt++;
		
		
	}
	else
	{
		System.out.println("Array is full");
	}
	}while(cnt<arr.length);
	}
	public EmployeeInfo[] Display() {
		return arr;
	}
}
