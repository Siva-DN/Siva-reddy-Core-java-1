package com.oopsmainly;

// DTO     :Data transfer object
//POJO     :Plain old java object
//MOdel    :Data model
public class TestEncapsulation1 {

	private int empid;
	private String empname;
	private double empsal;
	private long empph;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {

		return empid;
	}

	public void setEmpName(String empname) {
		this.empname = empname + "-Tcs" + "-MNC" + "-HYD";
	}

	public String getEmpName() {
		return empname;
	}

	public void setEmpSal(double empsal) {
		this.empsal = empsal;
	}

	public double getEmpSal() {
		return empsal;
	}

	public void setEmpPh(long empph) {
		this.empph = empph;
	}

	public long getEmpPh() {
		return empph;
	}

	void display() {

	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	public long getEmpph() {
		return empph;
	}

	public void setEmpph(long empph) {
		this.empph = empph;
	}

}
