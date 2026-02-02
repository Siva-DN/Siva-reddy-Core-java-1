package com.vcubeprograms;

public class Criketet2 {
	int jno;
	String name;

	static int countryid = 101;
	static String countryname = "india";

	void hello() {
		System.out.println(countryid);
		System.out.println(countryname);
		System.out.println(jno);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Criketet2 c1 = new Criketet2();
		c1.jno = 101;
		c1.name = "siva";
		c1.hello();

		Criketet2 c2 = new Criketet2();
		c2.jno = 102;
		c2.name = "gopi";
		c2.hello();
		Criketet2 c3 = new Criketet2();
		c3.jno = 103;
		c3.name = "abhi";
		c3.hello();

	}
}
