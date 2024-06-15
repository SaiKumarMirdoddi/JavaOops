package com.seconddemoencapsulation;

import com.encapsulationdemo.ClassOne;

public class EncapsDemo extends ClassOne {
	
	public static void main(String[] args) {
		
		ClassOne co = new ClassOne();
		
		System.out.println(co.name);
		
		System.out.println(ClassOne.name1);
	}

}
