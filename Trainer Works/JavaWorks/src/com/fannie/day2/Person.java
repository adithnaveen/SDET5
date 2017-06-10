package com.fannie.day2;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable{
	private int pId;
	private String pName;
	private double income;
	// this variable shall not be persisted
	transient private String password;
	
	public Person(int pId, String pName, double income) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.income = income;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", income=" + income + "]";
	}


	@Override
	public int compareTo(Person o) {

		// return (int) (o.income - this.income);
		return this.pName.compareTo(o.pName);

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
