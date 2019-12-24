package com.sql.connect;

import java.util.ResourceBundle;

public class DB_Base_Connect_Param {

	// 从文件中读取成员连接的基本配置(后续应该扩展老师,学生,以及管理员三类的配置)
	private static ResourceBundle bundle = ResourceBundle.getBundle("dbinfo");
	// 学生默认权限账号
	private static String Student_ID = bundle.getString("Student_ID");
	private static String Student_PW = bundle.getString("Student_PW");
	// 教师默认权限账号
	private static String Teacher_ID = bundle.getString("Teacher_ID");
	private static String Teacher_PW = bundle.getString("Teacher_PW");
	// 系统默认权限账号
	private static String System_ID = bundle.getString("System_ID");
	private static String System_PW = bundle.getString("System_PW");
	// 教师\学生\系统三类人群默认创建的连接数
	private static String Demo_Connection_Teacher = bundle.getString("Demo_Connection_Teacher");
	private static String Demo_Connection_Student = bundle.getString("Demo_Connection_Student");
	private static String Demo_Connection_System = bundle.getString("Demo_Connection_System");

	public static String get_Student_ID() {
		return Student_ID;
	}

	public static String get_Student_PW() {
		return Student_PW;
	}

	public static String get_Teacher_ID() {
		return Student_ID;
	}

	public static String get_Teacher_PW() {
		return Student_PW;
	}

	public static String get_System_ID() {
		return Student_ID;
	}

	public static String get_System_PW() {
		return Student_PW;
	}

	public static int get_Max_Connection_Teacher() {
		return Integer.parseInt(Demo_Connection_Teacher);

	}

	public static int get_Max_Connection_Student() {
		return Integer.parseInt(Demo_Connection_Student);

	}

	public static int get_Max_Connection_System() {
		return Integer.parseInt(Demo_Connection_System);

	}
}
