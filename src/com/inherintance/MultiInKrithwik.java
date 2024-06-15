package com.inherintance;

public class MultiInKrithwik extends MultiInNaveen {

	public static void main(String[] args) {

		MultiInKrithwik mk = new MultiInKrithwik();
		
		System.out.println(mk.c);

		mk.oddNumbersSquare();

	}

	void oddNumbersSquare() {

		super.evenNumbersSquare();

		int num = 10;
		int sum = 0;
		int i = 1;

		while (i <= num) {
			if (!(i % 2 == 0)) {
				sum = sum + (i * i);
			}
			i++;
		}
		System.out.println("Sum of Odd numbers square up to " + num + " : " + sum);
	}
}
