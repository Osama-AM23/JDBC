package com.xworkz.wifi.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.wifi.constants.WifiData;

public class GetName10 {

	public static void main(String[] args) {
		
		String readOperation="SELECT name FROM network WHERE id>10";
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(WifiData.URL.getValue(), WifiData.USERNAME.getValue(),
					WifiData.PASSWORD.getValue());
			
			Statement statement=connection.createStatement();
			ResultSet resultSet =statement.executeQuery(readOperation);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
