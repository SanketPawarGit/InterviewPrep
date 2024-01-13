package com.basic.logics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArrayShifting {

	public static void main(String[] args) {
		int[] a= {0,1,2,0,3,4,9,0,6,7,0,5,0,10,11,0};
		int temp=0;
		int n=0;
		int valueToShift=0;	
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();			
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==valueToShift) {
				map.put(a[i], n=n+1);
			}
		}		
		
		int value= map.get(valueToShift);
		while(value>0) {
			for(int i=0;i<a.length-1;i++) {				
					if(a[i]==0) {
						temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;					
					}					
			}
			value--;
		}		
		System.out.println("array : "+Arrays.toString(a));		
	}
}
