package com.basic.logics;

public class StringObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objects are created in String Constant Pool inside Heap memory
		//Multiple reference, same memory
		String s1="Hello World";
		String s2="Hello World";
		String s3=s1;

		//Objects Created inside Heap memory
		//Multiple reference, multiple memory
		String n1=new String("Hello World");
		String n2=new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(n1==n2);
		System.out.println(s1==n1);
		
	}

}
