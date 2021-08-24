package com.java.string.practice;

public class StringConcatAndReverse {

	public static void main(String[] args) {

		 String s1 = "EkSoHwPqU";
		 String s2 = "dJdIqNpQs";
		 String rev="";
		 
		 s2 = s1+s2;
		  
		for(int i=s2.length()-1;i>=0;i--)
		{
		      rev += s2.charAt(i);
		       
			
		}
		System.out.println(rev);
		 
		 
;}

}