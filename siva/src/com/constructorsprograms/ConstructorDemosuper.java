package com.constructorsprograms;

class vehicle{
	String name ="pulsur";
	
}

class auto extends vehicle{
	
	String namee="MH";
    void show(){
	System.out.println("name:"+super.name);
	System.out.println("name:"+this.namee);
  }
} 
public class ConstructorDemosuper {


	public static void main(String[] args) {
		System.out.println("main method started");
		
		auto b1=new auto();
		b1.show();
		
		System.out.println("main method ended");
		

	}
}



