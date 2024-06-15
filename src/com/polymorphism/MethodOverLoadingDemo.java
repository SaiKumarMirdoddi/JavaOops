package com.polymorphism;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {

		int result = MethodOverLoadingDemo.compiledPoly(1,2);

		System.out.println(result);

	}

	static int compiledPoly(int a) {

		System.out.println("Java");

		return a;

	}

	static int compiledPoly(int a, int b) {

		System.out.println("Python");

		return b;
	}

}
