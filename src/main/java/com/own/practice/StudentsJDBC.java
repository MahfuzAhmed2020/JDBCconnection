package com.own.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class StudentsJDBC {
	public static void main(String[] args) {
		HashMap<Integer, Students_Hashmap> map = StudentsJDBC.getAddress();
		System.out.println("********HashMap<Integer, Students_Hashmap> map = StudentsJDBC.getAddress();*********Map.Entry<Integer, Students_Hashmap> entry : map.entrySet()*********");
		for (Map.Entry<Integer, Students_Hashmap> entry : map.entrySet()) {
			System.out.println(
					entry.getKey() + " " + entry.getValue().getStudent_id() + " " + entry.getValue().getLast_name() + " "
							+ entry.getValue().getFirst_name() + " " + entry.getValue().getAge()+ " " + entry.getValue().getAddress_id());
		}
		System.out.println("****************Integer i : map.keySet()***************");

		for (Integer i : map.keySet()) {
			System.out.println("key: " + i + " value: " + map.get(i).getStudent_id() + " " + map.get(i).getLast_name()
					+ " " + map.get(i).getFirst_name() + " " + map.get(i).getAge()+ " " + map.get(i).getAddress_id());
		}

		System.out.println("*********HashMap<Integer, MockDataAddress> map1 = JDBC_With_HashMap.getMockdata();*********Map.Entry<Integer, MockDataAddress> entry : map1.entrySet()*********");
		HashMap<Integer, MockDataAddress> map1 = JDBC_With_HashMap.getMockdata();
		for (Map.Entry<Integer, MockDataAddress> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getID() + " " + entry.getValue().getJobTitle()
					+ " " + entry.getValue().getEmailAddress() + " " + entry.getValue().getFirstNameLastName() + " "
					+ entry.getValue().getSalary());
		}
		System.out.println("*******************Integer i : map1.keySet()*****************************");
//        for (Integer i : map1.keySet()) {
//			System.out.println("key: " + i + " value: " + map1.get(i).getID() + " " + map1.get(i).getJobTitle() + " "
//					+ map1.get(i).getEmailAddress() + "  " + map1.get(i).getFirstNameLastName() + " "
//					+ map1.get(i).getSalary());
//		}

	}

	/**
	 * This method will retrieve data from the address datatable
	 * 
	 * @return
	 */
	public static HashMap<Integer, Students_Hashmap> getAddress() {
		HashMap<Integer, Students_Hashmap> map = new HashMap<Integer, Students_Hashmap>();
		try {
			int key = 0;
			ResultSet rs = JDBC_With_HashMap.getValueFromSQLTable("select * from students;");
			while (rs.next()) {
				map.put(key, new Students_Hashmap(rs.getString("student_id"), rs.getString("last_name"),
						rs.getString("first_name"), rs.getString("age"),rs.getString("address_id")));
				key++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return map;
	}

	/**
	 * This method will retrieve data from the mockdata datatable
	 * 
	 * @return
	 */
	public static HashMap<Integer, MockDataAddress> getMockdata() {
		HashMap<Integer, MockDataAddress> hp = new HashMap<Integer, MockDataAddress>();
		try {
			int key = 0; // "select * from mockdata;" // "select * from Address;"
			ResultSet rs = JDBC_With_HashMap.getValueFromSQLTable("select * from mockdata;");
			while (rs.next()) {
				hp.put(key, new MockDataAddress(rs.getString("ID"), rs.getString("JobTitle"),
						rs.getString("EmailAddress"), rs.getString("FirstNameLastName"), rs.getString("Salary")));
				key++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return hp;
	}

	public static ResultSet getValueFromSQLTable(String query) {
		ResultSet rs = null;
		try {
			// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
			String dbUrl = "jdbc:mysql://localhost:3306/osa";
			// Database Username
			String username = "root";
			// Database Password
			String password = "";

			// Create Connection to DB
			Connection con = DriverManager.getConnection(dbUrl, username, password);

			// Create Statement Object
			Statement stmt = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			rs = stmt.executeQuery(query);

		} catch (Exception e) {

		}
		return rs;
	}

}
