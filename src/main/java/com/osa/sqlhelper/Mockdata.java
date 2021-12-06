package com.osa.sqlhelper;

public class Mockdata {
	private String ID;
	private String JobTitle;
	private String EmailAddress;
	private String FirstNameLastName;
	private String Salary;
	
	public Mockdata(String iD, String jobTitle, String emailAddress, String firstNameLastName, String salary) {
		ID = iD;
		JobTitle = jobTitle;
		EmailAddress = emailAddress;
		FirstNameLastName = firstNameLastName;
		Salary = salary;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getFirstNameLastName() {
		return FirstNameLastName;
	}
	public void setFirstNameLastName(String firstNameLastName) {
		FirstNameLastName = firstNameLastName;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	



}
