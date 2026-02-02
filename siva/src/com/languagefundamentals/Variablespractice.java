package com.languagefundamentals;

public class Variablespractice {
	// instance variable declaration
	// instance variable+primitive variable
	int empno;
	// instance + object variable
	String empname;

	// static variables
	// static+object variables
	// static variables will access directly and with class name and also object
	// reference variable
	static int COMPANY_ID = 101;
	static String COMPANY_NAME = "Tcs";

	static int id1 = 444;

	public static void main(String[] args) {

		int id1 = 666;
		// local+primitive variable
		// in local variables we must need to initialize because internally Jvm may not
		// be giving any value
		// Syntax error on token "=", Expression expected after this token
		int id = 20;
		// local+string
		String name = null;
		System.out.println(id);
		System.out.println(name);
		System.out.println(id1);
		Variablespractice v1 = new Variablespractice();
		v1.empno = 10;
		v1.empname = "siva";

		System.out.println(COMPANY_ID);
		System.out.println(COMPANY_NAME);
		System.out.println(Variablespractice.COMPANY_ID);
		System.out.println(Variablespractice.COMPANY_NAME);
		System.out.println(v1.COMPANY_ID);
		System.out.println(v1.COMPANY_NAME);
		System.out.println(Variablespractice.id1);

		System.out.println(v1.empno);
		System.out.println(v1.empname);

	}

}
