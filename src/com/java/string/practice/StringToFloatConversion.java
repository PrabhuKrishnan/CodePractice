package com.java.string.practice;

public class StringToFloatConversion {

	public static void main(String[] args) {

		String s="12.2";
		float f=Float.parseFloat(s);
		System.out.println("String to float using parseFloat method: " + f);
		
		//using value of method
		float v = Float.valueOf(f);
		System.out.println("String to float using value method: " + v);
		
		
	}

}
