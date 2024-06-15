package com.inherintance;

public class MultiInNaveen extends MultiInNagesh {

	int x = 150;
	int y = 147;
	int z = x + y;

	public static void main(String[] args) {

		MultiInNaveen mi = new MultiInNaveen();

		System.out.println(mi.z);

		mi.evenNumbersSquare();

	}

	void evenNumbersSquare() {

		super.m1();

		int num = 7;
		int sum = 0;
		int i = 1;

		do {
			if (i % 2 == 0) {
				sum = sum + (i * i);
			}
			i++;
		} while (i <= num);
		System.out.println("Sum of even numbers square up to " + num + " : " + sum);
	}



}
