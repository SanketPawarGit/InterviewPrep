package com.basic.logics;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		HashMap<String, Object> map1=new HashMap();
		HashMap<String, Object> map2=new HashMap();
		map1.put("abc", 111);
		map1.put("def", "jkl");
		map1.put("ghi", "ttttttt");
		map2=map1;
		System.out.println("Map2 before remove : "+map2);
		System.out.println("Map1 before remove : "+map1);
		map1.remove("abc");
		System.out.println("Map2 after remove : "+map2);
		System.out.println("Map1 after remove : "+map1);
		map2.put("abc", "4444");
		System.out.println("Map2 after put : "+map2);
	
		//Map<String, String> map4=new LinkedHashMap<String, String>();
		//Map<String, String> map5=new IdentityHashMap<String, String>();
		//Map<String, String> map3=new TreeMap<String, String>();
		//SortedMap<String, String> map4=new TreeMap<String, String>();
		//NavigableMap<String, String> map5=new TreeMap<String, String>();
		
		//Collections.sort(null);


		
	}

}
