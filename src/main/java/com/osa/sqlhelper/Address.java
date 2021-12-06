package com.osa.sqlhelper;

public class Address {
	private String address_id;
	private String street;
	private String city;
	private String zip;
	public Address(String address_id, String street, String city, String zip) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	


}
