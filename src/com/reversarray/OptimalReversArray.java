package com.reversarray;

public class OptimalReversArray {
	public static void main(String[] args) {
		int[] Array = {1,2,3,4};
		
		int Start = 0;
		int End = Array.length-1;
		int temp;
		
		while(Start<End) {
			 temp = Array[Start];
			 Array[Start] = Array[End];
			 Array[End] = temp;
			 Start++;
			 End--;
		}
		for(int i=0; i<Array.length; i++) {
			System.out.print(Array[i]);
			System.out.print(" ");
		}
	}
}


