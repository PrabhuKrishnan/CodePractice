package com.java.string.practice;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {

		
		String[] words = {"ace", "boom", "crew", "dog", "eon","crew"};  
		
		HashSet<String>  data = new HashSet<String>(Arrays.asList(words));
		
		System.out.println( data.toString());
		
	
	
	}

}
