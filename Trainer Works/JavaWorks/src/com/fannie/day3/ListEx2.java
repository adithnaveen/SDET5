package com.fannie.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		System.out.println("List size " + list.size());
		list.add("Bhaskar");
		list.add("Sateesh");
		list.add("Hareesh");
		list.add("Madhuri");
		
		System.out.println("list size " + list.size());
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println("list size " + list.size());


		for(String temp : list){
			System.out.println(temp);
		}
		
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			String temp  = itr.next();
			System.out.println(temp);
		}
		
		
		

	}
}
