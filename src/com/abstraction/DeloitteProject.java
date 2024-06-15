package com.abstraction;

public class DeloitteProject extends IBMproject {

	@Override
	void raitionDetaisl() {
		System.out.println("Ration details : " + "FCI147852369");
	}

	public static void main(String[] args) {

		InfosysProject ifp = new DeloitteProject();
		ifp.aadharDetails(1);
		ifp.PANdetails();
		ifp.raitionDetaisl();

	}

}
