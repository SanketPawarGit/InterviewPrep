package com.basic.logics;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesFromTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {1,3,2,5,6,7};
		int[] array2= {2,3,6,1,8,9};		
		List<Integer> list=new ArrayList<Integer>();		
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					list.add(array1[i]);
				}
			}
		}
		System.out.println("Duplicate values are : "+list);
	}
}
