package com.sql.connect;

import java.util.ResourceBundle;

public class ConnectInformation {

	private static ResourceBundle bundle = ResourceBundle.getBundle("ConnectStyle");
	private static String JDBC_DRIVER = bundle.getString("JDBC_DRIVER");
	private static String DB_URL = bundle.getString("DB_URL");

	public static String get_JDBC_DRIVER() {
		return JDBC_DRIVER;
	}

	public static String get_DB_URL() {
		return DB_URL;
	}
}
