package com.basic.logics;

import java.util.ArrayList;
import java.util.List;

public class AdditionalOfTwoDimentionalArray {

	public static void main(String[] args) {

		int[][]intArray={{1,2,3},{4,5},{6}};
		int sum=0;
		int innerArrayLength=0;
		int length=intArray.length;
		System.out.println("Length of two dimentional array is : "+length);
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			innerArrayLength=intArray[i].length;
			list.add(innerArrayLength);
		}
		System.out.println("Length of each array of two dimentional array is : "+list);		
		for(int i=0;i<length;i++){
			for(int j=0;j<list.get(i);j++) {
				 sum=intArray[i][j]+sum;
			}			
		}
		System.out.println("Sum of all values of two dimentioanl array is : "+sum);		
	}
}
