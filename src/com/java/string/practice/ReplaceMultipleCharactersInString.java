package com.java.string.practice;

class ReplaceMultipleCharsFromStringTest
{

	public   static String replaceMethod(String str)
	{
		return str.replace('G', 'S');

	}

	public  static String replacAll(String str)
	{
		//return str.replaceAll("Geeks", "Seeks");


		return str.replaceAll("(.*)geeks(.*)", "AKSHIT SAXENA");

	}

	public static String replaceFirst(String str) 
	{

		return str.replaceFirst("Geeks", "seeks");
	}

}

public class ReplaceMultipleCharactersInString {

	public static void main(String[] args) {

		String orginalString = "Geeks for Geeks";

		String replace = ReplaceMultipleCharsFromStringTest.replaceMethod(orginalString);
		System.out.println(replace);

		String replaceAll  = ReplaceMultipleCharsFromStringTest.replacAll(orginalString);
		System.out.println("Replace Chars using the replaceAll method: "+ replaceAll );

		String replaceFirst  = ReplaceMultipleCharsFromStringTest.replaceFirst(orginalString);
		System.out.println("Replace Chars using the replaceFrist method: "+ replaceFirst );


	}

}
