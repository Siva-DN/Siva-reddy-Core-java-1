package com.oppsinheritance;

import java.util.Scanner;

public class TaskHospitalBill1 {

	Scanner sc = new Scanner(System.in);
	private int patientId;
	private String patientName;
	private int daysAdmitted;
	private double daysCharges;
	private int medicineCharges;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}

	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}

	public double getDaysCharges() {
		return daysCharges;
	}

	public void setDaysCharges(double daysCharges) {
		this.daysCharges = daysCharges;
	}

	public int getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(int medicineCharges) {
		this.medicineCharges = medicineCharges;
	}

	public double CaluculateBill(double totalbill) {
		if (daysAdmitted >= 5) {

			return totalbill * 0.5;
		} else if (daysAdmitted > 10) {
			return totalbill * 0.10;
		}
		return 0;
	}

	

	public double TotalBill() {

		return (daysAdmitted * daysCharges) + medicineCharges;
	}

	public double displayBill() {
	double total=TotalBill();
	double discount=(TotalBill());
	double finalbill=TotalBill()-discount;
	
	return finalbill;
	}
	
	
	

}
