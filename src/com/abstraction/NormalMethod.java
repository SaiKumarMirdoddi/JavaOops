package com.abstraction;

public class NormalMethod {

	int a;
	int b;

	static int x;
	static int y;

	public static void main(String[] args) {

		NormalMethod nm = new NormalMethod();
		nm.a = 12;
		nm.b = 27;
		System.out.println(nm.a + nm.b);

		x = 17;
		y = 19;
		System.out.println(x + y);

	}

}
