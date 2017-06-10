package com.fannie.day2;

import java.io.IOException;

public class ExceptionEx3 {
	
	public static void validateName(String name)
		throws Exception{
		if(name.length() < 5){
			throw new Exception("Sorry name cannot be less than 5 chars");
		}
	}
	
	public static void checkCreditScore(int cs, String name)
		throws IOException, Exception{
		try{
		validateName(name);
		}catch(Exception e){
			throw new Exception
					("Sorry check of credit score not possible", e);
		}
		
		if(cs < 400){
			// throw an exception 
			throw new FannieException
				("Sorry less than 400 is not processed, Mr/Ms/Mrs :" + 
						name);
		} if(cs >= 400 && cs < 500){
			
			throw new IOException
			("You are not good now, try after 3 Months, Mr/Ms/Mrs : " 
					+ name);
		}else{
			System.out.println("We are good to go, Mr/Ms/Mrs :" + name);
		}
	}
	
	public static void main(String[] args) {
	
		try {
			checkCreditScore(344, "Harry");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(FannieException fe){
			System.out.println(fe);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
