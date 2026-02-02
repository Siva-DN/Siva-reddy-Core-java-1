package com.AbstractClassAbstraction;

public class DriverBank2 {

	public static void main(String[] args) {
		
		BankAbstractClass2 b1=new SbiBank1();
		b1.bank_Address();
		b1.bank_deposit();
		b1.bank_Getbalance();
		b1.bank_Id();
		b1.bank_Name();
		b1.bank_Withdraw();
		b1.welcome();
	}

}
