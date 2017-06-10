package com.fannie.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fannie.beans.Employee;
import com.fannie.connection.GetConnection;
import com.fannie.contract.IEmpDAO;

public class EmpDAO implements IEmpDAO {

	@Override
	public boolean insertEmp(Employee emp) {
		
		String sql ="insert into emp values(?,?,?,?)";
		GetConnection gc =new GetConnection();
		
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4, emp.getEmail());
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean updateEmp(int empId, double salary) {
		// TODO Auto-generated method stub
		return false;
	}

	// http://naveenks.com/m/message
	@Override
	public boolean delete(int empId) {
		String sql ="delete from emp where empid =?";
		GetConnection gc  = new  GetConnection();
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmp(int empId) {
		String sql="select empid, empname, empsal, email from emp where empid=? ";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			gc.rs = gc.ps.executeQuery();
			
			if(gc.rs.next()){
				Employee temp = new Employee();
				
				temp.setEmpId(empId);
				// the fields can be referred either by column no 
				// or by name 
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble("empsal"));
				temp.setEmail(gc.rs.getString(4));
				
				return temp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql="select empid, empname, empsal, email from emp";
		GetConnection gc = new GetConnection();
		List<Employee> list= null;
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql);
			
			list = new ArrayList<Employee>(); 
			// the query may contain more than 1 record 
			gc.rs   = gc.ps.executeQuery();
			// iterate all the records got from the DB 
			while(gc.rs.next()){
				Employee temp = new Employee();
				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));
				temp.setEmail(gc.rs.getString(4));
				
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
