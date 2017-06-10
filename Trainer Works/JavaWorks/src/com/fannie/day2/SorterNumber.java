package com.fannie.day2;

import java.util.Arrays;

public class SorterNumber {
	public static void main(String[] args) {
		int [] nums = {23,4,3,12,5,6,34,66,33,11,565,88};
		
		for(int temp : nums){
			System.out.println(temp);
		}
		
		Arrays.sort(nums);
		
		System.out.println("----------------------------");
		
		for(int temp : nums){
			System.out.println(temp);
		}
	}
}
