package com.xworkz.exam.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.exam.constants.Information3;


public class Information3Runner {

	public static void main(String[] args) {
		
		Connection connection= null;
		PreparedStatement prst =null;
		
		try {
			connection=DriverManager.getConnection(Information3.URL.getValue(), Information3.USERNAME.getValue(),
					Information3.PASSWORD.getValue());
			
			prst=connection.prepareStatement("INSERT INTO info VALUES (?,?,?)");
			prst.setInt(1,15);
			prst.setString(2, "Hathway 5G");
			prst.setString(3, "hathway@6005");
			
			int i=prst.executeUpdate();
			
			if(i>0) {
				System.out.println("Connected");
			}else {
				System.err.println("Not Connected");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
