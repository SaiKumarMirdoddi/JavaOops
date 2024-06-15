package com.reversarray;

public class NonOptimalReversArray {
	
	public static void main(String[] args) {
		int[] Arr = {1,2,3,4,5};
		
		int [] Brr =new int[Arr.length];
		int j = 0;
		
		for(int i=Arr.length-1; i>=0; i--) {
			Brr[j] = Arr[i];
			j++;
		}
		 printArraydata(Brr);
	}

	   static void printArraydata(int[] Brr) {
		for(int i : Brr) {
		  System.out.println(i);
		}
	}
}

