package com.basic.logics;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SmallestAndLargestWordInString {

	public static void main(String[] args) {
		

		 
        // Declaring the String
        String str = "Alice is girl and Bob will be boy";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();
 
        // Splitting the words of string
        // and storing them in the array.
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, word.length());
 
			/*
			 * else { // Incrementing the value if the word // is already present in the
			 * HashMap. hashMap.put(word, integer + 1); }
			 */
        }
        System.out.println(hashMap);
        List<String> list=new ArrayList<String>();
       
        String temp=null;
        
        Set<String> keyNames=hashMap.keySet();
        for (int i=0; i<keyNames.size(); i++) {
        	temp=list.get(i);
        	
        	
        }
        for(String keyName : keyNames) {
        	
        	System.out.println(keyName);
        	
        }
    
		
	}

}
