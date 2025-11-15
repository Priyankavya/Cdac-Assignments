package com.demo.beans;

import java.util.Objects;

public class Empinfo {

	private int empid;
	private String ename;
	private double salary;
	
	
	
	
	
	public Empinfo() {
		super();
	}

  public Empinfo(int empid, String ename, double salary)
   {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}


public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}



@Override
public int hashCode() {
	return Objects.hash(empid);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Empinfo other = (Empinfo) obj;
	return empid == other.empid;
}
@Override
public String toString() {
	return "Empinfo [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
}

}
