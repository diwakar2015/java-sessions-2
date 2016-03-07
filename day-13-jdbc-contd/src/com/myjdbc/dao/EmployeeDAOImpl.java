package com.myjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myjdbc.common.ConnectionFactory;
import com.myjdbc.common.RecordParser;
import com.myjdbc.constants.SQLQueryConstants;
import com.myjdbc.model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void saveEmployee(Employee e) {

		System.out.println("Saving the employee to the database, EmpId: "+ e.getEmpId());	
		PreparedStatement ps = null;
		try
		{
			//SQL Query for inserting the record
			String insertQuery = SQLQueryConstants.INSERT_QUERY; 
			ps = ConnectionFactory.getPreparedStatement(insertQuery);
			//? mark should be resolved to a type
			ps.setInt(1, e.getEmpId());
			ps.setString(2, e.getEmpName());
			ps.setInt(3, e.getAge());

			System.out.println("Executing the query : "+ insertQuery);
			int noOfRecordsInserted = ps.executeUpdate();

			System.out.println("Employee record is saved in Employee table, No of Recor inserted : "+ noOfRecordsInserted);


		}
		catch(Exception ex)
		{
			System.out.println("Exception caught while inserting the employee record innto Employee table for employee Id : "+ e.getEmpId()+ ". Exception "+ex.getMessage() );
		}

		finally
		{
			try {
				ps.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}



	}

	@Override
	public void saveEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub

	}

	@Override
	public int delete(int empId) {
		System.out.println("Deleting the employee from Employee table , EmpId: "+ empId);	

		try
		{
			//
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught while inserting the employee record innto Employee table for employee Id : "+ empId+ ". Exception "+ex.getMessage() );
		}

		return 0;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getEmployees() {

		String findQuery = SQLQueryConstants.FIND_ALL;
		PreparedStatement ps = ConnectionFactory.getPreparedStatement(findQuery);
		List<Employee> empList = null;

		try {		
			ResultSet rs = ps.executeQuery();
			empList = RecordParser.getEmployeesList(rs);

		} catch (SQLException ex) {
			System.out.println("Exception caught while fetching the record from empployee table, "+ ex.getMessage());
		}

		return empList;
	}

	@Override
	public Employee findEmployeeByEmpId(int empId) {

		String findQuery = SQLQueryConstants.FIND_BY_ID;
		PreparedStatement ps = ConnectionFactory.getPreparedStatement(findQuery);
		Employee e = null;
		try {
			ps.setInt(1, empId);

			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				e = new Employee(id,name,age);

			}

		} catch (SQLException ex) {
			System.out.println("Exception caught while fetching the record from empployee table, "+ ex.getMessage());
		}


		return e;
	}

	@Override
	public List<Employee> findEmployeeByName(String empName) {
		String findQuery = SQLQueryConstants.FIND_BY_NAME;
		PreparedStatement ps = ConnectionFactory.getPreparedStatement(findQuery);
		List<Employee> empList = null;

		try {	
			ps.setString(1, empName);
			ResultSet rs = ps.executeQuery();
			empList = RecordParser.getEmployeesList(rs);

		} catch (SQLException ex) {
			System.out.println("Exception caught while fetching the record from empployee table, "+ ex.getMessage());
		}

		return empList;
	}

	@Override
	public List<Employee> findByAge(int age) {
		String findQuery = SQLQueryConstants.FIND_BY_AGE;
		PreparedStatement ps = ConnectionFactory.getPreparedStatement(findQuery);
		
		List<Employee> empList = null;

		try {
			ps.setInt(1, age);
			ResultSet rs = ps.executeQuery();
			empList = RecordParser.getEmployeesList(rs);

		} catch (SQLException ex) {
			System.out.println("Exception caught while fetching the record from empployee table, "+ ex.getMessage());
		}

		return empList;
	}

}
