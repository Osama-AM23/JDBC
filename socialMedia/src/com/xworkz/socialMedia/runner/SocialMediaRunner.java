package com.xworkz.socialMedia.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SocialMediaRunner {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/arun";
		String name="root";
		String password= "Xworkzodc@123";
		
		Connection connection= null;
		
		try {
			connection=DriverManager.getConnection(url, name, password);
			
			if(connection != null) {
				System.out.println("Successfully Connected");
			}else {
				System.err.println("Not connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
