package com.fileiopackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\sivar\\\\Downloads\\\\Java.txt.siva.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();

		System.out.println(e.empid);
		System.out.println(e.ename);
		System.out.println(e.password);

	}

}
