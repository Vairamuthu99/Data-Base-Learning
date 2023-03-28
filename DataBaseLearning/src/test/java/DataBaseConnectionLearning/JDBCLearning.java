package DataBaseConnectionLearning;

import java.sql.*;

public class JDBCLearning {

	public static void main(String[] args) {

		try {

			// Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeereports", "root",
					"student99");

			Statement myStatement = con.createStatement();

			ResultSet rs = myStatement.executeQuery("Select * from employeedetails");

			while (rs.next()) {
				System.out.print(rs.getString("RegNo") + " ");
				System.out.print(rs.getString("FirstName") + " ");
				System.out.print(rs.getString("LastName") + " ");
				System.out.print(rs.getString("City") + " ");
				System.out.print(rs.getString("Pincode") + " ");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
