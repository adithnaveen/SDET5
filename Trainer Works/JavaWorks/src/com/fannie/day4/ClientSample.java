package com.fannie.day4;

public class ClientSample {
	public static void main(String[] args) {
		try {
			Class.forName("com.fannie.day4.Sample");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
