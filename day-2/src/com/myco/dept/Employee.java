package com.myco.dept;

public class Employee {
	
	public String empName;
	public int empId;
	public int salary;
	
	
	public void displayInformation()
	{
		System.out.println("Name : "+ empName);
		System.out.println("Id : "+ empId);
		System.out.println("Salary : "+ salary);
	}
	
	public String getSalaryBand()
	{
		if(salary >= 5000)
			return "A";
		
		else if(salary <5000 && salary > 1000)
		return "B";
		
		else
			return "C";
	}

}
