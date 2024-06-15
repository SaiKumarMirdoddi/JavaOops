package com.inherintance;

public class SingleInNaveen extends SingleInNagesh {

	public static void main(String[] args) {

		SingleInNaveen sn = new SingleInNaveen();

		sn.method1();

		System.out.println(" ");

		sn.multiplicationTable();

	}

	void multiplicationTable() {

		super.method3();
		
		System.out.println(" ");

		int num = 7;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}

	}
}
