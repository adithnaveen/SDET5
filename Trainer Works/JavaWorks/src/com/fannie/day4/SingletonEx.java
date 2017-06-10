package com.fannie.day4;

class Company{
	private Company() {
		System.out.println("company object is created... ");
	}
	
	public static Company getCompany(Company company){
		if(company == null){
			return new Company();
		}else{
			return company;
		}
	}
}


public class SingletonEx {
	public static void main(String[] args) {
		Company company =null;
		
		company = Company.getCompany(company);
		Company c2 = Company.getCompany(company);
	}
}
