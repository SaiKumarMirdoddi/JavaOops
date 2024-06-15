package com.inherintance;

public class SingleInNagesh {
	int x = 10;

	public static void main(String[] args) {

		SingleInNagesh si = new SingleInNagesh();
		int a = 200;
		int b = 15;
		int c = a * b;
		si.x = 10;
		System.out.println(c);
		si.method1();
		
		System.out.println(" ");
		
		si.method3();
	}

	void method1() {

		this.method2();
		int num = 4;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}
	}

	void method2() {
		int Num = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(Num + "x" + i + " = " + (Num * i));
		}
		System.out.println(" ");
	}
	int method3() {
		
		int num = 11;
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}
		return sum;
	}
}
