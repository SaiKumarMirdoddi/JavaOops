package com.abstractclassimplentation;

import com.interfacedemo.AbstractImplementsInterfaceDemo;

public abstract class AbstractClass implements AbstractImplementsInterfaceDemo {

	@Override
	public void m1() {
		System.out.println("Im m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Im m2 method");

	}

	public AbstractClass() {
		System.out.println("Im constracture");

	}

}
