package com.fannie.day2;

import java.util.Arrays;
import java.util.Comparator;

public class PersonSorterTemplate {

	public static void sortOnIdAsc(Person[] pers) {

		Arrays.sort(pers, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getpId() - o2.getpId();
			}
		});

	}

	public static void sortOnIdDesc(Person[] pers) {

		Arrays.sort(pers, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o2.getpId() - o1.getpId();
			}
		});

	}
}
