package com.basic.logics;

public class FactorialNonRecursive {
	   public static void main(String args[]) {
		   int f = 1;
		   int n=5;
		    for(int i=1;i<=n;i++) {
		        f *= i;
		    }
		    System.out.println("Factorial of "+n+" is : "+f);
	   }

}
