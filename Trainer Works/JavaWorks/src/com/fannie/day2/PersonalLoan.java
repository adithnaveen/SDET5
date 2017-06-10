package com.fannie.day2;

public class PersonalLoan implements BankLoan{


	@Override
	public void loanAmount(int amount) {
		System.out.println("Personal Loan Amount is " + amount);
	}

	@Override
	public void repay(int amount) {
		System.out.println("Personal Loan You Repay " + amount);
		
	}

	@Override
	public void foreClosure() {
		System.out.println("Personal loan You opted for ForeClosure");
	}

}
