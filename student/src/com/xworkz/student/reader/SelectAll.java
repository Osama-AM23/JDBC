package com.xworkz.student.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.student.constants.StudentData;

public class SelectAll {

	public static void main(String[] args) {
		
		String readOperation="SELECT * FROM info";
		
		Connection connection= null;
		try {
			connection=DriverManager.getConnection(StudentData.URL.getValue(), StudentData.USERNAME.getValue(), StudentData.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readOperation);
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
