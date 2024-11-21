package com.xworkz.confusion.repo;

import java.awt.List;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.confusion.constants.ConnectSql;
import com.xworkz.confusion.dto.ReadDto;

public class ReadRepoImpl implements ReadRepo {

	@Override
	public boolean saved(ReadDto dto) {

		Connection connection = null;
		PreparedStatement pre = null;
		boolean saved = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver class");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(ConnectSql.URL.getValue(), ConnectSql.USERNAME.getValue(),
					ConnectSql.PASSWORD.getValue());

			pre = connection.prepareStatement("INSERT INTO c_table VALUES (?,?,?,?,?,?,?)");
			pre.setString(1, dto.getId());
			pre.setString(2, dto.getName());
			pre.setInt(3, dto.getAge());
			pre.setString(4, dto.getGender());
			pre.setString(5, dto.getEmail());
			pre.setString(6, dto.getPassword());
			pre.setString(7, dto.getPhone());

			int i = pre.executeUpdate();

			if (i > 0) {
				System.out.println("Data Saved");
				saved = true;
			} else {
				System.err.println("Data Not Saved");
				saved = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return saved;
	}

	public String getNameByPhone(String phone) {

		String str = null;
		String str2 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectSql.URL.getValue(), ConnectSql.USERNAME.getValue(),
					ConnectSql.PASSWORD.getValue());

			PreparedStatement preparedStatement = connection
					.prepareStatement("select name, email form c_table where phone=?");
			preparedStatement.setString(1, phone);
			ResultSet resultSet1 = preparedStatement.executeQuery();

			while (resultSet1.next()) {
				str = resultSet1.getString("name");
				str2 = resultSet1.getString("email");
				System.out.println(str);
				System.out.println(str2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str + "&" + str2;
	}

	public int deleteDataById(int id) {
		int i = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectSql.URL.getValue(), ConnectSql.USERNAME.getValue(),
					ConnectSql.PASSWORD.getValue());

			PreparedStatement preparedStatement = connection.prepareStatement("delete from c_table where id=?");
			preparedStatement.setInt(1, id);
			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				i = 1;
			} else {
				i = 0;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return i;

	}
	
	public String updateByEmail(String email) {
		
		String ref=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		
		try {
			connection=DriverManager.getConnection(ConnectSql.URL.getValue(), ConnectSql.USERNAME.getValue(),
					ConnectSql.PASSWORD.getValue());
			
			PreparedStatement preparedStatement=connection.prepareStatement("update c_table set phone=8098722657 where email=?");
			preparedStatement.setString(1, email);
			int value=preparedStatement.executeUpdate();
			if(value>0){
				ref="phone updated";
			}else {
				ref="phonne not updated";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ref;
	}
	
	public String getLisyById(int id) {
		
		String strg=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		
		try {
			connection=DriverManager.getConnection(ConnectSql.URL.getValue(), ConnectSql.USERNAME.getValue(),
					ConnectSql.PASSWORD.getValue());
			
			PreparedStatement preparedStatement =connection.prepareStatement("select* from c_table where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet =preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String name=resultSet.getString("name");
				int age=resultSet.getInt("age");
				String gender=resultSet.getString("gender");
				String email= resultSet.getString("email");
				String password= resultSet.getString("password");
				String phone=resultSet.getString("phone");
				
				strg="ReadDto [name=" + name + ", email=" + email + ", password=" + password + ", phone="
												+ phone + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strg;
	}

}
