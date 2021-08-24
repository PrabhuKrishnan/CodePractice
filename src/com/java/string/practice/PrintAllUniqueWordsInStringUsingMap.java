package com.java.string.practice;

import java.util.HashMap;
import java.util.Map;

public class PrintAllUniqueWordsInStringUsingMap {

	public static void main(String[] args) {
		
	
		
		String s= "welcome to Geeks for Geeks";
		String[] words = s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	 
		 for(String word: words)
		 {
			 
			 if(map.containsKey(word))
			 {
				 map.put(word, map.get(word)+1); //key , value ==> key =word, value =no of times it repeated 
			 }
			 else
			 {
				 map.put(word, 1);
			 }
		 }
		 
		 for(Map.Entry<String, Integer> data :map.entrySet())
		 {
			  if(data.getValue()==1)
			  {
				  System.out.println(data.getKey());
			  }
		 }
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 

	}

}
