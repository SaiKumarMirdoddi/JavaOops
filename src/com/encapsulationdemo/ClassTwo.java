package com.encapsulationdemo;

public class ClassTwo {

	public static void main(String[] args) {

		ClassOne co = new ClassOne();

		System.out.println(co.name);

		System.out.println(ClassOne.name1);

		System.out.println(co.name2);
		
		co.setName3("MBA");

		String name3 = co.getName3();
		System.out.println(name3);
	}
}
