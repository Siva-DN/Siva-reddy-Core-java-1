package com.oopsmainly;

public class TestEncapsulationPractic2 {

	public static void main(String[] args) {

		TestEncapsulationPractic1 t1 = new TestEncapsulationPractic1();
		t1.setS_id(101);
		t1.setS_Name("Siva");
		t1.setS_course("Java");
		t1.setTotal_fee(40000);
		t1.getPay_fee();
		t1.displayFeestatus();
	}
	
	
	
}
		
/*	System.out.println("****************************");
//
//		TestEncapsulationPractic1 t2 = new TestEncapsulationPractic1();
//
//		t2.setS_id(103);
//		t2.setS_Name("Siri");
//		t2.setS_marks(95);
//		t2.setS_mailid("siri@gamail.com");
//
//		System.out.println(t2.getS_id());
//		System.out.println(t2.getS_name());
//		System.out.println(t2.getS_marks());
//		System.out.println(t2.getS_mailid());

*/

