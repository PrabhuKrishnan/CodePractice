package com.java.string.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class stringToArrayUsingLoop
{

	//string to array conversion using loop and HashSet
	public static String[] convertStringArray(Set<String> strInput)
	{

		String[] stringArray = new String[strInput.size()];

		int index=0;
		for(String s: strInput)
		{
			stringArray[index++]=s;
		}

		return stringArray;

	}

}


public class StringToArrayUsingLoops {


	public static void main(String[] args) {

		/*
		  1.Add the str into the HashSet using the Arrays.aslist() method
		  2.Pass that hasset object to function
		  3.Then create a new empty string array with the string lenght
		  4.Use the for-each loop and copy the data from set to srting array 
		 */



		String str ="Geeks for Geeks";

		Set<String> stringSet = new HashSet<String>(Arrays.asList(str));

		System.out.println("String in the set: " + stringSet);

		String[] data = stringToArrayUsingLoop.convertStringArray(stringSet);

		System.out.println(Arrays.toString(data));



		//stringToArrayUsingLoop.convertStringArray(input);



		
	}


}
