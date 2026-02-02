package com.constructorsprograms;


class animal{
	String name="dog";
}

class monkey extends animal{
	String name="lion";
	
	void show() {
		System.out.println("name:"+super.name);
		System.out.println("name:"+this.name);
	}
	
}



public class ConstructorDemosuper1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
//		 ConstructorDemosuper c1=new  ConstructorDemosuper();
		monkey m1=new monkey();
		 m1.show();
		

	}

}
