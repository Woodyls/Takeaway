package com.sql.inquire;

import java.util.ResourceBundle;

public class Inquire_Command {

	private static ResourceBundle bundle = ResourceBundle.getBundle("SQL_Command");
	private static String SQL_Student = bundle.getString("sql_student");
	private static String SQL_Teacher = bundle.getString("sql_teacher");
	private static String SQL_System = bundle.getString("sql_system");
	// private static String DB_URL = bundle.getString("DB_URL");

	public static String Select_Student() {
		return SQL_Student;
	}

	public static String Select_Teacher() {
		return SQL_Teacher;
	}

	public static String SELECT_System() {
		return SQL_System;
	}
}
