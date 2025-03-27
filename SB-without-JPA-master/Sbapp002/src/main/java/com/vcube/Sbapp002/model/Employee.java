package com.vcube.Sbapp002.model;

public class Employee {
	private int eid;
	private String lname;
	private String fname;
	private double sal;
	
	public Employee(int eid, String lname, String fname, double sal) {
		super();
		this.eid = eid;
		this.lname = lname;
		this.fname = fname;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
