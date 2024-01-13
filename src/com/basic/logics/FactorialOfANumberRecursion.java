package com.basic.logics;

public class FactorialOfANumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    	public static long multiplyNumbers(int num)
    	{
    		if (num >= 1)
    			return num * multiplyNumbers(num - 1);
    		else
    			return 1;

    	}

}
