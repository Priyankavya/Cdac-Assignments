package test;

import com.demo.beans.EmployeeInfo;
import com.demo.service.EmployeeService;

public class Employeetest {
public static void main(String args[])
{
	
	EmployeeService eservice=new EmployeeService();
	
	//eservie.Acceptdata();
	eservice.AcceptData();
	EmployeeInfo arr[]=eservice.Display();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}	
	
}
