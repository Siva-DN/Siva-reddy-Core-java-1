package com.fileiopackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empid=101;
	String ename="siva";
	transient String password="Siva@123";
}


public class Serialization1 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("main method started !!1");
		
		Employee e=new Employee();
		
		File f=new File("C:\\Users\\sivar\\Downloads\\Java.txt.siva.txt");
		
		FileOutputStream fos =new FileOutputStream(f);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		
		
	}

}
