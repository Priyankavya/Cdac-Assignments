package com.demo.SpringbootRestWebservice.dto;

public class ProductDto {

	private int pid;
	private String pname;
	private int qty;
	private double price;
	private String mfgdate;
	private int cid;
	public ProductDto() {
		super();
	}
	public ProductDto(int pid, String pname, int qty, double price, String mfgdate, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getmfgdate() {
		return mfgdate;
	}
	public void setmfgdate(String ldtstr) {
		this.mfgdate = ldtstr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ldtstr="
				+ mfgdate + ", cid=" + cid + "]";
	}
	
}
