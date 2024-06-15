package com.typeofbank;

import com.rbi.RBI;

public class AxisBank implements RBI {

	@Override
	public String age(int age) {
		if (age >= 18) {
			return "eligible to axis bank holder";
		} else {

			return "not eligible to axis bank holder";
		}
	}

	@Override
	public String accountOpenCharges(int charges) {
		if (charges == 2000) {
			return "access to bank account";
		}
		return "not access to bank account";
	}

	void m1() {
		int charges = 1;
		if (charges == 2000) {
			System.out.println("Axis holder");
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
		return "balence in minuse or he don't have account";

	}

	@Override
	public String country(String country) {

		return "country is " + country;
	}

}
