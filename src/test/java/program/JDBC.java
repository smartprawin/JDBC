package program;

import java.sql.*;
public class JDBC 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			con=DriverManager.getConnection( 
			"jdbc:oracle:thin:@localhost:1521:xe","HR","admin");
			System.out.println("Connection established successfully!");
			String sql="Select * from employees where FIRST_NAME like 'A%'";
//			"jdbc:mysql://192.100.0.000:3306/DBname", "root", "root");
//			"jdbc:mysql://localhost:3306/sonoo","root","root");  
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();  
		
			while(rs.next())  
			{
	
				String UserName = rs.getString("EMPLOYEE_ID");
				String Password = rs.getString("FIRST_NAME");
//				String emailId = rs.getString("email");
//				String testCaseName = rs.getString("testcase");
				System.out.print(UserName+"   ");
				System.out.println(Password);
//				System.out.println(emailId);
//				System.out.println(testCaseName);
			} 
			}catch(Exception e)
				{ 
				System.out.println("in catch");
				System.out.println(e);
				}   
		  
		
		
	}

}
