package com.sql.connectTest;

import java.util.ResourceBundle;

public class TestProperties {

	public void test() {
		String JDBC_DRIVER;
		String DB_URL;
		ResourceBundle bundle = ResourceBundle.getBundle("ConnectStyle");
		JDBC_DRIVER = bundle.getString("JDBC_DRIVER");
		DB_URL = bundle.getString("DB_URL");
		System.out.println(JDBC_DRIVER + "  " + DB_URL);
	}
}
