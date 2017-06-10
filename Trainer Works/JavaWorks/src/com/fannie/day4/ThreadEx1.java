package com.fannie.day4;

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread name " + Thread.currentThread().getName());
		
		// MIN_PRIORITY 1
		// NORM_PRIORITY 5 (Default)
		// MAX_PRIORITY 10 
		System.out.println("Thread Priority " + Thread.currentThread().getPriority());
		
	}
}
