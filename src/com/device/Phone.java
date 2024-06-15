package com.device;

import com.trai.Sim;

import com.typeofsim.Jio;

public class Phone {

	public static void main(String[] args) {

		Sim sm = new Jio();

		System.out.println(sm.call(10));
		System.out.println(sm.sendSMS(0));
		System.out.println(sm.data("5G"));
	}

}
