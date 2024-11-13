package com.xworkz.exam.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.exam.constants.Information;

public class InformationRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(Information.URL.getValue(), Information.USERNAME.getValue(),
					Information.PASSWORD.getValue());

			prst = connection.prepareStatement("INSERT INTO information VALUES (?,?,?)");
			prst.setInt(1, 15);
			prst.setString(2, "Sadhik");
			prst.setString(3, "MCA");
			

			int i = prst.executeUpdate();

			if (i > 0) {
				System.out.println("Connected Successfully");
			} else {
				System.err.println("Not Connected");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
