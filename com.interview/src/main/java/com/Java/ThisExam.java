package com.Java;

public class ThisExam {

	static void method1()
	{
		
	}
	static void method2()
	{
		method1();
	}
	
	void method3()
	{
		
	}
	void method4()
	{
		this.method3();
	}
	
}
