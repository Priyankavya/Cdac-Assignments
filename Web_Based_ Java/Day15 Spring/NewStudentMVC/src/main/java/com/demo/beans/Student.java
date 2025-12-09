package com.demo.beans;

public class Student {

	private int sid;
	private String sname;
	private int std;
	private int maths;
	private int science;
	private int english;
	public Student() {
		super();
		
	}
	public Student(int sid, String sname, int std, int maths, int science, int english) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.std = std;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", std=" + std + ", maths=" + maths + ", science=" + science
				+ ", english=" + english + "]";
	}
	
	
	
}
