package com.fannie.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {

		Set<Device> set = new HashSet<Device>();
		set.add(new Device(101, "Laptop", 2000));
		set.add(new Device(222, "Mobile", 1200));
		set.add(new Device(121, "Projector", 3000));
		set.add(new Device(78, "AC", 4545));
		set.add(new Device(78, "AC", 4545));
		set.add(new Device(78, "AC", 4545));
		

		set.forEach(System.out :: println);
		
	}
}
