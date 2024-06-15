package com.trai;

public interface Sim {
	
	public static final double SAR = 1.8;
	
	String call(int reciverNumber);
	
	boolean sendSMS(int balance);
	
	String data(String typeOfConnection);

}
