package com.xworkz.shopping.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shopping.constants.Shopping;

public class GetEmailAndPhone {

	public static void main(String[] args) {
		
		Connection  connection=null;
		PreparedStatement prst=null;
		
		try {
			connection=DriverManager.getConnection(Shopping.URL.getValue(), Shopping.USERNAME.getValue(), Shopping.PASSWORD.getValue());
			
			prst =connection.prepareStatement("select email, phone from new_table where firstName='Jagan'");
			ResultSet resultSet =prst.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
