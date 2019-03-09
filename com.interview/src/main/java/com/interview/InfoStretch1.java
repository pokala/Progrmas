package com.interview;

public class InfoStretch1 {
	
	/**
	 * Move all special characters to the end of string.
	 * Input:!@#$%^&*sarath
	 * Output:sarath!@#$%^&*
	 * 
	 * @author Sarath Chandra Tadepalli.
	 * 
	 */
	
	public static void main(String[] args)
	{
		String str="!@#$%^&*sarath";
		char[] chrs= str.toCharArray();
		for(int i=0;i<chrs.length;i++)
		{
			if(Character.toString(chrs[i]).matches("[^a-z]"))
			{
				for(int j=0;j<chrs.length-1;j++)
				{
					if(Character.toString(chrs[j]).matches("[^a-z]"))
					{
						char temp;
						temp=chrs[j];
						chrs[j]=chrs[j+1];
						chrs[j+1]=temp;
					}
				}
			}
		}
		System.out.println(chrs);
	}
}
