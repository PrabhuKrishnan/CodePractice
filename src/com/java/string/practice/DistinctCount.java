package com.java.string.practice;

public class DistinctCount {

	public static void main(String[] args) {


		String str="Geeks for Geeks";
		 char c=' ';
		 int count=0;

		for (int i = 0; i < str.length(); i++) 
		{ 
			
			c =str.charAt(i);
			count=1;
			for(int j=i;j<str.length();j++)
			{
				if(c==str.charAt(j))
				{
					 count++;
				}
			}
			
			if(count>1)
			{
				System.out.println(i+ " " + count);
			}
		}
		
		}


	}




