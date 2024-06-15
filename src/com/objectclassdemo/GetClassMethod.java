package com.objectclassdemo;

import java.lang.reflect.Method;

public class GetClassMethod {

	public static void main(String[] args) {

		A a1 = new A();

		A a2 = new A();

		A[] aobject = { a1, a2 };

		Object b = aobject[0];
		System.out.println(b);

		Object j = new Employee();

		j.getClass();

		Class<? extends Object> ob = j.getClass();

		System.out.println(ob);

		ob.getMethods();

		Method[] methods = ob.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}