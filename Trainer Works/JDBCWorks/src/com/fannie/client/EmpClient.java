package com.fannie.client;

import com.fannie.beans.Employee;
import com.fannie.contract.IEmpDAO;
import com.fannie.dao.EmpDAO;

public class EmpClient {
	public static void main(String[] args) {
		Employee emp = new Employee(104, "Lakshmikanth", 2255, "Lakshmikanth@gmail.com");
		
		IEmpDAO dao = new EmpDAO();
		
		// System.out.println(dao.insertEmp(emp)?"Inserted":"Sorry Not Inserted");
		
//		Employee fetchedEmp = dao.getEmp(101);
//		System.out.println(fetchedEmp);
	
		for(Employee temp : dao.getAllEmps()){
			System.out.println(temp);
		}
		
	
	}
}
