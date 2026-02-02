package com.fileiopackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter1 {

	public static void main(String[] args) throws IOException {

		System.out.println("main methods started !!! ");

		
		File f1 = new File("C:\\Users\\sivar\\Downloads\\Java.txt\\Siva2.txt");
		FileWriter fw = new FileWriter(f1,true);

		//Append boolean value true: for already created content are fixed and then,
		//next will be added new content
		//Drawbacks:\n for next-line
		fw.write("Hello Master !!,good Evening");
		fw.write('\n');
		fw.write('A');
		fw.write('\n');
		fw.write('B');
		fw.write('\n');
		fw.write('C');
		fw.write('\n');
		fw.write('D');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write(66);
		fw.write('\n');
		fw.flush();
		
		fw.close();

	}

}
