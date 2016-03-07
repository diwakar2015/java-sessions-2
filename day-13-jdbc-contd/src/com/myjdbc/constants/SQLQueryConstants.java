package com.myjdbc.constants;

public interface SQLQueryConstants {
	
	String INSERT_QUERY = "insert into employee values (?, ? , ?)";
	
	String FIND_BY_ID = "select * from employee where empid=?";
	String FIND_BY_NAME = "select * from employee where empname=?";
	String FIND_BY_AGE= "select * from employee where age=?";
	String FIND_ALL = "select * from employee";
	
	String DELETE_BY_ID = "delete from employee where empid=?";
	String DELETE_BY_NAME = "delete from employee where empname= ?";
	String DELETE_ALL = "delete from employee";
	
	String UPDATE_NAME_FOR_AN_EMPLOYEE = " update employee set empname=? where empid= ?";
	String UPDATE_AGE_FOR_AN_EMPLOYEE = " update employee set age=? where empid= ?";
	String UPDATE_NAME_AGE_FOR_AN_EMPLOYEE = " update employee set empname=?,age=? where empid= ?";
	
	
}