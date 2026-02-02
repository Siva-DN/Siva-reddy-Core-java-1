package com.fileiopackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer2 implements Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	int userId=101;
	String userName="siva";
	transient String  password="Siva@123";
	transient double cardNo=12233334;
	transient int cvv=244;
	
	
}

public class TaskSerialization1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("main method Started");
		
		Customer2 c=new Customer2();
		
		File f1=new File("C:\\Users\\sivar\\Downloads\\Java.txt.Display.txt");
		
		FileOutputStream fos1=new FileOutputStream(f1);
		
        ObjectOutputStream oos=new ObjectOutputStream(fos1);
		
		oos.writeObject(c);
		
		
	}

}
