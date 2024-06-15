package com.polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading mo = new MethodOverLoading();

		int result = mo.compiledPoly(1, 2);

		System.out.println(result);
	}

	int compiledPoly(int a) {

		System.out.println("First argument");

		return a;
	}

	int compiledPoly(int a, int b) {

		System.out.println("Second argument");

		return b;
	}

}
