package com.polymorphism;

public class NagarjunaOverride extends ANROverride {

	public static void main(String[] args) {

		NagarjunaOverride nag = new NagarjunaOverride();

		nag.annapurnaStudios("sai");
	}

	@Override
	String annapurnaStudios(String a) {
		
		super.annapurnaStudios("charan");

		System.out.println("Annapurna Studios with Iron sheds");

		return a;
	}

}
