package com.interview;

public class PrimeNum {
	
	public static void main(String[] args)
	{
		int num=100,count;
		
		for(int i=0;i<num;i++)
		{
			count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
				System.out.println(i);
		}
	}

}
