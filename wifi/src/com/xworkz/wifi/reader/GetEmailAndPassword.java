package com.xworkz.wifi.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.wifi.constants.WifiData;

public class GetEmailAndPassword {

	public static void main(String[] args) {
		
		String readOperation="SELECT email, password FROM network WHERE phone=7654321122";
		
		Connection connection= null;
		
		try {
			connection=DriverManager.getConnection(WifiData.URL.getValue(), WifiData.USERNAME.getValue(),
					WifiData.PASSWORD.getValue());
			
			Statement statement =connection.createStatement();
			ResultSet resultSet =statement.executeQuery(readOperation);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
