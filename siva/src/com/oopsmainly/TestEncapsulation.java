package com.oopsmainly;

public class TestEncapsulation {

	public static void main(String[] args) {

		TestEncapsulation1 e1 = new TestEncapsulation1();
		// Modifying the data
		e1.setEmpid(101);
		e1.setEmpName("Siva");
		e1.setEmpSal(50000);
		e1.setEmpPh(897884599);
		// reading or representing the data in parent class
		System.out.println("Employee_id:" + e1.getEmpid());
		System.out.println("Employee_name:" + e1.getEmpName());
		System.out.println("Employee_Salary:" + e1.getEmpSal());
		System.out.println("Employee_phnum:" + e1.getEmpPh());

		TestEncapsulation1 e2 = new TestEncapsulation1();

		e2.setEmpid(102);
		e2.setEmpName("Sree");
		e2.setEmpSal(5000);
		e2.setEmpPh(89788459);

		System.out.println("Employee_id:" + e2.getEmpid());
		System.out.println("Employee_name:" + e2.getEmpName());
		System.out.println("Employee_Salary:" + e2.getEmpSal());
		System.out.println("Employee_phnum:" + e2.getEmpPh());

//      stopping the direct Accessing the data from class TestEncapsulation1 we use
//      keyword private
//		e1.empid = 101;
//		e1.empname = "Siva";
//		e1.empsal = 50000;
//		e1.empph = 897884599;
//
//		System.out.println("Employee_id:" + e1.empid);
//		System.out.println("Employee_name:" + e1.empname);
//		System.out.println("Employee_Salary:" + e1.empsal);
//		System.out.println("Employee_phnum:" + e1.empph);

//		sc.close();
	}

}
