package com.xworkz.employee.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/web";
		String userName="root";
		String password="Xworkzodc@123";
		// Inserting records for employee_info
		String insertQuery="insert into employee_info values (1, 'Osama A', 5, 'osama@gmail.com'),"
				+ "(2,'Aswin G', 5, 'aswin9023@gmail.com'),"
				+ "(3, 'Akram S', 3, 'akram@gmail.com'),"
				+ "(4, 'Azees B', 7, 'azees01@gmail.com'),"
				+ "(5, 'Ismail S', 3, 'ismail@gmail.com'),"
				+ "(6, 'Affroz K', 2, 'affroz@gmail.com'),"
				+ "(7, 'Sadhik A',3, 'sadhik@gmail.com'),"
				+ "(8, 'Saqib S', 4,'saqib@gmail.com'),"
				+ "(9, 'Mohammed G',5,'mohammed@gmail.com'),"
				+ "(10, 'Malick K', 3, 'malick@gmail.com'),"
				+ "(11, 'Sulaiman H', 6, 'sulaiman@gmail.com'),"
				+ "(12, 'Ishak I', 3, 'ishak@gmail.com'),"
				+ "(13, 'Jeelan U', 3, 'jeelan@gmail.com'),"
				+ "(14, 'Akhib B', 4, 'akhib@gmail.com'),"
				+ "(15, 'Hameed A', 2, 'hameed@gmail.com'),"
				+ "(16, 'Ibrahim K', 1, 'ibrahim@gmail.com'),"
				+ "(17, 'Umar J', 1, 'umar@gmail.com'),"
				+ "(18, 'Imran R', 2, 'imran@gmail.com'),"
				+ "(19, 'Mujahid A', 4, 'mujahid@gmail.com'),"
				+ "(20, 'Thameem A', 2, 'thameem@gmail.com')";
		
		
		Connection connection= null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			
			Statement statement=connection.createStatement();
			int ref=statement.executeUpdate(insertQuery);
			
			if(ref >0) {
				System.out.println("Successfully connected");
			}else {
				System.err.println("not connected");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
	}

}
