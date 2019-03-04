package com.interview;

public class Pyramid {
	
	public static void main(String[] args)
	{
		int rows=10;
		for (int i=1; i<=rows;i++)
		{
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
			for(int j=1; j<=i;j++)
				System.out.print(j);
			for(int k=i-1; k>=1; k--)
				System.out.print(k);
			System.out.println();
		}
		for (int i=rows-1; i>=1;i--)
		{
			for(int space=rows-i;space>=1;space--)
				System.out.print(" ");
			for(int j=1; j<=i;j++)
				System.out.print(j);
			for(int k=i-1; k>=1; k--)
				System.out.print(k);
			System.out.println();
		}
		
	}
}
