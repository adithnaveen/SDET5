package com.fannie.day2;

public class FannieException extends Exception{

	String msg;
	
	public FannieException() {
		msg = "FannieMae Exception Called...";
	}
	
	public FannieException(String msg){
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

	@Override
	public String toString() {
		return "toString:::: "+ this.msg;
	}
	
	
}
