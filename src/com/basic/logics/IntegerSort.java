package com.basic.logics;

import java.util.Arrays;


public class IntegerSort {

	public static void main(String[] args) {
		int[] array= {2,8,0,3};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}				
			}
		}
		System.out.println(Arrays.toString(array));
		String str="";
		for(int i=0;i<array.length;i++) {
			str+=array[i];			
		}
		System.out.println(str);	
	}
}
