package com.java.string.practice;

class ConvertStringToStringArray
{
	
  //StringToStringArray Conversion
   public static void convertStringArray(String str)
   {
	   
	   String[] value = str.split(" ");
	   for(String v : value)
	   {
		   System.out.println(v);
	   }
	    
   }


}



public class StringToStringArray {

	public static void main(String[] args) {

	 String input ="Geeks for Geeks";
	 
	 System.out.println();
	 ConvertStringToStringArray.convertStringArray(input);
		
		
	}

}
