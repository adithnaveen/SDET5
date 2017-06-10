package com.fannie;

public class FigureClient {
	public static void main(String[] args) {
		Figure f[] = new Figure[3];
		
		f[0] = new Rect(10, 20);
		f[1] = new Sqr(3);
		f[2] = new Rect(44, 33);
		
		for(Figure temp : f){
			System.out.println("------------------------");
			temp.area();
			temp.draw();
		}
		
	}
}
