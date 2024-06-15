package com.inherintance;

public class HerarchialInNagesh {

	public static void main(String[] args) {

		HerarchialInNagesh hn = new HerarchialInNagesh();

		hn.factorialOfNumber();
	}

	void factorialOfNumber() {
         
		this.numberFactorial();
		
		int num = 4;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Number " + num + " Factorial : " + fact);
	}

	void numberFactorial() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Number " + num + " Factorial : " + fact);
	}
}
