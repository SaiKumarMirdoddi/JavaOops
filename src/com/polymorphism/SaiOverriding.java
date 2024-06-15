package com.polymorphism;

public class SaiOverriding extends NageshOverrding {

	public static void main(String[] args) {

		SaiOverriding so = new SaiOverriding();
		so.heroDetails("akhil");

	}

	@Override
	String heroDetails(String b) {

		super.heroDetails("anr");
		System.out.println(" ");

		System.out.println("Remuniration :" + 35 + "crores");
		System.out.println("Hero : " + "Akhil");
		System.out.println("Movie : " + "Agent");
		return b;
	}

}
