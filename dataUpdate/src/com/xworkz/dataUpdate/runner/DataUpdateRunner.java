package com.xworkz.dataUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataUpdateRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/xworkz";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1 = "update student_table set Branch='ECE' where student_id=1";
		String updateQuery2 = "update student_table set Branch='MCA' where student_id=2";
		String updateQuery3 = "update student_table set Branch='CSE' where student_id=3";
		String updateQuery4 = "update student_table set Branch='ECE' where student_id=4";
		String updateQuery5 = "update student_table set Branch='CSE' where student_id=5";
		String updateQuery6 = "update student_table set Branch='B Com' where student_id=6";
		String updateQuery7 = "update student_table set Branch='M.tech' where student_id=7";
		String updateQuery8 = "update student_table set Branch='M.tech' where student_id=8";
		String updateQuery9 = "update student_table set Branch='MCA' where student_id=9";
		String updateQuery10 = "update student_table set Branch='EEE' where student_id=10";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
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

			if (statement != null) {
				System.out.println("Updated successfully");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
