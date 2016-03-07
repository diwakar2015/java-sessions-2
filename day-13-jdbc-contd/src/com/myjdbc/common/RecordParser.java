package com.myjdbc.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myjdbc.model.Employee;

public class RecordParser {

	public static List<Employee> getEmployeesList(ResultSet rs)
	{
		List<Employee> empList = new ArrayList<Employee>();

		try {		
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				

				Employee e = new Employee(id,name,age);
				empList.add(e);

			}

		} catch (SQLException ex) {
			System.out.println("Exception caught while fetching the record from empployee table, "+ ex.getMessage());
		}

		return empList;

	}

}
