package com.java.string.practice;

class StringConcatAndReverseTest
{
	
   public String concatRev(String s1,String s2) 
   {
	     
	   String rev="";
	   String concatString="";
	   concatString = s1 + s2;
	   
	   for(int i=concatString.length()-1;i>=0;i--)
	   {
		   rev += concatString.charAt(i);
	   }
			   
			   
	   return rev;
   }


}

public class PassingStringAsParameter {

	public static void main(String[] args) {
		
		String s1 = "Geeks";
		String s2 ="ForGeeks";
		
		StringConcatAndReverseTest s = new StringConcatAndReverseTest();
		System.out.println(s.concatRev(s1, s2));
		
		
		
	}
	
}
