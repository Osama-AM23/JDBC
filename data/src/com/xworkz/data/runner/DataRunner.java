package com.xworkz.data.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/xworkz";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into student_table values " + "(2, 'Arun', 'CSE', 'CH17ROM'),"
				+ "(3, 'Chethan', 'ECE', 'CH17ROM')," + "(4, 'Charan', 'CSE', 'CH17ROM'),"
				+ "(5, 'Deepak', 'ECE', 'CH17ROM')," + "(6, 'Osama', 'BCom CA', 'CH17ROM'),"
				+ "(7, 'Praveen', 'EEE', 'CH17ROM')," + "(8, 'Saqib', 'CSE', 'CH17ROM'),"
				+ "(9, 'Sachin', 'ECE', 'CH17ROM')," + "(10, 'Amith', 'ECE', 'CH17ROM'),"
				+ "(11, 'Haji', 'EEE', 'CH21ROM')," + "(12, 'Kamlesh', 'MCA', 'CH21ROM'),"
				+ "(13, 'PremKumar', 'CSE', 'CH21ROM')," + "(14, 'Ranjith', 'CSE', 'CH17ROM'),"
				+ "(15, 'Tarun', 'EEE', 'CH21ROM')," + "(16, 'Nagaraj', 'ECE', 'CH21ROM'),"
				+ "(17, 'Samanth', 'EEE', 'CH21ROM')," + "(18, 'Suhas', 'CSE', 'CH21ROM'),"
				+ "(19, 'Shrihari', 'EEE', 'CH21ROM')," + "(20, 'Yash', 'MCA', 'CH21ROM')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(insertQuery);

			if (i > 0) {
				System.out.println("Succesfully connected");
			} else {
				System.err.println("Not connected");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
