package com.own.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_07072021_practice_Mocadata {

	public static void main(String[] args) {
		//String[][] a = getJdbcData("jdbc:mysql://localhost:3306/osa", AppContainsDemo.USERNAME, AppContainsDemo.PASSWORD,AppContainsDemo.QUERY );//"SELECT * FROM mockdata;"
		String[][] b=getJdbcData(AppContainsDemo.QUERY);
		// jdbcDataInsert("jdbc:mysql://localhost:3306/osa", "root", "","INSERT INTO Address (street,city,zip) values('bjs','whitestone', 9999);");
}

	public static String[][] getJdbcData(String dbUrl, String username, String password, String query) {
		String[][] value = null;
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		// String dbUrl = "jdbc:mysql://localhost:3306/osa";
		// Database Username
		// String username = "root";
		// Database Password
		// String password = "";
		// Query to Execute
		// String query = "select * from Address;";
		try {
			// Create Connection to DB
			Connection con;
			con = DriverManager.getConnection(dbUrl, username, password);

			// Create Statement Object
			Statement stmt = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs = stmt.executeQuery(query);
			
			value = new String[2000][500];
			// While Loop to iterate through all data and print results
			int count = 0;
			while (rs.next()) {
				String ID = rs.getString("ID");
				String JobTitle = rs.getString("JobTitle");
				String EmailAddress = rs.getString("EmailAddress");
				String FirstNameLastName = rs.getString("FirstNameLastName");
				String Salary = rs.getString("Salary");
				// System.out.println(address_id + " " + street + " " + city + " " + zip );
				// String timeLog = rs.getString(5);
				// System.out.println(street+" "+zip);
				value[count][0] = ID;
				value[count][1] = JobTitle;
				value[count][2] = EmailAddress;
				value[count][3] = FirstNameLastName;
				value[count][4] = Salary;
				count++;
				// System.out.println(street+" "+zip);
				System.out.println(ID + "  " + JobTitle + "     " + EmailAddress + "     " + FirstNameLastName+"  "+Salary);
			//	System.out.println(ID + "  "  + "     "  + "     " + "  "+Salary);
				
			}

			// closing DB Connection
			con.close();
		} catch (Exception e) {

		}

		return value;
	}
	public static String[][] getJdbcData(  String query) {
		String[][] value = null;
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		 String dbUrl = "jdbc:mysql://localhost:3306/osa";
		// Database Username
		String username = "root";
		// Database Password
		 String password = "";
		// Query to Execute
		// String query = "select * from Address;";
		try {
			// Create Connection to DB
			Connection con;
			con = DriverManager.getConnection(dbUrl, username, password);

			// Create Statement Object
			Statement stmt = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs = stmt.executeQuery(query);
			
			value = new String[5000][500];
			// While Loop to iterate through all data and print results
			int count = 0;
			while (rs.next()) {
				String ID = rs.getString("ID");
				String JobTitle = rs.getString("JobTitle");
				String EmailAddress = rs.getString("EmailAddress");
				String FirstNameLastName = rs.getString("FirstNameLastName");
				String Salary = rs.getString("Salary");
				// System.out.println(address_id + " " + street + " " + city + " " + zip );
				// String timeLog = rs.getString(5);
				// System.out.println(street+" "+zip);
				value[count][0] = ID;
				value[count][1] = JobTitle;
				value[count][2] = EmailAddress;
				value[count][3] = FirstNameLastName;
				value[count][4] = Salary;
				count++;
				// System.out.println(street+" "+zip);
				System.out.println(ID + "  " + JobTitle + "     " + EmailAddress + "     " + FirstNameLastName+"  "+Salary);
			//	System.out.println(ID + "  "  + "     "  + "     " + "  "+Salary);
				
			}

			// closing DB Connection
			con.close();
		} catch (Exception e) {

		}

		return value;
	}

	public static void jdbcDataInsert(String dbUrl, String username, String password, String query) {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		// String dbUrl = "jdbc:mysql://localhost:3306/osa";
		// Database Username
		// String username = "root";
		// Database Password
		// String password = "";
		// Query to Execute
		// String query = "select * from Address;";
		// Query to Execute write data in database
		// query = "select * from Address;";
		// INSERT INTO Address (street,city,zip) values('587 fulton st','elmhurst', 2);
		// Create Connection to DB
		Connection con;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
			// Create Statement Object
			Statement stmt = con.createStatement();
			// Write in SQL Query. Store results in ResultSet
			boolean rs = stmt.execute(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
