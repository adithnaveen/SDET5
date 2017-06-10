package com.fannie.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> accounts = new HashMap<String, Integer>();
		
		accounts.put("abdul", 10000);
		accounts.put("suresh", 20000);
		accounts.put("peter", 5000);
		
//		System.out.println("Abdul Balance -> " + accounts.get("abdul"));
//		System.out.println("Suresh  Balance -> " + accounts.get("suresh"));
//		System.out.println("Peter Balance -> " + accounts.get("peter"));
//		



		Iterator itr = accounts.entrySet().iterator();
		
		// hasNext will check for element 
		while(itr.hasNext()){
			// get the value from the set and keep it in map 
			// as  a temp object 
			
			/*
			 * interface Map{
			 * 		interface Entry{
			 * 		
			 * 		}
			 * }
			 */
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			
			System.out.println("Key -> " + temp.getKey() 
				+", Value -> " + temp.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
