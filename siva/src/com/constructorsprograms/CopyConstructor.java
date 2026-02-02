package com.constructorsprograms;
//copy constructor
public class CopyConstructor {
	int id;
	String sName;
	
	CopyConstructor(int id,String sName){
		this.id=id;
		this.sName=sName;
		
	}
	
	CopyConstructor(CopyConstructor cc){
		this.id=cc.id;
		this.sName=cc.sName;
		
	}
	

	public static void main(String[] args) {
		
		CopyConstructor cc=new CopyConstructor(1,"java");
		
		CopyConstructor cc1=new CopyConstructor(cc);
		
		
	}
}
