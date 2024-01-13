package com.basic.logics;

import java.util.Arrays;

public class WordCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Sanket";
		
		
		String[] str1=str.split(" ");
		String temp="";
		for(int i=0; i<str1.length; i++) {
			for(int j=0; j<str1.length; j++) {
				if(str1[i].length() < str1[j].length()) {
					temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
				}
			}
			
		}
		System.out.println("Largest word : "+str1[str1.length-1]);
		System.out.println("Smallest word : "+str1[0]);
		System.out.println(Arrays.toString(str1));

	}

}
