package com.java.string.practice;


public class PrintUniqueWordsInString {

	public static void main(String[] args) {
          
		String s= "welcome to Geeks for Geeks";
		String[] data = s.split(" ");
        int count=0;
		 
		 for(int i=0;i<data.length;i++)
		 {
			 count =1;
		   for(int j=i+1;j<data.length;j++)
		   {
			   if(data[i].equalsIgnoreCase(data[j]))
			   {
				   count++;
				   data[j]=" ";
				   
				   
			   }
		   
		   }
		   
		   if(count==1 && data[i]!=" ")
		   {
			   System.out.println(data[i]);
		   }
		   
		   }
			 
			 
		 }
		 
		
	}

