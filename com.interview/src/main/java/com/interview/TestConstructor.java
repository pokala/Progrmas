package com.interview;

public class TestConstructor {
	int i;
	String str;
	void display()
	{
		System.out.println(i+"   "+str);
	}
	public static void main(String[] args)
	{
		TestConstructor tc=new TestConstructor();
		tc.display();
	}

}
