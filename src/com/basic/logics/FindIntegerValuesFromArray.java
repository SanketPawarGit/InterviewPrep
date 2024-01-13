package com.basic.logics;

import java.util.ArrayList;
import java.util.List;

public class FindIntegerValuesFromArray {

	public static void main(String[] args) {
		String strArray[]= {"ab12", "123", "#54", "abc", "567","xyz","901"};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<strArray.length;i++) {
			int num=0;
			try{
				//num=(Integer)strArray[i]; //--> Error - can not cast from String to Integer
				num=Integer.parseInt(strArray[i]);
				list.add(num);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Integer values from provided array are : "+list);	
	}
}
