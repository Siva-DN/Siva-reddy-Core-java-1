package com.praticeprograms;

/*Q)Constructor Chaining (this())
Create a class BankAccount with:
Variables: accountNumber, holderName, balance
Create:
Constructor with only accountNumber
Constructor with accountNumber and holderName (use this(accountNumber) to chain)
Constructor with all fields (use this(accountNumber, holderName))
Create object using the 3rd constructor and print values. */
public class BankAccount {
	
	long accountNumber;
	String holderName;
	double balance;
	
	
	 BankAccount(long accountNumber){
		 this.accountNumber=accountNumber;

	 }
	 
	 BankAccount(long accountNumber,String holderName){
		 this(accountNumber);
		 this.accountNumber=accountNumber;
		 this.holderName=holderName;
		 
	 }
	 BankAccount(long accountNumber,String holderName,double balance){
		 this(accountNumber,holderName);
		 this.balance=balance;
	 
	 
	 }
	 
	 void show(){
		 System.out.println("acc_no:"+accountNumber);
		 System.out.println("acc_name:"+holderName);
		 System.out.println("acc_balance:"+balance);
		 
		 
	 }
	 
	public static void main(String[] args) {
		
		 BankAccount b1=new  BankAccount(22334455,"siva",500000);
		 b1.show();
		
	}

}
