package com.own.practice;

public class Students_Hashmap {

	private String student_id;
	private String last_name;
	private String first_name;
	private String age;
	private String address_id;

	public Students_Hashmap(String student_id, String last_name, String first_name, String age, String address_id) {
		this.student_id = student_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.age = age;
		this.address_id = address_id;

	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	




}
