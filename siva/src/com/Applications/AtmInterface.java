package com.Applications;

public interface AtmInterface {
	
	void withDraw(double amount);
	
	void deposit(double amount);
	
	void checkBalance();
	
	void pin(int oldpin,int  newpin);
	
	void forgetPin();
	
	
	
	void insertuser();
}
