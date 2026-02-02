package com.exceptionhandiling;

import java.io.File;
import java.io.IOException;

public class TaskOIFileIOException {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		
		
		File f1=new File("C:\\\\Users\\\\sivar\\\\Downloads\\\\Java.txt\\\\SivaExceptions.txt");

//		f1.createNewFile();	
		f1.canRead();
		
		
//		try {
//			
//		}catch(IOException e) {
//			
//		}
	}

}
