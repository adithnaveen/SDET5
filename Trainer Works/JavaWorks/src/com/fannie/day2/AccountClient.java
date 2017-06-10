package com.fannie.day2;



public class AccountClient {
	public static void main(String[] args) {
		Runtime.runFinalizersOnExit(true);
		
		
		Account [] accounts = new Account[4];
		accounts[0] = new Account(1000, "Ran");
		accounts[1] = new Account(1200, "Deepthy");
		accounts[2] = new Account(1150, "Vara Lakshmi");
		accounts[3] = new Account(1550, "Srimukhi");
		
		for(Account temp : accounts){
			System.out.println(temp); // -> temp.toString();
		}
	}
}
