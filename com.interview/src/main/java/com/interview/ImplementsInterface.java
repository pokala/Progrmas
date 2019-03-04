package com.interview;
import java.util.ArrayList;
import java.util.List;


public class ImplementsInterface{
	
//	public void test()
//	{
//		System.out.println("inside test method");
//	}
//	
//	public void test1()
//	{
//		System.out.println("inside test1 method");
//	}
//	
//	public void method()
//	{
//		System.out.println("inside method");
//	}
	
	public static void main(String[] args)
	{
//		TestInterface ti= new ImplementsInterface();
//		ti.test();
//		ImplementsInterface ii= new ImplementsInterface();
//		ii.method();
		TestInterface ti;
		ti=() -> System.out.println("Inside TestInterface");
		
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  

	}
}
