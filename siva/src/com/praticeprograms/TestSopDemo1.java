package com.praticeprograms;

//SOP related program..?
//main method related..?
public class TestSopDemo1 {

	static String name = "siva";

	public strictfp synchronized final static void main(String[] args) {

		System.out.println(TestSopDemo1.name.length());

		for (String arg : args)
			;
		System.out.println(args);

	}

	/*
	 * void main(String[] args) {
	 * System.out.println("main method started with  args"); }
	 */

	void main() {
		System.out.println("main method started with no args");
	}

}
