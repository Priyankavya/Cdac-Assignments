package TestEmpArray;

import java.util.Arrays;

import com.demo.beans.Empinfo;

import EmpinfoService.QuickSortEmp;

public class TestArrEmp {


	static Empinfo arr[]=new Empinfo[5];
	static int cnt=0;
	static
	{
		arr[cnt++]=new Empinfo(5, "ram", 444.44);
		arr[cnt++]=new Empinfo(3, "shyam", 555.55);
		arr[cnt++]=new Empinfo(1, "laxman", 777.44);
		arr[cnt++]=new Empinfo(2, "bharat", 888.55);
		arr[cnt++]=new Empinfo(4, "shatrughna", 999.44);
		
	}
	public static void main(String[] args) {
		QuickSortEmp qe=new QuickSortEmp();
		qe.quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
