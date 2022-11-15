package com.own.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class JDBC_With_HashMap {
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
		
		HashMap<Integer, Address_HashMap> map1 = JDBC_With_HashMap.getAddress();
		System.out.println("********HashMap<Integer, Address_HashMap> map = JDBC_With_HashMap.getAddress();*********Map.Entry<Integer, Address_HashMap> entry : map.entrySet()*********");
		for (Map.Entry<Integer, Address_HashMap> entry : map1.entrySet()) {
			System.out.println(
					entry.getKey() + " " + entry.getValue().getAddress_id() + " " + entry.getValue().getStreet() + " "
							+ entry.getValue().getCity() + " " + entry.getValue().getZip());
		}
		System.out.println("****************Integer i : map.keySet()***************");

		for (Integer i : map1.keySet()) {
			System.out.println("key: " + i + " value: " + map1.get(i).getAddress_id() + " " + map1.get(i).getStreet()
					+ " " + map1.get(i).getCity() + " " + map1.get(i).getZip());
		}

		System.out.println("*********HashMap<Integer, MockDataAddress> map1 = JDBC_With_HashMap.getMockdata();*********Map.Entry<Integer, MockDataAddress> entry : map1.entrySet()*********");
		HashMap<Integer, MockDataAddress> map11 = JDBC_With_HashMap.getMockdata();
		for (Map.Entry<Integer, MockDataAddress> entry : map11.entrySet()) {
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
	public static HashMap<Integer, Address_HashMap> getAddress() {
		HashMap<Integer, Address_HashMap> map = new HashMap<Integer, Address_HashMap>();
		try {
			int key = 0;
			ResultSet rs = JDBC_With_HashMap.getValueFromSQLTable("select *  from Address;");
			while (rs.next()) {
				map.put(key, new Address_HashMap(rs.getString("address_id"), rs.getString("street"),
						rs.getString("city"), rs.getString("zip")));
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
			String dbUrl = "jdbc:mysql://localhost:3306/osa"; //127.0.0.1
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
