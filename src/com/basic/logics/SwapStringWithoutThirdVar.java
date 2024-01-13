package com.basic.logics;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "one";
		String b = "two";

		a = a + b;
		b = a.substring(0, (a.length() - b.length()));
		a = a.substring(b.length());

	    System.out.println("After swap:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
