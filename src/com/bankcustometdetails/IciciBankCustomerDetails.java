package com.bankcustometdetails;

public class IciciBankCustomerDetails {

	Customers cs;

	public static void main(String[] args) {

		IciciBankCustomerDetails ic = new IciciBankCustomerDetails();

		Customers cus = new Customers();

		CustomerOne cto = new CustomerOne();

		PersonalDetails pdt = new PersonalDetails();

		ic.cs = cus;

		cus.co = cto;

		cto.pd = pdt;

		pdt.Aadhar = 14785;

		pdt.AccountNo = 1521040991;

		pdt.Name = "SAI";

		pdt.dNo = 14 - 145;

		pdt.City = "Hyderabad";

		pdt.State = "Telangana";

		System.out.println("First Customer Details :");
		System.out.println("A/C :" + cto.pd.AccountNo);
		System.out.println("Aadhar No :" + cto.pd.Aadhar);
		System.out.println("Customer Name :" + cto.pd.Name);
		System.out.println("Door No :" + cto.pd.dNo);
		System.out.println("City :" + cto.pd.City);
		System.out.println("State :" + cto.pd.State);
		System.out.println(" ");

		CustomerTwo ctt = new CustomerTwo();

		cus.ct = ctt;

		ctt.pd = pdt;

		pdt.AccountNo = 1717892545;

		pdt.Aadhar = 12385;

		pdt.Name = "SHASHI";

		pdt.City = "Mumbai";

		pdt.State = "Maharastra";

		System.out.println("Second Customer Details :");
		System.out.println("A/C :" + ctt.pd.AccountNo);
		System.out.println("Aadhar No :" + ctt.pd.Aadhar);
		System.out.println("Customer Name :" + ctt.pd.Name);
		System.out.println("City :" + ctt.pd.City);
		System.out.println("State :" + ctt.pd.City);

	}
}
