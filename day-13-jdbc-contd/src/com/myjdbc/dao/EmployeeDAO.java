package com.myjdbc.dao;

import java.util.List;

import com.myjdbc.model.Employee;

public interface EmployeeDAO {
	
	void saveEmployee(Employee e);
	void saveEmployees(List<Employee> employees);
	int delete(int empId);
	void deleteAll();
	int update(Employee e);
	List<Employee> getEmployees();
	Employee findEmployeeByEmpId(int empId);
	List<Employee> findEmployeeByName(String empName);
	List<Employee> findByAge(int age);
}
