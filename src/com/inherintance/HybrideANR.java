package com.inherintance;

public class HybrideANR {

	public static void main(String[] args) {

		HybrideANR anr = new HybrideANR();
		
		anr.anrConstructionsTwo();

	}

	void anrConstructions() {

		System.out.println("Annapurna Studios with rekulu");

	}

	void anrConstructionsTwo() {

		this.anrConstructions();

		System.out.println("Akkineni banner with black and white");

	}
}