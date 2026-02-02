package com.vcubeprograms;

public class company {
	static int companyid = 101;
	static String companyname = "tcs";
	static String companyadd = "hyd";

	// instance data part..
	int empno = 11;
	String empname = "siva";
	String empadd = "prakasam";

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("companyid:" + companyid);
		System.out.println("companyname:" + companyname);
		System.out.println("companyadd:" + companyadd);
		company e = new company();

		System.out.println("empno:" + e.empno);
		System.out.println("empname:" + e.empname);
		System.out.println("empadd:" + e.empadd);

		company e1 = new company();
		e1.empno = 12;
		e1.empname = "phani";
		e1.empadd = "guntur";
		System.out.println("empno:" + e1.empno);
		System.out.println("empname:" + e1.empname);
		System.out.println("empadd:" + e1.empadd);

	}

}
