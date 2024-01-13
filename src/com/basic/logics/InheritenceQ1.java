package com.basic.logics;


public class InheritenceQ1 {

	public void m1() {
		System.out.println("m1 of Parent");
	}
	
	public static void main(String[] args) {		
		InheritenceQ1 iq=new A();
		iq.m1();
		//iq.m2(); //--> Compile time error because method is not present in class InheritenceQ1	
	}
}

class A extends InheritenceQ1{
	public void m1() {
		System.out.println("m1 of Child");
	}
	public void m2() {
		System.out.println("m2 of Child");
	}
	public void m3() {
		System.out.println("m3 of Child");
	}
}
