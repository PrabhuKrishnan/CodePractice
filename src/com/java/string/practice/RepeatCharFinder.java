package com.java.string.practice;

public class RepeatCharFinder {

	public static void main(String[] args) {

		String s ="aabcdeefggh";
		int count =0;
		char[] c=s.toCharArray();

		for(int i=0;i<s.length();i++)
		{
			count =1;
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j])
				{
					count++;
					System.out.print(c[j]);
					break;
				}

			}

			if(count >1)
			{
				System.out.println(c[i]);
			}
		}

	}

}
