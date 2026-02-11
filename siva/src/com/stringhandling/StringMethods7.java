package com.stringhandling;

public class StringMethods7 {

	public static void main(String[] args) {

		String s5 = "";
		String s6 = " ";
		String s7 = null;

		System.out.println(s5.isEmpty());// true
		System.out.println(s5.isBlank());// true

		System.out.println(s6.isEmpty());// false
		System.out.println(s6.isBlank());// true

//		System.out.println(s7.isEmpty());// null pointer-exception
//		System.out.println(s7.isBlank());// nullpointer-exception

		String s3 = "Hello";//SCP
		String s4 = new String("Hello");//Heap
		s4 = s4.intern();
		System.out.println(s3 == s4);

		String s2 = "hello world welcome to java world";
		System.out.println(s2.indexOf('o'));

		System.out.println(s2.indexOf('w', s2.indexOf('w') + 1) + 1);

		String s1 = "hi GoodMorning have a good day";

		char[] ch = new char[20];

		s1.getChars(3, 13, ch, 0);

		for (char c : ch) {
			System.out.print(c);
		}

	}

}
