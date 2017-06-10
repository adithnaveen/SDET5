package com.fannie;

public class LoanClient {
	public static void main(String[] args) {
		Loan loanScott;
		loanScott= new Loan();
		
		loanScott.setlId(101);
		loanScott.setBorrowerName("sct");
		loanScott.setLoanAmount(4444);
		loanScott.setRateOfInterest(7);
		
		System.out.println("Id " + loanScott.getlId());
		System.out.println("Name " + loanScott.getBorrowerName());
		System.out.println("Amount " + loanScott.getLoanAmount());
		System.out.println("ROI " + loanScott.getRateOfInterest());
	}
}
