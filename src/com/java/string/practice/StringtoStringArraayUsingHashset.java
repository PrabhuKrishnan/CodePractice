package com.java.string.practice;

import java.util.Arrays;
import java.util.HashSet;

class stringArrayConversionUsingHashSet
{

	static String[] convertStringArray(HashSet<String> dataSet) 
	{
		
		String[] stringArray = new String[dataSet.size()];
		stringArray= dataSet.toArray(stringArray);
		return stringArray;
	}

}

public class StringtoStringArraayUsingHashset {


	public static void main(String[] args) {


		String str ="Geeks for Geeks";

		HashSet<String> dataSet =  new HashSet<String>(Arrays.asList(str));
		System.out.println("Data from HashSet: " + dataSet);


		String[] stringArray =  stringArrayConversionUsingHashSet.convertStringArray(dataSet);

		 System.out.println(Arrays.toString(stringArray));

	}





}
