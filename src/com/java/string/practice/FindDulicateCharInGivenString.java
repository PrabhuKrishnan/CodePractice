package com.java.string.practice;

public class FindDulicateCharInGivenString {

	public static void main(String[] args) {

		String input = "beautiful beach zz";
        int count=0;
		char[] srtChar = input.toCharArray();

		for(int i=0;i<input.length();i++)  
		{
			count=1;
			for(int j=i+1;j<input.length();j++)  
			{
				if(srtChar[i]==srtChar[j] && srtChar[i] !=' ')   
				{
				  count++;
			      //System.out.println(srtChar[j]);
			      break;
				}
			}
			
			if(count>1 && srtChar[i]!=' ')
			{
				//System.out.println("Duplicate Chars: " +srtChar[i] +" is repeated "+ count+" times" );
				
				System.out.println(srtChar[i] + " " + count);
			}
		}

		

	}

}
