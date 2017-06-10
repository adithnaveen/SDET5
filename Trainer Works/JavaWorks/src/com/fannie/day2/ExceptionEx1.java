package com.fannie.day2;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
			
		try{
		int arr[] = new int[-4];
		}catch(NegativeArraySizeException nase){
			System.out.println("Sorry you cannot create -ve sized array");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int res =  num1 / num2 ; 
		
		System.out.println("Res " + res);
		}catch(NumberFormatException e){
			System.out.println("Hey please dont enter chars");
		}catch(ArithmeticException ae){
			System.out.println("You tried dividing by Zero please check");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Did you forget to pass param... ");
		}catch(Exception e){
			System.out.println("Sorry some thing went worng, contact Admin");
		}
		System.out.println("I'm some business logic... ");
	}
}
