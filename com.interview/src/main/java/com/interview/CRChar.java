package com.interview;

public class CRChar {
	
	
	public static void main(String[] args)
	{
		String str="aabbcccccddaacaaaaaabcsssssss";
		char[] chs=str.toCharArray();
		char acc,cRc = 0;
		int count=0, maxCount=0;
		acc=chs[1];
		for(char c: chs)
		{
			if(acc==c)
			{
				count++;
			}else
			{
				acc=c;
				count=1;
			}
			if(count> maxCount)
			{
				maxCount=count;
				cRc=acc;
			}
			
		}
		System.out.println(cRc+" "+maxCount);
	}

}
