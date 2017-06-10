package com.fannie;

public class CarBL {
	public void showCar(Car [] cars){

		for(Car temp : cars){
			System.out.println("----------------------");
			temp.move();
			temp.brake();
			temp.feulCapacity(55);
			temp.streeing();
			
			if(temp instanceof Ford){
				((Ford) temp).abs();
			}else if (temp instanceof Audi){
				((Audi) temp).view();
			}
		}
	}
}
