package com.polymorphism;

public class NaveenOverridng extends SaiOverriding {

	public static void main(String[] args) {

		NaveenOverridng no = new NaveenOverridng();
		no.heroDetails("chai");
	}

	@Override
	String heroDetails(String c) {
		
		super.heroDetails("akhil");
		System.out.println(" ");

		System.out.println("Remuniration : " + 25 + "crores");
		System.out.println("Hero : " + "chaitanya");
		System.out.println("Movie : " + "Love Story");

		return c;
	}

}
