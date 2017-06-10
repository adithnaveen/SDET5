package com.fannie.day2;

import java.lang.*;

public class BankLoanClient {
	public static void main(String[] args) {
		BankLoan bl;
		
		bl = new CarLoan();
		bl.loanAmount(10000);
		bl.repay(3000);
		bl.foreClosure();
		
		System.out.println("-------------------------");
		bl = new PersonalLoan();
		bl.loanAmount(20000);
		bl.repay(2000);
		bl.foreClosure();
		
	}
}
