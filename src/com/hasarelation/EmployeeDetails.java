package com.hasarelation;

public class EmployeeDetails {

	PersonalDetails pd;

	EmployeeAddress adr;

	public static void main(String[] args) {

		EmployeeDetails ed = new EmployeeDetails();

		PersonalDetails pdt = new PersonalDetails();

		EmployeeAddress ad = new EmployeeAddress();
		
		pdt.id = 121;

		pdt.name = "Sai";

		ed.pd = pdt;

		ad.dNo = 38;
		
		ad.city = "Hyderabad";
		
		ad.state = "Telangana";
		
		ed.adr = ad;
		
		System.out.println("Employee Details :");
		
		System.out.println("Employee ID :" + ed.pd.id);
		System.out.println("Employee Name :" + ed.pd.name);

		System.out.println("Door no :"+ ed.adr.dNo);
		System.out.println("City :"+ ed.adr.city);
		System.out.println("State :"+ ed.adr.state);
	}
}
