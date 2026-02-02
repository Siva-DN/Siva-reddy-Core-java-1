package com.fileiopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TaskDeserialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f1 = new File("C:\\\\Users\\\\sivar\\\\Downloads\\\\Java.txt.Display.txt");

		FileInputStream fis1 = new FileInputStream(f1);

		ObjectInputStream ois1 = new ObjectInputStream(fis1);

		Customer2 c = (Customer2) ois1.readObject();
		
		System.out.println(c.userId);
		System.out.println(c.userName);
		System.out.println(c.password);
		System.out.println(c.cardNo);
		System.out.println(c.cvv);
	}

}
