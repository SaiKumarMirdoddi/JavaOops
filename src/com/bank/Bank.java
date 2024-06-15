package com.bank;

import com.rbi.RBI;

import com.typeofbank.AxisBank;

public class Bank {

	public static void main(String[] args) {

		RBI rbi = new AxisBank();

		System.out.println(rbi.age(20));
		System.out.println(rbi.accountOpenCharges(500));
		System.out.println(rbi.balenceMaintanance(600));
		System.out.println(rbi.country("india"));

	}

}
