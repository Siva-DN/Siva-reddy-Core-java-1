package com.exceptionhandiling;

//throws is a keyword to satisfying the compiler when we have checked exception,
//we can write in method level and any methods...
import java.io.File;
import java.io.IOException;

public class IONotFoundCheckedException {
	
	@SuppressWarnings("finally")
	static int Test() {
		try {
			return 10;
		}finally{
			return 20;
			
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println("main method started !!");
		File f = new File("C:\\Users\\sivar\\Downloads\\Java.txt\\SivaExceptions.txt");

		f.createNewFile();
		System.out.println("main method ended !!"+Test());
		
		
		
		
		

	}

}
