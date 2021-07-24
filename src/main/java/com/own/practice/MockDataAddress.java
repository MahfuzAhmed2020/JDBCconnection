package com.own.practice;

public class MockDataAddress {


	private String ID;
	private String JobTitle;
	private String EmailAddress;
	private String FirstNameLastName;
	private String Salary;

	public MockDataAddress(String ID, String JobTitle, String EmailAddress, String FirstNameLastName,String Salary) {
		this.ID = ID;
		this.JobTitle = JobTitle;
		this.EmailAddress = EmailAddress;
		this.FirstNameLastName = FirstNameLastName;
		this.Salary=Salary;
     //System.out.println(ID+"  "+JobTitle+"  "+EmailAddress+"  "+FirstNameLastName+"  "+Salary);
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
