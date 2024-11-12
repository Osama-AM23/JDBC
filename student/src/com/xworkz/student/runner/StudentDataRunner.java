package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentData;

public class StudentDataRunner {

	public static void main(String[] args) {

		String insertQuery = "INSERT INTO info (id, name, lastName, age, DOB, email, password, address, phone, pincode, state, language) VALUES "
				+ "(1, 'Aswin', 'G', 20, '2004-10-09', 'aswin09@gmail.com', 19982309, 'Rajaji Nagar, Bangalore', 8122077135, 807112, 'KA', 'Tamil'), "
				+ "(2, 'Ravi', 'K', 22, '2002-05-15', 'ravi@gmail.com', 20020515, 'Indiranagar, Bangalore', 9876543210, 560038, 'KA', 'Kannada'), "
				+ "(3, 'Sneha', 'M', 19, '2004-11-20', 'sneha@gmail.com', 20042011, 'Malleswaram, Bangalore', 9876543211, 560003, 'KA', 'Hindi'), "
				+ "(4, 'Kiran', 'P', 21, '2003-02-28', 'kiran@gmail.com', 20032802, 'Koramangala, Bangalore', 8123456789, 560047, 'KA', 'Telugu'), "
				+ "(5, 'Meera', 'R', 23, '2001-12-01', 'meera@gmail.com', 2001012, 'Jayanagar, Bangalore', 8765432109, 560011, 'KA', 'English'), "
				+ "(6, 'Vikram', 'S', 24, '1999-08-30', 'vikram@gmail.com', 19993008, 'Whitefield, Bangalore', 9654321098, 560066, 'KA', 'Hindi'), "
				+ "(7, 'Anita', 'T', 18, '2005-03-12', 'anita@gmail.com', 20051203, 'BTM Layout, Bangalore', 7654321098, 560029, 'KA', 'Tamil'), "
				+ "(8, 'Rajesh', 'N', 25, '1998-04-14', 'rajesh@gmail.com', 19981404, 'Hosur Road, Bangalore', 6543210987, 560068, 'KA', 'Telugu'), "
				+ "(9, 'Pooja', 'V', 20, '2004-07-07', 'pooja@gmail.com', 20040707, 'MG Road, Bangalore', 5432109876, 560001, 'KA', 'Kannada'), "
				+ "(10, 'Ajay', 'L', 22, '2002-09-18', 'ajay@gmail.com', 20020918, 'HSR Layout, Bangalore', 4321098765, 560034, 'KA', 'English'), "
				+ "(11, 'Nisha', 'K', 21, '2003-10-22', 'nisha@gmail.com', 20032210, 'Jayanagar 4th Block, Bangalore', 3210987654, 560041, 'KA', 'Hindi'), "
				+ "(12, 'Suresh', 'C', 24, '1999-11-11', 'suresh@gmail.com', 19991111, 'Rajajinagar, Bangalore', 2109876543, 560010, 'KA', 'Tamil'), "
				+ "(13, 'Kavya', 'R', 19, '2004-01-30', 'kavya@gmail.com', 20043001, 'Kengeri, Bangalore', 1098765432, 560060, 'KA', 'Telugu'), "
				+ "(14, 'Deepak', 'H', 22, '2002-06-06', 'deepak@gmail.com', 20020606, 'Nagarabhavi, Bangalore', 9087654321, 560072, 'KA', 'Kannada'), "
				+ "(15, 'Tina', 'S', 20, '2004-02-29', 'tina@gmail.com', 20040229, 'Banashankari, Bangalore', 8076543210, 560070, 'KA', 'English'), "
				+ "(16, 'Amit', 'J', 23, '2001-08-05', 'amit@gmail.com', 20010508, 'Malleshwaram, Bangalore', 6789012345, 560055, 'KA', 'Hindi'), "
				+ "(17, 'Neha', 'P', 18, '2005-12-15', 'neha@gmail.com', 20051512, 'Kottigepalya, Bangalore', 5678901234, 560022, 'KA', 'Tamil'), "
				+ "(18, 'Ravi', 'B', 21, '2003-04-01', 'raviB@gmail.com', 20030104, 'JP Nagar, Bangalore', 4567890123, 560078, 'KA', 'Telugu'), "
				+ "(19, 'Sonia', 'G', 20, '2004-03-10', 'sonia@gmail.com', 20040310, 'Electronic City, Bangalore', 3456789012, 560100, 'KA', 'Kannada'), "
				+ "(20, 'Kiran', 'M', 22, '2002-07-25', 'kiranM@gmail.com', 20022507, 'Nandi Hills, Bangalore', 2345678901, 560054, 'KA', 'English');";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(StudentData.URL.getValue(), StudentData.USERNAME.getValue(),
					StudentData.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(insertQuery);
			if (i > 0) {
				System.out.println("Connection Successfully");
			} else {
				System.err.println("Not Connected");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
