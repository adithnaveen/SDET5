package com.fannie.day3;

import java.util.Vector;

public class Listex3 {
	public static void main(String[] args) {
		Vector<Integer> lst = new Vector<Integer>(5,3);
		int x = 33;
		
		System.out.println("Size " + lst.size());
		System.out.println("Capacity " + lst.capacity());
		
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		lst.add(600);
		lst.add(500);
		lst.add(600);
		lst.add(500);


		
		System.out.println("Size " + lst.size());
		System.out.println("Capacity " + lst.capacity());
		lst.clear();
		
	}
}
