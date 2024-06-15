package com.hasarelation;

public class ManagerDetails {

	PersonalDetails pdr;

	EmployeeAddress adr;

	public static void main(String[] args) {

		ManagerDetails md = new ManagerDetails();

		PersonalDetails pd = new PersonalDetails();

		pd.id = 421;

		pd.name = "Vinayak";

		md.pdr = pd;

		EmployeeAddress ad = new EmployeeAddress();

		ad.dNo = 49;

		ad.city = "Bangulore";

		ad.state = "Karnataka";

		md.adr = ad;

		System.out.println("Manager Details :");

		System.out.println("Employee ID :" + md.pdr.id);
		System.out.println("Manager Name :" + md.pdr.name);

		System.out.println("Door No :" + md.adr.dNo);
		System.out.println("City :" + md.adr.city);
		System.out.println("State :" + md.adr.state);
	}
}
