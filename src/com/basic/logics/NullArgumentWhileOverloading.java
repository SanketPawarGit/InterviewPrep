package com.basic.logics;

public class NullArgumentWhileOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(null);
	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {
		System.out.println("String Argument");
	}

}
