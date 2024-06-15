package com.inherintance;

public class HerarchialInShravan extends HerarchialInNagesh {

	public static void main(String[] args) {

		HerarchialInShravan hs = new HerarchialInShravan();

		hs.sumOfNaturalNumbers();
	}

	void sumOfNaturalNumbers() {

		super.numberFactorial();

		int num = 5;
		int sum = 0;
		int i = 1;

		do {
			sum = sum + i;
			i++;
		} while (i <= num);
		System.out.println("Sum of " + num + " natural numbers : " + sum);

	}

}
