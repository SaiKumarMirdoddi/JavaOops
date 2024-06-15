package com.typeofbank;

import com.rbi.RBI;

public class CanaraBank implements RBI {

	@Override
	public String age(int age) {
		if (age > 18) {
			return "eligible to canara bank holder";
		}

		return "not eligible to canara bank holder";
	}

	@Override
	public String accountOpenCharges(int charges) {
		if (charges >= 1000) {
			return "access to bank account";
		}

		return "not access to bank account";
	}

	void m1() {
		int charges = 1;
		if (charges == 1000) {
			System.out.println("Canara holder");
		} else {
			System.out.println("Not a bank holder");
		}
	}

	@Override
	public String balenceMaintanance(int balence) {

		this.m1();

		if (balence == 2000) {
			return "balence in pluse";
		}

		return "balence in minuse or he don't have a account";
	}

	@Override
	public String country(String country) {

		return "country is " + country;
	}

}
