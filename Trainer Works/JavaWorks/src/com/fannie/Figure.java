package com.fannie;

public abstract  class Figure {
	public abstract void area();
	
	// in abstract class we can have concreted method 
	public void draw(){
		System.out.println("We can draw with pen/pencil... ");
	}
}


class Rect extends Figure{
	int len;
	int bre;
	
	Rect(int len, int bre){
		this.len = len;
		this.bre = bre;
	}
	@Override
	public void area() {
		System.out.println("Area of Rect" + (len * bre));
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("To Draw Rectangle i need a ruler... ");
	}
}

class Sqr extends Figure{
	int len;
	Sqr(int len){
		this.len = len;
	}
	@Override
	public void area() {
		System.out.println("Area of Sqr "  + (len * len));
	}
}








