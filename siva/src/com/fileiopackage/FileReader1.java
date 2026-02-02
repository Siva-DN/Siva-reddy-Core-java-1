package com.fileiopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method Started !!!");

		File f = new File("C:\\Users\\sivar\\Downloads\\Java.txt\\Show.txt");
		FileReader fr = new FileReader(f);

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();

		
		}
		fr.close();	
		

	}

}
