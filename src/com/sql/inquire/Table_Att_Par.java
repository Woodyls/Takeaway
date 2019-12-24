package com.sql.inquire;

import java.util.ResourceBundle;

public class Table_Att_Par {

	// 数据库表属性名信息
	private static ResourceBundle bundle = ResourceBundle.getBundle("Table_inf");
	private static String Student_ID = bundle.getString("Student_ID");
	private static String Teacher_ID = bundle.getString("Teacher_ID");
	private static String System_ID = bundle.getString("System_ID");
	private static String Student_PW = bundle.getString("Student_PW");
	private static String Teacher_PW = bundle.getString("Teacher_PW");
	private static String System_PW = bundle.getString("System_PW");
	private static String Student_Name = bundle.getString("Student_Name");
	private static String Student_Class = bundle.getString("Student_Class");
	private static String Teacher_Name = bundle.getString("Teacher_Name");
	private static String Teacher_Ttro = bundle.getString("Teacher_Ttro");
	private static String Score_Sno = bundle.getString("Score_Sno");
	private static String Score_Cosno = bundle.getString("Score_Cosno");
	private static String Score_Score = bundle.getString("Score_Score");
	private static String Course_ID = bundle.getString("Course_ID");
	private static String Course_name = bundle.getString("Course_name");

	public static String Student_ID() {
		return Student_ID;
	}

	public static String Teacher_ID() {
		return Teacher_ID;
	}

	public static String System_ID() {
		return System_ID;
	}

	public static String Student_PW() {
		return Student_ID;
	}

	public static String Teacher_PW() {
		return Teacher_ID;
	}

	public static String System_PW() {
		return System_ID;
	}

	public static String Student_Name() {
		return Student_Name;
	}

	public static String Student_Class() {
		return Student_Class;
	}

	public static String Teacher_Name() {
		return Teacher_Name;
	}

	public static String Teacher_Ttro() {
		return Teacher_Ttro;
	}

	public static String Score_Sno() {
		return Score_Sno;
	}

	public static String Score_Cosno() {
		return Score_Cosno;
	}

	public static String Score_Score() {
		return Score_Score;
	}

	public static String Course_ID() {
		return Course_ID;
	}

	public static String Course_name() {
		return Course_name;
	}
}
