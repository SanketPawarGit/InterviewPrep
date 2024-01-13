package com.basic.logics;

public class SubSequenceMethodInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The input string
		 String str = "Hello and Welcome to Tutorial & Example "; 
		 System.out.println("The given string is: " + str + "\n");
		 int startIndex = 0;
		 int endIndex = 5;
		 // invoking the subSequence() method
		 CharSequence cs = str.subSequence(startIndex, endIndex);
		 System.out.println("Subsequence from index "+ startIndex + " to " + endIndex + " is: " + cs);
		 // Updating the startIndex and endIndex
		 startIndex = 10;
		 endIndex = 17;
		 // indices from 10 to 16 are considered
		 cs = str.subSequence(startIndex, endIndex);
		 System.out.println("Subsequence from index "+ startIndex + " to " + endIndex + " is: " + cs);
		 // Updating the startIndex and endIndex
		 startIndex = 21;
		 endIndex = 29;
		 // indices from 21 to 28 are considered
		 cs = str.subSequence(startIndex, endIndex);
		 System.out.println("Subsequence from index "+ startIndex + " to " + endIndex + " is: " + cs);
	}
}
