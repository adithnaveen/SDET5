package com.fannie.day4;

public class Account {
	int money; 
	
	public Account(int money) {
		this.money = money;
	}
	
	public  void withdraw(int amount){
		if(amount< money){
			// simulating to connect DB 
			try {
				Thread.sleep(1000);
				money = money - amount;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Withraw successfull  by "
					+ Thread.currentThread().getName());;
			
		}else{
			System.out.println("Sorry No Balance Req from : " +
					Thread.currentThread().getName());
		}
		
		System.out.println("Current Balance " + money);
	}
}
