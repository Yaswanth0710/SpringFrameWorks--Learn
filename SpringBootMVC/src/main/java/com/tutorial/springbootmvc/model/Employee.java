package com.tutorial.springbootmvc.model;

public class Employee {
	
	private int Eid;
	private String Ename;
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	
	@Override
	public String toString() {
		return "["+ Eid + "]";
	}
}
