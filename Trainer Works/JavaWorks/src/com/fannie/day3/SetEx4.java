package com.fannie.day3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {

		Set<Device> set = new TreeSet<Device>();
		set.add(new Device(101, "Laptop", 2000));
		set.add(new Device(222, "Mobile", 1200));
		set.add(new Device(121, "Projector", 3000));
		set.add(new Device(78, "AC", 4545));
		set.add(new Device(78, "AC", 4545));
		set.add(new Device(78, "AC", 4545));
				
		set.forEach(System.out :: println);
		
		// another set which shall hold the data 
		// in descending order of name 
		// the rule is in diviceSortDescName
		System.out.println("---------------------------------");
		TreeSet<Device> ts  
		=new TreeSet<Device>(
				new Comparator<Device>() {
					@Override
					public int compare(Device o1, Device o2) {
						return o2.getdName().compareTo(o1.getdName());
					}
				}
				);
		
		
		TreeSet<Device> ts1 = new TreeSet<>(Template.sortDescOnName());;
		ts.add(new Device(101, "Laptop", 2000));
		ts.add(new Device(222, "Mobile", 1200));
		ts.add(new Device(121, "Projector", 3000));
		ts.add(new Device(78, "AC", 4545));
		ts.add(new Device(78, "AC", 4545));
		ts.add(new Device(78, "AC", 4545));
				
		ts.forEach(System.out :: println);
	}
}
