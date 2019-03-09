package com.Java;

public class ConstructorExam {
	
	ConstructorExam()
	{
		
		System.out.println("Inside the default constructor");
	}
	
	ConstructorExam(int a)
	{
		System.out.println("Inside the parameterized constructor");
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		ConstructorExam ce= new ConstructorExam();
		ConstructorExam ce1= new ConstructorExam(2);
	}
	
}
