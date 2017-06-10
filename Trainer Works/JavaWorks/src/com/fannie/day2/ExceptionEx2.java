package com.fannie.day2;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try{
			System.out.println("Connect to db");

			if(1==1)
				throw new RuntimeException();
			
			
		}catch(Exception e){
			System.out.println("Oh Exception caught " + e );
		}finally{
			System.out.println("Cloose here ");
		}
		System.out.println("i'm other code in the world... ");
	}
}
