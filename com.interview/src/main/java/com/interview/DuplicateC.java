package com.interview;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateC {

	public static void main(String[] args)
	{
		char[] chars="hello 123. hello 124.".toCharArray();
		
		String str=" hello world hello world hello";
		String[] strings=str.split(" ");
		HashMap<Character,Integer> val= new HashMap();
		for(int i=0; i<chars.length;i++)
		{
			if(val.get(chars[i]) != null)
				val.put(chars[i], val.get(chars[i])+1);
			else
				val.put(chars[i], 1);
		}
		System.out.println(val);
		Set<Character> chas= val.keySet();
		int max=0;
		char maxch=0;
		for(char ch: chas)
		{
			if(ch!=' '&&ch!='.')
			{
				if(val.get(ch)>1)
				{
					System.out.println(ch);
				}
			}
			if(val.get(ch)>max)
			{
				max= val.get(ch);
				maxch=ch;
			}
		}
		System.out.print("maximum repetate char: "+maxch);
	}
}
