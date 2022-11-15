package com.own.practice;

public class Name_HashMap {
	public Name_HashMap(String roll_No, String lastName, String firstName) {
		super();
		Roll_No = roll_No;
		LastName = lastName;
		FirstName = firstName;
	}

	public String getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	private String Roll_No;
	private String LastName;
	private String FirstName;

}
