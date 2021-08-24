package com.java.string.practice;

import java.util.Arrays;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		String data ="prabhu krishnan";
		
		String[] s = data.split(" ");
		int index=0;
		
		for(String value : s)
		{
			s[index++] = value;
		}
		
		System.out.println(Arrays.toString(s));
		
	}

}
