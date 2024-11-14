package com.xworkz.shopping.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shopping.constants.Shopping;

public class GetSelectAll {

	public static void main(String[] args) {
		
		Connection connection= null;
		PreparedStatement prst= null;
		
		try {
			connection=DriverManager.getConnection(Shopping.URL.getValue(), Shopping.USERNAME.getValue(), Shopping.PASSWORD.getValue());
			prst=connection.prepareStatement("SELECT * FROM new_table");
			ResultSet result = prst.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString("firstName"));
			}
		} catch (SQLException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
