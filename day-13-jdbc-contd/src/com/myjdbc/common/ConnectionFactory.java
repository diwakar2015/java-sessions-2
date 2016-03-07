package com.myjdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.myjdbc.constants.ConnectionConstants;


public class ConnectionFactory {

	private static Connection _connection;

	//Creating the connection object when class gets loaded and it gets created only once.
	static
	{
		System.out.println("Loading the database driver and connecting to MySql Database...");
		try
		{
			Class.forName(ConnectionConstants.DRIVER_NAME);
			_connection = DriverManager.getConnection(ConnectionConstants.URL+ConnectionConstants.DATABASE_NAME, 
					ConnectionConstants.USER_NAME,ConnectionConstants.USER_PASS);

			if(_connection!=null)
				System.out.println("Connection created successfully");
			else
				System.out.println("Error occured while creating the connection.");
		}
		catch(Exception e)
		{
			System.out.println("Exception while creating the connection to MySql Database "+ e.getMessage());
		}

	}

	private ConnectionFactory() { }

	public static Connection getConnection()
	{
		return _connection;

	}

	public static PreparedStatement getPreparedStatement(String sqlQuery)
	{
		Connection _connection = getConnection();
		PreparedStatement ps = null;
		try {
			ps = _connection.prepareStatement(sqlQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ps;
	}

}
