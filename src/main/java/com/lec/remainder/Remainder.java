package com.lec.remainder;

public class Remainder {

	public Remainder() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] remainCalc (int num1, int num2, int num3) {
		int[] result = new int[2];
		
		result[0] = num1 % num3;
		result[1] = num2 % num3;
		
		return result;
	}
}
