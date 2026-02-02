package com.praticeprograms;

public class Programs {
	int cumid;
	String cumname;
	String cumadd;
	long no;
	
	static int companyno=5990;
	static String companyname="tcs";
	static String companyadd = "bengulur";
	
	static{ 
		int id;
		String namee = "hey siri";
		System.out.println(id= 101);
		System.out.println(namee = "hey siri");
		display();
		
		
	}
	
	{
		int no;
		String nam = "priya";
		System.out.println(no= 102);
		System.out.println(nam);
		hello();
	}
	
	void hello() {
		int id1;
		String name2;
		
	}
	
	
	static void display() {
		int idd;
		String name1;
		System.out.println(idd= 105);
		System.out.println(name1= "divi");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Programs p1 = new Programs();
		
		
		System.out.println("companyno:"+ companyno);
		System.out.println("companyname:"+ companyname);
		System.out.println("companyadd:"+ companyadd);
		
		System.out.println( p1.cumid= 10);
		System.out.println( p1.cumname= "phani");
		System.out.println( p1.cumadd = "hyderbad");
		
		System.out.println( p1.cumid= 20);
		System.out.println( p1.cumname= "siri");
		System.out.println( p1.cumadd = "vij");
		
		System.out.println( p1.cumid= 30);
		System.out.println( p1.cumname= "gopi");
		System.out.println( p1.cumadd = "guntur");
		
		
		p1.hello();
		

	}

}
