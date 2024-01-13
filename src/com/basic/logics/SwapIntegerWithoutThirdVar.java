package com.basic.logics;

public class SwapIntegerWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
	    int b = 20;       
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("After swap:");
	    System.out.println("a value: "+a);
	    System.out.println("b value: "+b);

	}

}
