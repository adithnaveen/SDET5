package com.fannie;

public class CarClient {
	public static void main(String[] args) {
		
		Car cars [] = new Car[5];
		cars[0] = new Ford();
		cars[1] = new Audi();
		cars[2] = new Ford();
		cars[3] = new Audi();
		cars[4] = new Ford();

		CarBL cbl = new CarBL();
		cbl.showCar(cars);
		
	}
}
