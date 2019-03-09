package com.interview;

import java.util.Arrays;

public class InfoStretch3 {
	
	/**
	 * Write a program to check given strings are anagrams or not
	 * 
	 * Stirng1 = "john"
	 * String2 = "nohj"
	 * 
	 * What is Anagram?
	 * An anagram of a string is another string that contains same characters.
	 * only the order of characters can be different.
	 * For example, “abcd” and “dabc” are anagram of each other.
	 * 
	 * @author Sarath Chandra Tadepalli.
	 * 
	 */
	
	public static void main(String[] args)
	{
		String str1="john",str2="nohjr";
		if(InfoStretch3.areAnagram(str1.toCharArray(),str2.toCharArray()))
			System.out.println("Given strings are Anagrams");
		else
			System.out.println("Given strings are not Anagrams");
	}
	static boolean areAnagram(char[] str1,char[] str2)
	{
		int n1=str1.length, n2=str2.length;
		
		if(n1 != n2)
			return false;
		
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		System.out.println(str1+ "   "+str2);
		for(int i=0; i<n1;i++)
			if(str1[i] != str2[i])
				return false;
		
		return true;
	}

}
