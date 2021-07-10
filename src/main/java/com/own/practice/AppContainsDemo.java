package com.own.practice;


import com.propertyfilereader.osa.PropertyFileReaderDemo;

public interface AppContainsDemo {
	public static final String BROWSER =PropertyFileReaderDemo.getProValue("browser");
	public static final String QUERY =PropertyFileReaderDemo.getProValue("query");
	public static final String PASSWORD =PropertyFileReaderDemo.getProValue("password");
	public static final String USERNAME =PropertyFileReaderDemo.getProValue("username");

}
