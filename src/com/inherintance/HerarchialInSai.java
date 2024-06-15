package com.inherintance;

public class HerarchialInSai extends HerarchialInNagesh {

	public static void main(String[] args) {

		HerarchialInSai is = new HerarchialInSai();

		is.sumOfEvenNumbers();
	}

	void sumOfEvenNumbers() {

		super.factorialOfNumber();

		int num = 10;
		int sum = 0;
		int i = 1;

		while (i <= num) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum of even numbers up to " + num + " : "  + sum);
	}
}
