package com.fannie;


// to compile 
// javac -d . HelloWorld.java

// to Execute 
// java com.fannie.HelloWorld


class Emp {
	 int empId;
	String empName;
	
}
public class HelloWorld{

	public static void main(String args[]){
		System.out.println("This is from Notepad ");

		Emp emp = new Emp();
		emp.empId = 22; 
		emp.empName = "harry";
		
		
		for(int i=0; i<10; i+=2){
			System.out.println(i);
		}
		
		System.out.prinltn("----------------------------");
		System.out.prinltn("Emp Id " + emp.empId);
		System.out.println("Emp Name " + emp.empName);
		
		
	}
}