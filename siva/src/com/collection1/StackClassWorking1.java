package com.collection1;

import java.util.Stack;

public class StackClassWorking1 {

	public static void main(String[] args) {

		Stack<String> ss = new Stack<>();

		ss.push("java");
		ss.push("microservices");
		ss.push("Core");
		ss.push("J2ee");
		ss.push("Html");
		ss.push("Mysql");
		ss.push("servelts");
		ss.push("spring");	

//		System.out.println(ss);

//		System.out.println(ss.push("css"));
//		System.out.println(ss.pop());
//		System.out.println(ss.peek());
		System.out.println(ss.isEmpty());
		
		System.out.println(ss.search("Core"));//1-based index top to down calu-cate

	}

}
