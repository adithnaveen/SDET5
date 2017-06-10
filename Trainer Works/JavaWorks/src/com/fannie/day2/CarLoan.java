package com.fannie.day2;

class Car{}

public class CarLoan extends Car implements BankLoan {

	@Override
	public void loanAmount(int amount) {
		System.out.println(" CarLoan Amount is " + amount);
	}

	@Override
	public void repay(int amount) {
		System.out.println("CarLoan You Repay " + amount);
		
	}

	@Override
	public void foreClosure() {
		System.out.println("CarLoan You opted for ForeClosure");
	}

}
