package com.xworkz.exam.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.exam.constants.Information2;

public class Information2Runner {

	public static void main(String[] args) {
		
		Connection connection= null;
		PreparedStatement prst=null;
		
		try {
			connection=DriverManager.getConnection(Information2.URL.getValue(), Information2.USERNAME.getValue(),
						Information2.PASSWORD.getValue());
			
			prst=connection.prepareStatement("INSERT INTO new_table values(?,?,?)");
			prst.setInt(1, 15);
			prst.setString(2, "Sadhik");
			prst.setString(3, "Pass");
			
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
