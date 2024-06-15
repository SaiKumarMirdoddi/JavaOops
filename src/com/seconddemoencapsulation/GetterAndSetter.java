package com.seconddemoencapsulation;

import com.encapsulationdemo.GetterAndSetterDemo;

public class GetterAndSetter {

	public static void main(String[] args) {

		GetterAndSetterDemo gt = new GetterAndSetterDemo();
		
		gt.setDetails("Employee details :");
		gt.setUserId(102);
		gt.setName("Bhavitha");
		gt.setCompany("Infosys");

		String details = gt.getDetails();
		System.out.println(details);
		
		int userId = gt.getUserId();
		System.out.println(userId);

		String name = gt.getName();
		System.out.println(name);

		String company = gt.getCompany();
		System.out.println(company);

	}

}
