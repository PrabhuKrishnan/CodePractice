package com.java.string.practice;

public class PrintQutationMarkInString {

	public static void main(String[] args) {

		String str ="Geeks? for ? Gee?ks@";
		
		System.out.println(str);
		
		char[] c = str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(c[i] !='?' && c[i]!='@')
			{
				System.out.print(c[i]);
				
				 
			}
		}
		
	}

}

