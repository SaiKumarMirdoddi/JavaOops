package com.abstraction;

public class InfofyCompany extends AlightCompany {

	public static void main(String[] args) {
		InfofyCompany ic = new InfofyCompany();
		ic.bitcemyDetails();
		ic.alightCompany();
		ic.infofyCompany();
	}

	@Override
	void infofyCompany() {

		System.out.println("emplID :" + "03");
		System.out.println("name :" + "SHIVA");
		System.out.println("company :" + "Infofy");
	}

}
