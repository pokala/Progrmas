package com.interview;

public class MethodOverridingTest {
	
	public static void main(String[] args)
	{
		Animal a= new Dog();
		a.eat();
	    
//		a.sound();
		a.i=15;
		System.out.println(a.i);
		
		Dog d= new Dog();
		d.sound();
		System.out.println(d.i);
		
		Animal aa= (Animal) d;
		aa.eat();
	}
}
