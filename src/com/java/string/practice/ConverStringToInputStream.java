package com.java.string.practice;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

class convertStringToInputStreamTest
{
	
	
	public static void stringToInputStreamConvestion(String str) throws IOException
	{
		 
		
		InputStream stream = new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8")));		
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		
		String s= br.readLine();
		
		while(s !=null)
		{
		    System.out.println("From Byte Stream: "+str);
			s= br.readLine();
		}
		
		
		
	}

}
public class ConverStringToInputStream {

	public static void main(String[] args) throws IOException {
		
		String str = "Geeks for Geeks";
		
		convertStringToInputStreamTest.stringToInputStreamConvestion(str);

	}

}
