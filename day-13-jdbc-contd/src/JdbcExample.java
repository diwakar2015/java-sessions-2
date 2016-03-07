import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myjdbc.common.ConnectionFactory;


public class JdbcExample {

	public static void main(String[] args) {

		try
		{
			
			Connection con = ConnectionFactory.getConnection();
		

			//insert a record

			String insertQuery  = "insert into employee values (3, 'Ross',30)";
			PreparedStatement ps = con.prepareStatement(insertQuery);
			int count = ps.executeUpdate();
			System.out.println("No of record inserted : "+ count);


			String sqlQuery = "select * from employee";

			PreparedStatement ps1 = con.prepareStatement(sqlQuery);

			ResultSet rs = ps1.executeQuery();

			while(rs.next())
			{

				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				int age = rs.getInt(3);

				System.out.println("Record retrireved from Database : "+ " Id : "+ empId + " Name : "+ empName+ " Age : "+ age);

			}




		}
		catch(Exception e)
		{
			e.printStackTrace();

		}



	}



}