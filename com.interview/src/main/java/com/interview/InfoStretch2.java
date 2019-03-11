package com.interview;

public class InfoStretch2 {
	
	/**
	 * Write a program to find count of Vowels and Consonants in a given string.
	 * Input: "my name is rob form india"
	 * 
	 * 
	 * @author Sarath Chandra Tadepalli.
	 * 
	 */
	public static void main(String[] args)
	{
		String str="my name is rob form india";
		char[] chrs=str.toCharArray();
		int vowels=0,consonants=0;
		for(int i=0;i<chrs.length;i++)
		{
			if(Character.toString(chrs[i]).matches("[aeiou]"))
			{
				++vowels;
			}
			else if(chrs[i]> 'a' && chrs[i] < 'z' ){
				++consonants;
			}
		}
		System.out.println("Vowel : "+vowels);
		System.out.println("Consonants : "+consonants);
		
	}

}
