package com.fannie.day3;

import java.util.Arrays;
import java.util.List;

public class ListJava8Concept {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		
		System.out.println("-------------using enhance for loop ---------------- ");
		for(int temp : numbers){
			System.out.println(temp);
		}
		
		System.out.println("------------ in lambday way ------------------ ");
		numbers.forEach((Integer temp ) -> System.out.println(temp) );
		
		System.out.println("------------ in lambday way 2------------------ ");
		numbers.forEach(( temp ) -> System.out.println(temp) );
		
		System.out.println("------------with method refernces ------------------- ");
		numbers.forEach(System.out :: println);
		
	}
}
