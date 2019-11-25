package com.sql.inquire;

import java.util.ResourceBundle;

public class Inquire_Command {

	private static ResourceBundle bundle = ResourceBundle.getBundle("SQL_Command");
	private static String SELECT_STUDENT = bundle.getString("select_student");
	// private static String DB_URL = bundle.getString("DB_URL");

	public static String SELECT_STUDENT() {
		return SELECT_STUDENT;
	}
}
