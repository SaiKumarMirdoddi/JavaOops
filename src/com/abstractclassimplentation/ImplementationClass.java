package com.abstractclassimplentation;

public class ImplementationClass extends AbstractClass {

	@Override
	public void m3() {

		System.out.println("Im m3 method");

	}

	public static void main(String[] args) {

		AbstractClass abc = new ImplementationClass();

		abc.m1();
		abc.m2();
		abc.m3();

	}

	
	
}
