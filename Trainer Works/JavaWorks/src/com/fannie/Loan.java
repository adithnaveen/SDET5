package com.fannie;

// reusable component 
// is called Bean class 
// a bean class shall have private variables 
// public getters and setters 
// default constructor (if you dont create then 
// compiler will create a the time of compilation)
public class Loan {
	private int lId;
	private double loanAmount;
	private double rateOfInterest;
	private String borrowerName;

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount < 10000) {
			System.out.println("sorry loan cannot be processed ");
			this.loanAmount = 10000;
		} else {
			this.loanAmount = loanAmount;
		}
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		if (borrowerName.length() < 5) {
			System.out.println("Sorry name cannot be less than 5 chars");
			this.borrowerName = "No Name";
		} else {
			this.borrowerName = borrowerName;
		}
	}

}
