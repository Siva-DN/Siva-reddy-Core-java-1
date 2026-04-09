package com.collection1;
//Comparator
public class Employe1 {

	
	int empid;
	String empname;
	int empage;
	
	
	public Employe1(int empid, String empname, int empage) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
	}
	@Override
	public String toString() {
		return "Employe1 [empid=" + empid + ", empname=" + empname + ", empage=" + empage + "]";
	}
	
	
	
}
