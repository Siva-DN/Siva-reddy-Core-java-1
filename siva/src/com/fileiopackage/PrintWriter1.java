package com.fileiopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("main method Started !!");

		File f = new File("C:\\Users\\sivar\\Downloads\\Java.txt\\Show.txt");
		PrintWriter pw = new PrintWriter(f);

		pw.println("Hi Good Morning !!");
		pw.println("Good Afternoon");
		pw.println(70000);
		pw.println(true);
		pw.println('A');
		pw.print(-1);

		pw.flush();

		pw.close();
	}

}
