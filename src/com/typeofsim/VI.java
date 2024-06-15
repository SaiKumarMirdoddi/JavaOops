package com.typeofsim;

import com.trai.Sim;

public class VI implements Sim {

	@Override
	public String call(int reciverNumber) {
		if(reciverNumber>10) {
			return "call connected via VI";
		}
		else {
		return "call disconnected";
	}
}

	@Override
	public boolean sendSMS(int balance) {
		boolean result = balance==0;
		return result;
	}

	@Override
	public String data(String typeOfConnection) {
	    
		return typeOfConnection+" data provided by VI";
	}

}
