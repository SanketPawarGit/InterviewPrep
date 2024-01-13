package com.basic.logics;

public class ReverseStringWithLessIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Connectwise";
		String revStr1="";
		String revStr2="";
		int k=0;
		char[] strArray=str.toCharArray();
		int l=((strArray.length-1)/2);

		for(int i=strArray.length-1, j=l;i>=l || j>=0;i--, j--) {
			//to handle odd number of string length
			if(l%2==0) {
				revStr1+=strArray[i];
				revStr2+=strArray[j];
			}else{
				if(i==(strArray.length-1)) {
					revStr1+=strArray[i];
				}else {
					revStr1+=strArray[i];
					revStr2+=strArray[j];
				}
			}			
			k++;
		}
		System.out.println("Reverse : "+revStr1);
		System.out.println("Reverse : "+revStr2);
		System.out.println("Reverse : "+revStr1+revStr2);		
		System.out.println("Number of intration :"+k);


	}

}
