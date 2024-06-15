package com.inherintance;

public class HybrideNagarjuna extends HybrideANR {

	public static void main(String[] args) {

		HybrideNagarjuna nag = new HybrideNagarjuna();

		nag.nagarjunaConstructionsTwo();

	}

	void nagarjunaConstructions() {

		System.out.println("Annapurna Studios with Iron sheds");
	}

	void nagarjunaConstructionsTwo() {

		super.anrConstructionsTwo();

		this.nagarjunaConstructions();

		System.out.println("Akkineni banner with color");
	}

}
