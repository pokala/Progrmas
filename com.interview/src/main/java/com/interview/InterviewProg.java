package com.interview;
import java.util.Arrays;


public class InterviewProg {
	
	
	public static void divisibleby3or5(int i)
	{
		if(i % 3 ==0 && i % 5 ==0)
		{
			System.out.println("Capgemini");
		}
		else if(i%3 == 0)
		{
			System.out.println("Cap");
		}
		else if(i%5 == 0)
		{
			System.out.println("Gemini");
		}
		else
		{
			System.out.println(i);
		}
	}
	public static void palindrome(String str)
	{
		int length = str.length();
		 String rev="";
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}
	
	public static int recursion(int start, int max)
	{
		if(start <= max)
		{
			System.out.print(start+" ");
            return(recursion(++start,max));
		}
		return 1;
	}
	public static int factorial(int i)
	{
		if(i==1)
			return 1;
		else
			return (i*factorial(i-1));
	}
	
	public static void kthLargeNumber(int[] arr, int i)
	{
		Arrays.sort(arr);
		System.out.println();
		System.out.println(arr[i-1]);
		
	}
	public static void main(String[] args)
	{
		int ravi = Integer.parseInt("8");
		for(int i=1;i<=50;i++)
			InterviewProg.divisibleby3or5(i);
		InterviewProg.palindrome("madam");
		InterviewProg.recursion(1, 10);
		InterviewProg.kthLargeNumber(new int[]{4,7,1,45,23},4);
		System.out.println(InterviewProg.factorial(6));
	}

}
