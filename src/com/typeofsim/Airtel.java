package com.typeofsim;

import com.trai.Sim;

public class Airtel implements Sim {

	@Override
	public String call(int reciverNumber) {
		if(reciverNumber>0) {
			return "call conected via Airtel";
		}
		return "call disconnected";
	}

	@Override
	public boolean sendSMS(int balance) {
	     if(balance ==0) {
	    	 return true;
	     }
		return false;
	}

	@Override
	public String data(String typeOfConnection) {

		return typeOfConnection+" data provided by Airtel";
	}

}
