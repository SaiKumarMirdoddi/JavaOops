package com.polymorphism;

public class NCOverride extends ANROverride {

	public static void main(String[] args) {

		NCOverride nc = new NCOverride();

		nc.annapurnaStudios("ram");
		//nc.annapurnaStudios("ram");
	}

	@Override
	String annapurnaStudios(String a) {
		
		super.annapurnaStudios("sai");

		System.out.println("Akkineni banner with 4k");
		System.out.println("Annapurna Studios with glass");

		return a;
	}

}
