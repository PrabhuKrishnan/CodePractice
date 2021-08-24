package com.java.string.practice;

public class AddCharsToString {

	public static void main(String[] args) {


		/*
		 * String s = "GeeksorGeeks"; char two = 'f';
		 * 
		 * System.out.println(s.substring(0, 5)+two+s.substring(5));
		 * 
		 * //System.out.println(blogName.substring(5));
		 */

		String str = "Hi Welcome to Tutorialspoint";
		int len=str.length();
		//char[] vol= {'a','e','i','o','u'};
        
		for(int i=0;i<str.length();i++)
		{
			
			 if(str.charAt(i)=='a' | str.charAt(i)=='e' | str.charAt(i)=='i' |str.charAt(i)=='o' | str.charAt(i)=='u' )
			 {
				 System.out.print(str.charAt(i));
				 
				 
			 }
		}
		
		
		
		
		
		
}
}