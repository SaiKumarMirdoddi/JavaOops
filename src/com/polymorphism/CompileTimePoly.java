package com.polymorphism;

public class CompileTimePoly {

	public static void main(String[] args) {

		CompileTimePoly ct = new CompileTimePoly();

		String result = ct.methodOverLoading("HTML",5);

		System.out.println(result);
	}

	String methodOverLoading(String name) {

		System.out.println("Language is");

		return name;
	}

	String methodOverLoading(String front, int a) {

		System.out.println("Front End language is ");

		return front + a;
	}

}
