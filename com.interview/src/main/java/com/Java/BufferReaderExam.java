package com.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderExam {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value");
		String str= br.readLine();
		System.out.println(str);
		int i =Integer.parseInt(br.readLine());
		System.out.println(i);
	}
	
}
