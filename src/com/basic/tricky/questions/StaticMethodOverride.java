package com.basic.tricky.questions;

public class StaticMethodOverride extends Parent{

	/*
	  No, We cannot Override a static method in Java. Unlike Overloading of static
	  method we cannot do overriding. When we declare a method with same signature
	  and static in both Parent and Child class then it is not considered as Method
	  Overriding as there will not be any Run-time Polymorphism happening
	  
	  When the Child class also has defined the same static method like Parent class, 
	  then the method in the Child class hides the method in the Parent class. 
	  In the below code we can see that we are having a static display() method in both Parent and Child class.
	 
	*/
	
	public static void display()
    {
        System.out.println("Welcome to Child class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assign Child class object to Parent reference
        Parent pc = new StaticMethodOverride();
        pc.display();
	}
}

	class Parent 
	{
		public static void display()
		{
			System.out.println("Welcome to Parent Class");
		}
	}
