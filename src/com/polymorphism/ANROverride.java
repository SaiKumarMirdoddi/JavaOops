package com.polymorphism;

public class ANROverride {

	public static void main(String[] args) {

		ANROverride anr = new ANROverride();

		anr.annapurnaStudios("Sai");

	}

	int annapurnaStudios(int a) {

		System.out.println("Annapurna Studios with penkulu");

		return a;
	}

	String annapurnaStudios(String b) {

		this.annapurnaStudios(1);

		System.out.println("Akkineni banner with black and white");

		return b;
	}

}
