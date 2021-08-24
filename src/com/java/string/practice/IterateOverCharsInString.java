package com.java.string.practice;

public class IterateOverCharsInString {

	public static void main(String[] args) {

		String inputString = "Prabhu Krisnan";
		System.out.println("String Lenght: " + inputString.length());
		
		char[] c = inputString.toCharArray();
		System.out.println("Char Array Size: " + c.length);
		
		for(int i=0;i<c.length;i++)
		{
			  // System.out.println(c[i]);
			   //System.out.println(inputString.charAt(i));
			char o = inputString.charAt(i);
			System.out.println(o);
		}
		
	}

}

