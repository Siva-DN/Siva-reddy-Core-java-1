package com.exceptionhandiling;

//FileNotFoundException,InterruptedException,

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundCheckedException1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("Main method started !!");

		
		FileReader fr = new FileReader("C:\\Users\\sivar\\Downloads\\Java.txt\\SivaExceptions.txt");
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);//
			i = fr.read();
			Thread.sleep(100);
		}
		System.out.println("main method ended !!!");
	}

}
