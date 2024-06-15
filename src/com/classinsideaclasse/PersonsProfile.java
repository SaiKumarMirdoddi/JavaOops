package com.classinsideaclasse;

public class PersonsProfile {

	public static void main(String[] args) {

		PesronDetails ps = new PesronDetails();

		ps.setAadhar(1234);
		ps.setName("Sai");
		ps.setJob("Police");

		System.out.println("SAI Details :");

		int aadhar = ps.getAadhar();
		System.out.println("Aadhar No:" + aadhar);

		String name = ps.getName();
		System.out.println("Name :" + name);

		String job = ps.getJob();
		System.out.println("Job :" + job);

		Address adr = new Address();

		adr.setDno(201);
		adr.setCity("Siddipet");
		adr.setZipcode(502103);

		int Dno = adr.getDno();
		System.out.println("Door No :" + Dno);

		String City = adr.getCity();
		System.out.println("City :" + City);

		int Zipcode = adr.getZipcode();
		System.out.println("ZipCode :" + Zipcode);

		System.out.println(" ");

		System.out.println("SHESHi Details :");

		ps.setAadharNo(4321);
		ps.setNaam("Sheshi");
		ps.setProfession("Software");

		int aadharNo = ps.getAadharNo();
		System.out.println("Aadhar No :" + aadharNo);

		String naam = ps.getNaam();
		System.out.println("Name :" + naam);

		String Job = ps.getProfession();
		System.out.println("Job :" + Job);

		SecondAddress sc = new SecondAddress();

		sc.setDrNo(501);
		sc.setCity("Karimnagar");
		sc.setZipcode(500060);

		int dNo = sc.getDrNo();
		System.out.println("Door No :" + dNo);

		String city = sc.getCity();
		System.out.println("City :" + city);

		int zipCode = sc.getZipcode();
		System.out.println("ZipCode :" + zipCode);
	}
}