package com.fannie.day3;

import java.util.Comparator;

public class DeviceSortDescName implements Comparator<Device>{

	@Override
	public int compare(Device o1, Device o2) {
		return o2.getdName().compareTo(o1.getdName());
	}

}

class Template{
	
	public static Comparator<Device> sortDescOnName(){
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				// TODO Auto-generated method stub
				return o2.getdName().compareTo(o1.getdName());			}
			
		};
	}
	
	public static Comparator<Device> sortAscOnName(){
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				// TODO Auto-generated method stub
				return o1.getdName().compareTo(o2.getdName());			}
			
		};
	}
	
	
	
	
//	public static Comparator<? extends Device> sortPriceAsc(){
//		return new Comparator<? extends Device>() {
//
//			@Override
//			public int compare(Device o1, Device o2) {
//				// TODO Auto-generated method stub
//				return o1.getdName().compareTo(o2.getdName());			}
//			
//		};
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}