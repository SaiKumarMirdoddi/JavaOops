package com.hasarelation;

public class TeamLeaderDetails {

	PersonalDetails pdt;

	EmployeeAddress adr;

	public static void main(String[] args) {

		TeamLeaderDetails tl = new TeamLeaderDetails();

		PersonalDetails pd = new PersonalDetails();

		pd.id = 221;

		pd.name = "Bhavitha";

		tl.pdt = pd;

		EmployeeAddress ad = new EmployeeAddress();

		ad.dNo = 38;

		ad.city = "Hyderabad";

		ad.state = "Telangana";

		tl.adr = ad;
		
		System.out.println("Team Leader Details :");

		System.out.println("Employee ID :" + tl.pdt.id);
		System.out.println("Team Leader Name :" + tl.pdt.name);

		System.out.println("Door No :" + tl.adr.dNo);
		System.out.println("City :" + tl.adr.city);
		System.out.println("State :" + tl.adr.state);
	}
}
