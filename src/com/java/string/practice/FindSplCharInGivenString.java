package com.java.string.practice;

public class FindSplCharInGivenString {

	public static void main(String[] args) {

		String s ="123#@84#$";
		String[] d= s.split("[#,@,$]");
		for(String value: d)
		{
			System.out.print(value);
		}
		 
		 

		
		
	}

}
