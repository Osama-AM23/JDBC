package com.xworkz.application.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplicationReader {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/pg";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query=   "SELECT * FROM application";
		String query1 = "SELECT name FROM application WHERE email = 'aswin23@gmail.com' AND mobileNo = 8122407324";
		String query2 = "SELECT address FROM application WHERE name = 'Mujahid' AND mobileNo = 6381500876";
		String query3 = "SELECT email FROM application where id=10 AND mobileNo=9609255412";
		String query4 = "SELECT email ,aadhaarNo FROM application where mobileNo = 9047500110 AND name = 'Thameem'";
		String query5 = "SELECT name FROM application WHERE id>10";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement1 = connection.createStatement();
			ResultSet resultSet1=statement1.executeQuery(query1);
			
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString("name"));
			}
			
			Statement statement=connection.createStatement();
			ResultSet resultSet= statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

			Statement statement2= connection.createStatement();
			ResultSet resultSet2=statement2.executeQuery(query2);
			
			while(resultSet2.next()) {
				System.out.println(resultSet2.getString("address"));
			}
			
			Statement statement3= connection.createStatement();
			ResultSet resultSet3=statement3.executeQuery(query3);
			
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("email"));
			}
			
			Statement statement4= connection.createStatement();
			ResultSet resultSet4=statement4.executeQuery(query4);
			
			while(resultSet4.next()) {
				System.out.println(resultSet4.getString("email"));
				System.out.println(resultSet4.getString("aadhaarNo"));
			}
			
			Statement statement5= connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(query5);
			
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
