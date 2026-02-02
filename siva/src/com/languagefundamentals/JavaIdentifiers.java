package com.languagefundamentals;

public class JavaIdentifiers {

	int id_1 = 4;
	String name$ = "siva";

	void hello() {
		System.out.println("hello method called");
	}

	public static void main(String[] args) {
		System.out.print("main method started");

		JavaIdentifiers f1 = new JavaIdentifiers();
		System.out.println(f1.id_1);
		System.out.println(f1.name$);
		f1.hello();
	}

}
