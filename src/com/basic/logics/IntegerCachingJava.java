package com.basic.logics;

public class IntegerCachingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer Caching range is -128 to 127
		//if you provide number which is out of range then it will not match
		
		Integer int1=150;
		Integer int2=150;
		
		if(int1==int2) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
	}

}
