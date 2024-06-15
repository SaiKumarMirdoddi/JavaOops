package com.encapsulationdemo;

public class GetterAndSetterDemo {

	private int userId = 101;

	private String name = "Sai";

	private String company = "TCS";

	private String details = "Employee details :";

	public int getUserId() {

		return userId;
	}

	public void setUserId(int userId) {

		this.userId = userId;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getCompany() {

		return company;
	}

	public void setCompany(String company) {

		this.company = company;
	}

	public GetterAndSetterDemo() {

	}

	public String getDetails() {

		return details;
	}

	public void setDetails(String details) {

		this.details = details;
	}

	public static void main(String[] args) {

		GetterAndSetterDemo gt = new GetterAndSetterDemo();

		System.out.println(gt.details);
		System.out.println(gt.userId);
		System.out.println(gt.name);
		System.out.println(gt.company);

	}

}
