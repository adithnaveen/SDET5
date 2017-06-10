package com.fannie.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// we read the the data from user 
// show it on console and 
// write to a file 
public class ReadWriteData {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {
		// read the data from console 
		
		BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
		
		System.out.println("Enter Emp Id : ");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Name :");
		String empName=  br.readLine();
		
		System.out.println("Enter Salary :");
		double empSal = Double.parseDouble(br.readLine());
		
		System.out.println("----- You Enetered---------");
		System.out.println("Emp Id " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Sal " + empSal);
		
		BufferedWriter bw = null;
		
		try{
			bw = new BufferedWriter
		
				(new FileWriter("Emp.txt", true));
		
		bw.write("Emp Id " + empId);
		bw.newLine();
		bw.write("Emp Name " + empName);
		bw.newLine();
		bw.write("Emp Sal " + empSal);
		bw.newLine();
			// there was an exception 
			System.out.println("Data Written... ");
		}catch(IOException ioex){
			ioex.printStackTrace();
		}finally{
			// here writing of data 
			bw.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
