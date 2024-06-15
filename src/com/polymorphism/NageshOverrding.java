package com.polymorphism;

public class NageshOverrding {
	public static void main(String[] args) {
		NageshOverrding no = new NageshOverrding();
		no.heroDetails("ANR");
	}

	String heroDetails(String a) {

		System.out.println("Remuniration :" + 15 + "crores");
		System.out.println("Hero : " + "ANR");
		System.out.println("Movie : " + "Deva Dasu");
		return a;
	}

}
