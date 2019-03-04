package com.interview;

public class ArrayE {
	
	public static void main(String[] args)
	{
		 for(int j=1;j<=9;j++)
		  {
			  String[] Str= new String[]{"abc","abcd","abcde","abcdef","abcdefg","abcdefgh","abcdefghi","abcdefghij","abcdefghijk","abcdefghijkl"};
			  System.out.println("row number is: "+j);
			  for(int i=0; i<j;i++)
			  {
				  System.out.println(Str[i]);
			  }
		  }
	}

}
