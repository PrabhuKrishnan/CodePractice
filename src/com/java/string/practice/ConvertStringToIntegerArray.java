package com.java.string.practice;

import java.util.Arrays;

public class ConvertStringToIntegerArray {

	public static void main(String[] args) {

		/*
		  
		  Given: String array  to int array
		  1.Int array with the give string lenght 
		  2.Iterate the string array and add it int array, use parseint method of integer calss
		  
		 */
		
		
		String[] str = {"123","345","678"};
		int size = str.length;
		
		int[] a =  new int[size];
		
		for(int i=0;i<size;i++)
		{
			//a[i]=Integer.parseInt(str[i]);
			
			a[i]=Integer.valueOf(str[i]);
		}
		
		System.out.println(Arrays.toString(a));
		
		
	 
		 
		
	}

}
