package com.fannie.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.fannie.day2.Person;

public class SerializeExample {
	
	public static void storeObject(Person per){
		ObjectOutputStream oos  = null;
		try {
			 oos = new ObjectOutputStream(
					new FileOutputStream("person.ser")
					);
			
			oos.writeObject(per);
			oos.writeObject(new String("Fannie"));
			oos.writeDouble(1000);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data Saved Successfully....");
	}
	
	
	public static void readObject() 
			throws FileNotFoundException, 
			IOException, ClassNotFoundException{
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream("person.ser"));

		Object object =  ois.readObject();
		
		if(object instanceof Double){
			System.out.println(object);
		}else 
		if(object instanceof Person){
			Person p = (Person) object;
			System.out.println(p +", " + p.getPassword());
			
		}
		
//		double doubleVal = ois.readDouble();
//		System.out.println("Double value got " + doubleVal);
		//System.out.println(person);
	}
	
	
	public static void main(String[] args) {
//		Person p = new Person(101, "Becky", 121212);
//		p.setPassword("secret");
//		storeObject(p);
		
		
		try {
			readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








