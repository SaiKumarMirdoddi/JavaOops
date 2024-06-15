package com.inherintance;

public class HybrideNC extends HybrideNagarjuna {

	public static void main(String[] args) {

		HybrideNC nc = new HybrideNC();
		
		nc.ncConstructionsTwo();
	}

	void ncConstructions() {
		System.out.println("Annapurna Studios with buildin");
	}

	void ncConstructionsTwo() {

		super.nagarjunaConstructionsTwo();

		this.ncConstructions();

		System.out.println("Akkineni banner with 4k");
	}

}
