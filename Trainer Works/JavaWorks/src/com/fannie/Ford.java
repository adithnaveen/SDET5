package com.fannie;

public class Ford extends Car{
	
	public Ford() {
		super();
		System.out.println("Ford Constructed...");
	}
	
	public void abs(){
		System.out.println("Ford has ABS...");
	}

	@Override
	public void move() {
		System.out.println("Ford is moving... ");
	}
	

}
