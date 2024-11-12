package com.xworkz.clothes.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClothesReadRunner {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sigma";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query100 = "Select * from cust_data";
		String query="SELECT cust_Name FROM cust_data WHERE cust_Email = 'assadiq@gmail.com' AND cust_mobileNo = 8068643453";
		String query1="SELECT cust_Address FROM cust_data WHERE cust_Name = 'Omkar' AND cust_mobileNo = 9001201324";
		String query2="SELECT cust_Email FROM cust_data where cust_id=4 AND cust_mobileNo=7908643121";
		String query3="SELECT cust_Email ,nameOfClothes FROM cust_data where cust_mobileNo = 8072243113 AND cust_Name = 'Thameem'";
		String query4="SELECT cust_Name FROM cust_data WHERE cust_id>10";
		
		Connection connection= null;
		
		try {
			
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement =connection.createStatement();
			ResultSet resultSet= statement.executeQuery(query100);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("cust_Name"));
				System.out.println("-----------");
				
			}
			
			
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement1 =connection.createStatement();
			ResultSet resultSet1= statement1.executeQuery(query);
			
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString("cust_Name"));
				System.out.println("-----------");
				
			}
			
			Statement statement2=connection.createStatement();
			ResultSet resultSet2=statement2.executeQuery(query1);
			while(resultSet2.next()) {
				System.out.println(resultSet2.getString("cust_Address"));
				System.out.println("-----------");
			}
			
			Statement statement3=connection.createStatement();
			ResultSet resultSet3=statement3.executeQuery(query2);
			while(resultSet3.next()) {
				System.out.println(resultSet3.getString("cust_Email"));
				System.out.println("-----------");
			}
			
			Statement statement4=connection.createStatement();
			ResultSet resultSet4=statement4.executeQuery(query3);
			while(resultSet4.next()) {
				System.out.println(resultSet4.getString("cust_Email"));
				System.out.println(resultSet4.getString("nameOfClothes"));
				System.out.println("-----------");
					
			}
			
			Statement statement5=connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(query4);
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("cust_Name"));
				System.out.println("-----------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
