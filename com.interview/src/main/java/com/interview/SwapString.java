package com.interview;

public class SwapString {

	public static void main(String[] args)
	{
		String str1="Hello",str2="world",temp;
		temp=str1;
		str1=str2;
		str2= temp;
		
		System.out.println(str1+ "  "+str2);
	}
	
}
