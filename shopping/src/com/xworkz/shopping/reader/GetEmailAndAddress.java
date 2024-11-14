package com.xworkz.shopping.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shopping.constants.Shopping;

public class GetEmailAndAddress {

	public static void main(String[] args) {


		Connection  connection=null;
		PreparedStatement prst=null;
		
		try {
			connection=DriverManager.getConnection(Shopping.URL.getValue(), Shopping.USERNAME.getValue(), Shopping.PASSWORD.getValue());
			
			prst =connection.prepareStatement("select email, address from new_table where firstName='Aswin' and state='TN'");
			ResultSet resultSet =prst.executeQuery();
			
			while(resultSet.next()) {
				
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
