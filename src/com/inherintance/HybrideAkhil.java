package com.inherintance;

public class HybrideAkhil extends HybrideNagarjuna {

	public static void main(String[] args) {

		HybrideAkhil ak = new HybrideAkhil();

		ak.akhilConstructionsTwo();

	}

	void akhilConstructions() {

		System.out.println("Annapurna Studios with glass");
	}

	void akhilConstructionsTwo() {

		super.nagarjunaConstructionsTwo();

		this.akhilConstructions();

		System.out.println("Akkineni banner with VFX");
	}

}
