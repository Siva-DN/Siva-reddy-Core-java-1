package com.fileiopackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");

		File f = new File("C:\\Users\\sivar\\Downloads\\Java.txt\\Hello.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Hii Good morning !!");
		bw.newLine();
		bw.write("Have a good day !!");
		bw.write(101);
		bw.write(65);
		bw.write('\n');
		bw.write("69");

		bw.flush();
		bw.close();
	}

}
