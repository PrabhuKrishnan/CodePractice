package com.java.string.practice;

public class findDuplicateCharsInStingUsingToCharArray {

	public static void main(String[] args) {


		String s = "Geeks for Geeks";
		int count;
		
		char[] c = s.toCharArray();
		System.out.println("Char Array Lenght: " + c.length);

		for(int i=0;i<c.length;i++)
		{

			count=1;
			for(int j=i+1;j<c.length;j++)
			{
				
				if(c[i]==c[j] && c[i] != ' ')
				{
					count++;
					c[j]='0';
				}
			}

			if(count > 1 && c[i] != '0')  
				System.out.println(c[i]  +" " + count);  
		}

		

	}

}
