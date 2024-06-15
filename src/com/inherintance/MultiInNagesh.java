package com.inherintance;

public class MultiInNagesh {
	
	int a = 21;
	int b = 11;
	int c = a * b;

	public static void main(String[] args) {

		MultiInNagesh mn = new MultiInNagesh();

		System.out.println(mn.c);

		mn.m1();
	}

	void m1() {

		int num = 5;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + (i * i);
		}
		System.out.println("Sum of " + num + " natural numbers square : " + sum);
	}

}
