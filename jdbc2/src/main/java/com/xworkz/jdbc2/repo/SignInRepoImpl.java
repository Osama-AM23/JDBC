package com.xworkz.jdbc2.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc2.constant.SignInConnection;
import com.xworkz.jdbc2.dto.SignInDTO;

public class SignInRepoImpl implements SignInRepo {
	@Override
	public boolean valid(SignInDTO signInDTO) {
		Connection connection = null;
		PreparedStatement pre = null;
		boolean check = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			connection = DriverManager.getConnection(SignInConnection.URL.getValue(),
					SignInConnection.USERNAME.getValue(), SignInConnection.PASSWORD.getValue());

			pre = connection.prepareStatement("INSERT INTO signin_table VALUES (?, ?, ?, ?)");

			pre.setString(1, signInDTO.getId());
			pre.setString(2, signInDTO.getName());
			pre.setString(3, signInDTO.getEmail());
			pre.setString(4, signInDTO.getPassword());
			int i = pre.executeUpdate();

			if (i > 0) {
				System.out.println("Saved");
				check = true;
			} else {
				System.out.println("not saved");
				check = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

}
