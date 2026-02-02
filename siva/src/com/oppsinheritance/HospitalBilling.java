package com.oppsinheritance;

public class HospitalBilling {

	public static void main(String[] args) {

		TaskHospitalBill1 h1 = new TaskHospitalBill1();

		h1.setPatientId(101);
		h1.setPatientName("yashwant");
		h1.setDaysAdmitted(10);
		h1.setDaysCharges(5000);
		h1.setMedicineCharges(2000);

		System.out.println(h1.getPatientId());
		System.out.println(h1.getPatientName());
		System.out.println(h1.getDaysAdmitted());
		System.out.println(h1.getDaysCharges());
		System.out.println(h1.getMedicineCharges());
		System.out.println(h1.TotalBill());
		System.out.println(h1.displayBill());
	}

}
