package com.osa.sqlhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Common {
	public static void main(String[] args) {
		getValueFromSQLTable("select *  from Address;");
		
	}
	private String address_id;
	private String street;
	private String city;
	private String zip;
	public Common(String address_id, String street, String city, String zip) {
		
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
public Common( String street, String city, String zip) {
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	public static HashMap<Integer, Address> getAddress() {
		HashMap<Integer, Address> map= new 	HashMap<Integer, Address>();
		try {
			int key=0;
			ResultSet rs =Common.getValueFromSQLTable("select *  from Address;");
			while(rs.next()) {
				map.put(key, new Address(
						rs.getString("address_id"),
						rs.getString("street"),
						rs.getString("city"),
						rs.getString("zip")));
				key++;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				}
		return map;
	}
	
	
	public static HashMap<Integer, Address> getMockdata() {
		HashMap<Integer, Address> hp=null;
		
		
		return hp;
	}
	
	
	

	public static ResultSet getValueFromSQLTable(String query) {
		ResultSet rs = null;
		try {
			HashMap<String, Common> hm = new HashMap<String, Common>();
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3306/osa";					
		//Database Username		
		String username = "root";	
		//Database Password		
		String password = "";				

   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
    	Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
 		 rs= stmt.executeQuery(query);
 		 while (rs.next()) {
 	         hm.put(rs.getString("address_id"),new Common(
						//rs.getString("address_id"),
						rs.getString("street"),
						rs.getString("city"),
						rs.getString("zip")));
 	        if(!hm.isEmpty()) {
 		         Iterator it = hm.entrySet().iterator();
 		         while(it.hasNext()) {
 		            Map.Entry obj = (Entry)it.next();
 		            System.out.println(obj.getValue());
 		         }
 		      }
 	      }
 		
 	     // System.out.println(hm);

 	      }catch(Exception e) {
			
		}
		return rs;
	}


}
