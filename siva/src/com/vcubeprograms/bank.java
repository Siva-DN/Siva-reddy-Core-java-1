package com.vcubeprograms;

public class bank {

	// instance data declaration..
	int cumno = 101;
	String cumname = "srinu";
	String cumadd = "guntur";

	// static data declaration..
	static int bankid = 201;
	static String bankname = "sbi";
	static String bankadd = "hyd";
	static int bankphone = 12345;

	void display() {
		System.out.println("bankid:" + bankid);
		System.out.println("bankname:" + bankname);
		System.out.println("bankadd:" + bankadd);
		System.out.println("bankphone:" + bankphone);
		System.out.println("cumno:" + cumno);
		System.out.println("cumname:" + cumname);
		System.out.println("cumadd:" + cumadd);

	}

	public static void main(String[] args) {
		System.out.println("welcome to SBI bank");
		bank b1 = new bank();
		b1.display();

		bank b2 = new bank();
		b2.cumno = 102;
		b2.cumname = "phani";
		b2.cumadd = "vij";
		b2.display();
		System.out.println("object1 started here information");

		bank b3 = new bank();
		b3.cumno = 103;
		b3.cumname = "gopi";
		b3.cumadd = "delhi";
		b3.display();

		bankid = 210;
		bankname = "icic";
		bankadd = "andra";
		bankphone = 122222;
		bank b6 = new bank();
		b6.display();

		System.out.println("object2 started here informatio");
		bank b4 = new bank();
		b4.cumno = 105;
		b4.cumname = "priya";
		b4.cumadd = "ongole";
		b4.display();

		System.out.println("object3 started here informatio");
		bank b5 = new bank();
		b5.cumno = 106;
		b5.cumname = "sree";
		b5.cumadd = "tirupati";
		b5.display();

	}

}
