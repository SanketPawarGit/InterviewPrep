package com.basic.logics;

import java.util.Arrays;

public class ReverseStringArray {
	public static void main(String[] args) {		
		String str[]= {"Globant", "Software", "Technologies"};
		String revArray[]=new String[str.length];
		String revString="";
		int k=0;
		for(int i=str.length-1;i>=0;i--) {
			revString="";
			for(int j=str[i].length()-1;j>=0;j--) {
				revString+=str[i].charAt(j);
			}
			revArray[k++]=revString;		
		}
		System.out.println(Arrays.toString(revArray));		
	}
}
