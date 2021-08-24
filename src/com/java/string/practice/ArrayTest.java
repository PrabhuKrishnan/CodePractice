package com.java.string.practice;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] myArray = {2,5,0,4,2,7,0,0,1,9,4};
		int len =myArray.length;
		
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<myArray.length;j++)
			{
				if(myArray[i]<myArray[j])
				{
				     System.out.println(myArray[i]);
				}
			}
		}
		
		
		
	}
}
