package com.fannie.contract;

import java.util.List;

import com.fannie.beans.Employee;

public interface IEmpDAO {
	// CRUD -> Create, Read, Update, Delete 
	
	// insert 
	public boolean insertEmp(Employee emp);
	
	// update 
	public boolean updateEmp(int empId, double salary);
	
	// delete 
	public boolean delete(int empId);
	
	// get 1 emp 
	public Employee getEmp(int empId);
	
	// get all emp 
	public List<Employee> getAllEmps();
	
}
