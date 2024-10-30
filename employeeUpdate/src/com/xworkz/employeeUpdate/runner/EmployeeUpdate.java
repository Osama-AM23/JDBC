package com.xworkz.employeeUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdate {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/web";
		String userName="root";
		String password="Xworkzodc@123";
		String updateQuery1="update employee_info set employee_Exp= 10 where employee_id=1";
		String updateQuery2="update employee_info set employee_Exp= 10 where employee_id=2";
		String updateQuery3="update employee_info set employee_Exp= 02 where employee_id=3";
		String updateQuery4="update employee_info set employee_Exp= 15 where employee_id=4";
		String updateQuery5="update employee_info set employee_Exp= 01 where employee_id=5";
		String updateQuery6="update employee_info set employee_Exp= 01 where employee_id=6";
		String updateQuery7="update employee_info set employee_Exp= 01 where employee_id=7";
		String updateQuery8="update employee_info set employee_Exp= 02 where employee_id=8";
		String updateQuery9="update employee_info set employee_Exp= 08 where employee_id=9";
		String updateQuery10="update employee_info set employee_Exp= 05 where employee_id=10";

		try(Connection connection= DriverManager.getConnection(url, userName, password)){
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(updateQuery1);
			statement.executeUpdate(updateQuery2);
			statement.executeUpdate(updateQuery3);
			statement.executeUpdate(updateQuery4);
			statement.executeUpdate(updateQuery5);
			statement.executeUpdate(updateQuery6);
			statement.executeUpdate(updateQuery7);
			statement.executeUpdate(updateQuery8);
			statement.executeUpdate(updateQuery9);
			statement.executeUpdate(updateQuery10);
			
			if(connection !=null) {
				System.out.println("Updated Sucessfully");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
