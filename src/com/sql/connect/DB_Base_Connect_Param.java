package com.sql.connect;

import java.util.ResourceBundle;

public class DB_Base_Connect_Param {

	// 从文件中读取成员连接的基本配置(后续应该扩展老师,学生,以及管理员三类的配置)
	private static ResourceBundle bundle = ResourceBundle.getBundle("dbinfo");
	private static String user = bundle.getString("user");
	private static String password = bundle.getString("password");

	public static String get_user() {
		return user;
	}

	public static String get_password() {
		return password;
	}
}
