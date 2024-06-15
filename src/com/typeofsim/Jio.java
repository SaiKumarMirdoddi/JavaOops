package com.typeofsim;

import com.trai.Sim;

public class Jio implements Sim{

	@Override
	public String call(int reciverNumber) {
		if(reciverNumber>5) {
		return "call connected via Jio";
		}
		else {
		return "call disconnected";
	}
  }
	@Override
	public boolean sendSMS(int balance) {
	     boolean result = balance==1;
		return result;
	}

	@Override
	public String data(String typeOfConnection) {

		return typeOfConnection+" data provided by Jio";
	}

}
