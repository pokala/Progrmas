package com.interview;

public class Arm {
	 public static void main(String[] args)
	 {
		 int n=153;
		 int arm=0;
		 int rem;
		 int temp=n;
		 while(temp!=0)
		 {
			 rem= temp%10;
			 arm= arm+(rem * rem * rem);
			 System.out.println(arm);
			 temp=temp/10;
		 }
		 if(n==arm)
		 {
			 System.out.println("given num is arm");
		 }
	 }
	

}
