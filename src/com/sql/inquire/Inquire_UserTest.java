package com.sql.inquire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.character.Student;

public class Inquire_UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInquire() {
		// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=GMT";
		// Connection conn = null;

		// Statement执行数据库语句操作
		java.sql.Statement stmt = null;
		// 数据库连接对象
		Connection conn = null;
		// 数据库结果返回对象
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DB_URL, "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student stu = new Student("test1", "12346");

		Inquire_User.inquire(stu, conn);
	}

}
