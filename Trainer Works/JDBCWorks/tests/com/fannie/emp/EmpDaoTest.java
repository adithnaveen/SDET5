package com.fannie.emp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fannie.beans.Employee;
import com.fannie.contract.IEmpDAO;
import com.fannie.dao.EmpDAO;


public class EmpDaoTest {

	
	@BeforeClass
	public static void init(){
		System.out.println("this is before class.. ");
	}
	
	Employee emp;
	IEmpDAO dao;
	@Before
	public void beforeInsertTest(){
		 emp = new Employee(203, "Kawsar", 20000, "kawsar@fannie.com");
		 dao = new EmpDAO();
	}
	
	@Test(timeout=100)
	public void empInsertTest(){

		// this is deprcated in jUnit 4, 
		// Assert.assertEquals(true, dao.insertEmp(emp));
		// 
		assertEquals("Testing to valid case to insert a record", true, dao.insertEmp(emp));
		
	}

}
