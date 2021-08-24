package com.java.string.practice;

public class FIBNubmer {
	
	public static void main(String[] args) {
		
		
		int n1=0,n2=1,n3=0,count=10,i;
		System.out.print(n1+" "+n2);
		
		for( i=2;i<count;i++)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;  //0,1,2  n1=0,n2=1, n3=1,   n1=n2, n2=n3 , n3=n1+n2
			n2=n3;
		}
				
		
		
	}

}
